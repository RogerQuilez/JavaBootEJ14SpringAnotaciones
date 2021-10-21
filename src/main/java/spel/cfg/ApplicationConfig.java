package spel.cfg;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spel.entity.Computer;
import spel.entity.Monitor;
import spel.entity.PlacaBase;
import spel.entity.Procesador;
import spel.entity.Ram;
import spel.entity.Raton;
import spel.entity.TarjetaGrafica;
import spel.entity.Teclado;
import spel.marcas.Marca;
import spel.repository.OrdenadorRepository;
import spel.repository.impl.OrdenadorRepositoryImpl;
import spel.service.OrdenadorService;
import spel.service.impl.OrdenadorServiceImpl;
import utils.Util;

@Configuration
public class ApplicationConfig {

	/* Computer Object */
	@Bean
	public Computer computer() {
		Computer computer = new Computer();
		computer.setMarca(Util.getRandomMarca(Marca.getMarcaOrdenadores()));
		return computer;
	}
	
	/* Rams Objects */
	@Bean
	public Ram ram1() {
		Ram ram = new Ram();
		ram.setPrecio(Util.generateRandomNumber(200, 600));
		ram.setHz(44);
		ram.setGeneracion("10");
		return ram;
	}
	
	@Bean
	public Ram ram2() {
		Ram ram = new Ram();
		ram.setPrecio(Util.generateRandomNumber(100, 500));
		ram.setHz(44);
		ram.setGeneracion("10");
		return ram;
	}
	
	@Bean
	public Ram ram3() {
		Ram ram = new Ram();
		ram.setPrecio(Util.generateRandomNumber(200, 400));
		ram.setHz(44);
		ram.setGeneracion("10");
		return ram;
	}
	
	@Bean
	public Ram ram4() {
		Ram ram = new Ram();
		ram.setPrecio(Util.generateRandomNumber(50, 70));
		ram.setHz(44);
		ram.setGeneracion("10");
		return ram;
	}
	
	/* List Ram */
	@Bean
	public List<Ram> listRam(@Qualifier("ram1") Ram ram, @Qualifier("ram2") Ram ram2) {
		return List.of(ram, ram2);
	}
	
	/* Procesador Object */
	@Bean
	public Procesador procesador() {
		Procesador procesador = new Procesador();
		procesador.setMarca(Util.getRandomMarca(Marca.getMarcaProcesadores()));
		procesador.setPrecio(Util.generateRandomNumber(500, 600));
		procesador.setHz(75);
		return procesador;
	}
	
	/* Graficas Objects */
	@Bean
	public TarjetaGrafica grafica1(@Qualifier("ram3") Ram ram) {
		TarjetaGrafica grafica = new TarjetaGrafica();
		grafica.setMarca(Util.getRandomMarca(Marca.getMarcaGraficas()));
		grafica.setModelo("GTX1060");
		grafica.setRam(ram);
		grafica.setPrecio(Util.generateRandomNumber(500, 1000));
		return grafica;
	}
	
	@Bean
	public TarjetaGrafica grafica2(@Qualifier("ram4") Ram ram) {
		TarjetaGrafica grafica = new TarjetaGrafica();
		grafica.setMarca(Util.getRandomMarca(Marca.getMarcaGraficas()));
		grafica.setModelo("GTX3000");
		grafica.setRam(ram);
		grafica.setPrecio(Util.generateRandomNumber(700, 1200));
		return grafica;
	}
	
	/* List Graficas */
	@Bean
	public List<TarjetaGrafica> listGraficas(@Qualifier("grafica1") TarjetaGrafica grafica1, 
			@Qualifier("grafica2") TarjetaGrafica grafica2) {
		return List.of(grafica1, grafica2);
	}
	
	/* Perifericos Objects */
	@Bean 
	public Monitor monitor() {
		Monitor monitor = new Monitor();
		monitor.setPrecio(Util.generateRandomNumber(50, 200));
		monitor.setMarca(Util.getRandomMarca(Marca.getMarcaPerifericos()));
		monitor.setHz(75);
		monitor.setTamaño(23);
		return monitor;
	}
	
	@Bean 
	public Raton raton() {
		Raton raton = new Raton();
		raton.setPrecio(Util.generateRandomNumber(50, 200));
		raton.setMarca(Util.getRandomMarca(Marca.getMarcaPerifericos()));
		raton.setPeso(12);
		raton.setBotones(10);
		raton.setInalambrico(true);
		return raton;
	}
	
	@Bean
	public Teclado teclado() {
		Teclado teclado = new Teclado();
		teclado.setPrecio(Util.generateRandomNumber(50, 200));
		teclado.setMarca(Util.getRandomMarca(Marca.getMarcaPerifericos()));
		teclado.setTipo("Mecánico");
		return teclado;
	}
	
	/* PlacaBase Object */
	@Bean
	public PlacaBase placaBase() {
		PlacaBase placaBase = new PlacaBase();
		placaBase.setMarca(Util.getRandomMarca(Marca.getMarcaPlacasBase()));
		placaBase.setModel("10");
		placaBase.setPrecio(Util.generateRandomNumber(100, 200));
		return placaBase;
	}
	
	/* OrdenadorService Object */
	@Bean
	public OrdenadorService ordenadorService() {
		OrdenadorService ordenadorService = new OrdenadorServiceImpl();
		return ordenadorService;
	}
	
	/* OrdenadorRepository Object */
	@Bean
	public OrdenadorRepository ordenadorRepository() {
		OrdenadorRepository ordenadorRepository = new OrdenadorRepositoryImpl();
		return ordenadorRepository;
	}
}

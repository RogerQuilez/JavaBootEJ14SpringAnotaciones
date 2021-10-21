package spel.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spel.cfg.ApplicationConfig;
import spel.entity.Computer;
import spel.service.OrdenadorService;
import spel.service.impl.OrdenadorServiceImpl;

public class Main {

	public static ApplicationContext context = null;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Computer computer = context.getBean("computer", Computer.class);
		computer.setPrecio(computer.getTotalPriceComponents());
		
		System.out.println(computer);
		
		OrdenadorService ordenadorService = context.getBean("ordenadorService", OrdenadorServiceImpl.class);
		
		System.out.println(ordenadorService.guardarOrdenador(computer));
	}
}

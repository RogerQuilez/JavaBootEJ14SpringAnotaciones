package spel.marcas;

import java.util.Arrays;
import java.util.List;

public class Marca {
	
	private static final List<String> MARCA_ORDENADORES =
			Arrays.asList("HP", "Asus", "Dell", "Acer");
	
	private static final List<String> MARCA_PROCESADORES =
			Arrays.asList("AMD", "Intel", "CML", "NXP");
	
	private static final List<String> MARCA_GRAFICAS =
			Arrays.asList("AMD", "Nvidia");
	
	private static final List<String> MARCA_PERIFERICOS =
			Arrays.asList("Asus", "Acer", "BenQ", "Dell");
	
	private static final List<String> MARCA_PLACAS_BASE =
			Arrays.asList("AsRock", "ASUS", "Biostar", "Intell");

	public static List<String> getMarcaOrdenadores() {
		return MARCA_ORDENADORES;
	}

	public static List<String> getMarcaProcesadores() {
		return MARCA_PROCESADORES;
	}

	public static List<String> getMarcaGraficas() {
		return MARCA_GRAFICAS;
	}

	public static List<String> getMarcaPerifericos() {
		return MARCA_PERIFERICOS;
	}

	public static List<String> getMarcaPlacasBase() {
		return MARCA_PLACAS_BASE;
	}	

}

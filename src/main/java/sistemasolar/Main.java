package sistemasolar;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Planeta> planetas = new ArrayList<Planeta>();
		SistemaSolar sistema = new SistemaSolar(planetas);
		sistema.MostrarInfoPlanetas(sistema.PoblarSistemaSolar());
		sistema.MostrarInfoPlanetasyLunas(sistema.PoblarSistemaSolar());		
	}

}

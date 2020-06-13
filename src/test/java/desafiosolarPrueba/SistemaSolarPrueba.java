package desafiosolarPrueba;

import sistemasolar.*;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class SistemaSolarPrueba {

	private static Logger logger = Logger.getLogger("sistemasolar.SistemaSolar");
	private final SistemaSolar sistSolar = new SistemaSolar();
	List<Planeta> planetas = sistSolar.PoblarSistemaSolar();

	@Test
	public void testCantidadLunasPlanetas() {
		// debe probar: las cantidades de Lunas por planeta (utilice assertEquals)
		logger.info("Ejecución prueba: testCantidadLunasPlanetas");
		int cont = 0;
		for (Planeta p : planetas) {
			if (p.getNombre()=="La Tierra") {
				cont = p.getLuna().size();
				assertEquals(1, cont);
			}
			else if (p.getNombre()=="Marte") {
				cont = p.getLuna().size();
				assertEquals(2, cont);
			}
			else if (p.getNombre()=="Jupiter") {
				cont = p.getLuna().size();
				assertEquals(2, cont);
			}
		}
		
	}

	@Test
	public void testMostrarNombrePlanetas() {
		// los nombre de planetas
		logger.info("Ejecución prueba: testMostrarNombrePlanetas");
		for (Planeta p : planetas) {
			if (p.getNombre().equalsIgnoreCase("La Tierra") || p.getNombre().equalsIgnoreCase("Marte")
					|| p.getNombre().equalsIgnoreCase("Jupiter")) {
				assertTrue(true);
			} else
				assertTrue(false);
		}

	}

	@Test
	public void testLunasInsertadasOK() {
		// sus lunas ingresadas correctamente (utilice assertTrue)
		logger.info("Ejecución prueba: testLunasInsertadasOK");
		for (Planeta p : planetas) {
			if (!p.getLuna().isEmpty()) {
				assertTrue(true);
			} else
				assertTrue(false);
		}
	}

	@Test
	public void testCantidadLunas() {
		// comprobar las cantidades de lunas ¿TOTALES? (utilice assertTrue)
		logger.info("Ejecución prueba: testCantidadLunas");
		int cont = 0;
		for (Planeta p : planetas) {
			cont += p.getLuna().size();
			if(cont >1 || cont <=5) {
				assertTrue(true);
			}
			else
				assertTrue(false);
		}		
	}

}

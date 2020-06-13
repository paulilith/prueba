package sistemasolar;

import java.util.ArrayList;
import java.util.List;

public class SistemaSolar {

	private List<Planeta> planetas;
	
	public SistemaSolar() {
	}

	public SistemaSolar(List<Planeta> planetas) {
		this.planetas = planetas;
	}
	
	public List<Planeta> PoblarSistemaSolar(){
		Luna luna = new Luna("luna",3476,27322); // tierra
		List<Luna> lunasTierra = new ArrayList<Luna>();
		lunasTierra.add(luna);
			
		Luna deimos = new Luna("deimos", 8, 1263); //marte
		Luna phobos = new Luna("phobos", 560, 0.319); //marte
		List<Luna> lunasMarte = new ArrayList<Luna>();
		lunasMarte.add(deimos);
		lunasMarte.add(phobos);
		
		Luna ganymede = new Luna("ganymede", 5276, 7155);//jupiter
		Luna europa = new Luna("europa", 3126, 3551);//jupiter
		List<Luna> lunasJupiter = new ArrayList<Luna>();
		lunasJupiter.add(ganymede);
		lunasJupiter.add(europa);
		
//		Luna titan = new Luna("titan", 5150, 15945);//saturno
//		Luna rhea = new Luna("rhea", 1528, 4518);//saturno
//		Luna titania = new Luna("titania", 1580, 8706);//urano
//		Luna oberon = new Luna("oberon", 1526, 13463);//urano
//		Luna triton = new Luna("triton", 2705, 5877);//neptuno
//		Luna proteus = new Luna("proteus", 420, 1.12);//neptuno
			
//		Planeta mercurio = new Planeta("Mercurio", 4880, "57910000", null);
//		Planeta venus = new Planeta("Venus", 12104, "108200000", null);
		Planeta laTierra = new Planeta("La Tierra", 149600000, "57910000", lunasTierra);
		Planeta marte = new Planeta("Marte", 6794, "227940000", lunasMarte);
		Planeta jupiter = new Planeta("Jupiter", 142984, "778330000", lunasJupiter);
		List<Planeta> planetas = new ArrayList<Planeta>();
		planetas.add(laTierra);
		planetas.add(marte);
		planetas.add(jupiter);
//		Planeta saturno = new Planeta("Saturno", 108728, "1429400000", null);
//		Planeta urano = new Planeta("Urano", 51118, "2870990000", null);
//		Planeta neptuno = new Planeta("Neptuno", 49532, "4504300000", null);
//		Planeta pluton = new Planeta("Pluton", 2320, "5913520000", null);
		return planetas;		
	}
	
	public void MostrarInfoPlanetas(List<Planeta> planetas) {
		for(Planeta p: planetas) {
			System.out.println(p.toString());		
		}		
	}
	
	public void MostrarInfoPlanetasyLunas(List<Planeta> planetas){
		for(Planeta p: planetas) {
			System.out.println(p.toString() + p.luna.toString());		
		}
	}
	
	
}

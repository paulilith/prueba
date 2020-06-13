package sistemasolar;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Planeta implements IPlaneta {
	String nombre;
	int tamanio;
	String distanciaAlSol;
	List<Luna> luna;

	
	public Planeta(String nombre, int tamanio, String distanciaAlSol, List<Luna> lunasTierra) {
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.distanciaAlSol = distanciaAlSol;
		this.luna = lunasTierra;
	}

	public Planeta() {
	}

	public List<Luna> getLuna() {
		return luna;
	}
	
	public void setLuna(ArrayList<Luna> luna) {
		this.luna = luna;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}

	public String getDistanciaAlSol() {
		return distanciaAlSol;
	}

	public void setDistanciaAlSol(String distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}

	public void orbita() {
		System.out.println("Soy el planeta " +this.nombre+ "y estoy orbitando");

	}

	public void rotacion() {
		System.out.println("Soy el planeta " +this.nombre+ "y estoy rotando");

	}

	@Override
	public String toString() {
		return "\n"+StringUtils.capitalize(nombre)  + " está a " + this.distanciaAlSol + " km del sol, su tamaño es de " + this.tamanio +
				 "km de diámetro y tiene " + this.luna.size() + " luna ";
	}	
	

}

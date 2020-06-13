package sistemasolar;

import org.apache.commons.lang3.StringUtils;

public class Luna implements ILuna {
	String nombre;
	int diametro;
	double tiempoOrbita;
	
	public Luna() {
	}

	
	public Luna(String nombre, int diametro, double tiempoOrbita) {
		this.nombre = nombre;
		this.diametro = diametro;
		this.tiempoOrbita = tiempoOrbita;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public double getTiempoOrbita() {
		return tiempoOrbita;
	}

	public void setTiempoOrbita(double tiempoOrbita) {
		this.tiempoOrbita = tiempoOrbita;
	}

	
	@Override
	public String toString() {
		return StringUtils.capitalize(nombre)  + " que mide "+this.diametro +" km de diámetro y el tiempo de órbita es de "+ 
				this.tiempoOrbita+" días.";
	}
	
	
}

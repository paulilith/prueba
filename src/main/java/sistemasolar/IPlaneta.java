package sistemasolar;

import java.util.ArrayList;
import java.util.List;

public interface IPlaneta {
	
	public List<Luna> getLuna();
	
	public void setLuna(ArrayList<Luna> luna);

	public String getNombre();

	public void setNombre(String nombre);

	public int getTamanio();

	public void setTamanio(int tamanio);

	public String getDistanciaAlSol();

	public void setDistanciaAlSol(String distanciaAlSol);
}

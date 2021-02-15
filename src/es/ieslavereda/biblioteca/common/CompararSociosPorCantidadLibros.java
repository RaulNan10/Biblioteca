package es.ieslavereda.biblioteca.common;

import java.util.Comparator;

public class CompararSociosPorCantidadLibros implements Comparator<Persona> {

	@Override
	public int compare(Persona arg0, Persona arg1) {
		
		
		return Integer.compare(arg0.getCantidadLibros(),arg1.getCantidadLibros());
	}
	
	 

}

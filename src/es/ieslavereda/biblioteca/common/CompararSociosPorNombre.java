package es.ieslavereda.biblioteca.common;

import java.util.Comparator;

public class CompararSociosPorNombre implements Comparator<Persona>{

	@Override
	public int compare(Persona arg0, Persona arg1) {
		
		return arg0.getNombre().compareTo(arg1.getNombre());
	}
	
	

	
}

package es.ieslavereda.biblioteca.common;

import java.util.Comparator;

public class OrdenarLibrosPorEjemplares implements Comparator<Libro>{

	@Override
	public int compare(Libro arg0, Libro arg1) {
		
		return Integer.compare(arg0.getSizeLista(),arg1.getSizeLista());
	}
	
	

	
}

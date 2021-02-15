package es.ieslavereda.biblioteca.common;

import java.util.Comparator;

public class OrdenarLibrosPorAutor implements Comparator<Libro> {

	@Override
	public int compare(Libro arg0, Libro arg1) {
		return arg0.getAutor().compareTo(arg1.getAutor());
	}
}

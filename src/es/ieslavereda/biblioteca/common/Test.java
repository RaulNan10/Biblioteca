package es.ieslavereda.biblioteca.common;

import es.ieslavereda.biblioteca.common.*;

public class Test {
	public static void main(String[] args) {

		
		
		Biblioteca b = new Biblioteca("biblio");
		Libro l = new Libro("Cervantes","Don Quijote",0);
		b.addLibro(l);
		b.buscarPorISBN(l.getIsbn())
		
		

		System.out.println(b.mostarEjemplares(l));
	}
}

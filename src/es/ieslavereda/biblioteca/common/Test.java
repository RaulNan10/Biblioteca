package es.ieslavereda.biblioteca.common;

import es.ieslavereda.biblioteca.common.*;

public class Test {
	public static void main(String[] args) {

		
		Biblioteca b = new Biblioteca("biblio");
		Libro l = new Libro("Cervantes","Lincon",123);
		b.addLibro(l);
		Persona a = new Persona("Raul","Nan","123");
		
		Libro p = new Libro("Abraham","Don Quijote",65);
		b.addLibro(p);
		
		Libro q = new Libro("Abkil","Abraham",54);
		b.addLibro(q);
		b.addEjemplares(54, 1);
		
		b.addEjemplares(123, 10);
		b.addEjemplares(65, 2);
		
		

		System.out.println(a.getLibrosPersona());
		System.out.println(b.mostarEjemplares(q));
		a.addPrestado(q, 0);
		System.out.println(a.getLibrosPersona());
		a.devolverPrestado(q, 0);
		System.out.println(b.mostarEjemplares(q));
		System.out.println(a.getLibrosPersona());

//		a.addPrestado(l, 1);
//		a.devolverPrestado(l, 1);
//		System.out.println(a.getLibrosPersona());
		
		

		
		
		

		
		

	}
}

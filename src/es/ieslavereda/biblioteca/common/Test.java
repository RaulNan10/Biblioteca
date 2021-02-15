package es.ieslavereda.biblioteca.common;

import es.ieslavereda.biblioteca.common.*;

public class Test {
	public static void main(String[] args) {

		
		Biblioteca b = new Biblioteca("biblio");
		Libro l = new Libro("Cervantes","Don Quijote",123);
		b.addLibro(l);
		b.addEjemplares(123, 4);

		System.out.println(l.getLista(l));
		
		b.newSocio("Ensaima", "Ferro", "3254gdf");
		b.newSocio("Pablo", "Perea", "dbñldwm54");
		b.newSocio("El", "Preguntas", "ñlfbjhretd");
		
		b.buscarPorDni("3254gdf").addPrestado(l, 0);
		
		System.out.println(b.buscarPorDni("3254gdf").getLibrosPersona());
		

		
		

	}
}

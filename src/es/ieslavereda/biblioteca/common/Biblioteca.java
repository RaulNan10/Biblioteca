package es.ieslavereda.biblioteca.common;

import java.util.ArrayList;

public class Biblioteca {

	private String nombre;
	private ArrayList<Persona> socios = null;
	private ArrayList<Libro> libros = null;

	public Biblioteca(String nombre) {
		this.nombre = nombre;
		this.socios = new ArrayList<Persona>();
		this.libros = new ArrayList<Libro>();
	}

	public void newLibro(String autor, String titulo, int isbn) {
		Libro l = new Libro(autor, titulo, isbn);
		libros.add(l);
	}

	public void newSocio(String nombre, String apellidos, String dni) {
		Persona p = new Persona(nombre, apellidos, dni);
		socios.add(p);

	}
	
	public String mostarEjemplares(Libro l) {
		for(Libro ll : libros) {
			if(ll.getIsbn()==l.getIsbn())
				return ll.getLista(l);
		}
		return null;
	}
	
	public void addLibro(Libro l) {
		libros.add(l);
	}
	public Libro buscarPorISBN(int n) {
		for(Libro l :libros) {
			if(l.getIsbn()==n)
				return l;
			
				
		}
		return null;
	}
	
	public void addEjemplares(int n, int ejemplares) {
		buscarPorISBN(n).addEjemplares(ejemplares);
	}
	
	public boolean prestarEjemplar(Persona p, Libro l) {
		if(p.isSocio()==false) {
			return false;
		}else if()
	}

}

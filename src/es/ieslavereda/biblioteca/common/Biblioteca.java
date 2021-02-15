package es.ieslavereda.biblioteca.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca implements Serializable {

	private String nombre;
	private ArrayList<Persona> socios = null;
	private ArrayList<Libro> libros = null;

	public Biblioteca(String nombre) {
		this.nombre = nombre;
		this.socios = new ArrayList<Persona>();
		this.libros = new ArrayList<Libro>();
	}

	public ArrayList<Persona> getSocios() {
		return socios;
	}

	public void newLibro(String autor, String titulo, int isbn) {
		Libro l = new Libro(autor, titulo, isbn);
		libros.add(l);
	}

	public void addLibro(Libro l) {
		libros.add(l);
	}

	public void newSocio(String nombre, String apellidos, String dni) {
		Persona p = new Persona(nombre, apellidos, dni);
		socios.add(p);

	}

	public String mostarLibros() {
		String txt = "";
		if (libros.size() == 0)
			return null;
		else {
			for (Libro ll : libros) {
				txt += ll.toString();
			}
			return txt;
		}
	}

	public String mostarEjemplares(Libro l) {
		for (Libro ll : libros) {
			if (ll.getIsbn() == l.getIsbn())
				return ll.getLista(l);
		}
		return null;
	}

	public String mostrarSocios() {
		for (Persona p : socios) {
			if (socios.size() > 0)
				return p.getNombre() + " " + p.getApellidos() + " | " + p.getDni() + "\n";
		}
		return null;
	}

	// A�ade ejemplares a un libro a traves de su isbn
	public void addEjemplares(int n, int ejemplares) {
		buscarPorISBN(n).addEjemplares(ejemplares);
	}

	public Libro buscarPorISBN(int n) {
		for (Libro l : libros) {
			if (l.getIsbn() == n)
				return l;

		}
		return null;
	}

	public Persona buscarPorDni(String dni) {
		for (Persona p : socios) {
			if (p.getDni().compareTo(dni) == 0)
				return p;
		}
		return null;
	}

	public boolean prestarEjemplar(Persona p, Libro l, int codigo) {
		if (p.isSocio() == false)
			return false;
		else if (p.getCantidadLibros() > 3)
			return false;
		else if (libros.contains(l) == false)
			return false;
		else if (l.getSizeLista() == 0)
			return false;
		else {
			p.addPrestado(l, codigo);
			return true;
		}

	}
	
	
	public void ordenarPersonaNombre() {
		 Collections.sort(socios,new CompararSociosPorNombre());
	}
	
	public void ordenarPersonaLibros() {
		 Collections.sort(socios,new CompararSociosPorCantidadLibros());
	}
	
	public void ordenarLibrosPorTitulo() {
		Collections.sort(libros, new OrdenarLibrosPorTitulo());
	}
	
	public void ordenarLibrosPorEjemplares() {
		Collections.sort(libros, new OrdenarLibrosPorEjemplares());
	}
	

}

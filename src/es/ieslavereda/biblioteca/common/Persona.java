package es.ieslavereda.biblioteca.common;

import java.util.*;

public class Persona {

	private String nombre;
	private String apellidos;
	private String dni;
	private int cantidadLibros;
	private boolean socio;
	private ArrayList<Ejemplar> librosPersona;

	public Persona(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.cantidadLibros = cantidadLibros;
		this.socio = false;
		this.librosPersona = new ArrayList<Ejemplar>();
	}

	public void addPrestado(Libro l, int codigo) {
		librosPersona.add(l.buscarPorCodigo(codigo));
		l.buscarPorCodigo(codigo).setaQuien(this);
	}

	public void devolverPrestado(Libro l, int codigo) {
		l.buscarPorCodigo(codigo).setaQuien(null);
		librosPersona.remove(l.buscarPorCodigo(codigo));
	}

	public boolean serSocio() {
		socio = true;

		return socio;
	}

	public int getCantidadLibros() {
		return cantidadLibros;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public boolean isSocio() {
		return socio;
	}

	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}

	public ArrayList<Ejemplar> getLibrosPersona() {
		return librosPersona;
	}

	@Override
	public String toString() {
		return nombre + " " + apellidos  + "\t" + " | " + dni + "\n";
	}

}

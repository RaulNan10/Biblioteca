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
		this.librosPersona = null;
	}
	
	public void addEjemplar(Libro l, int codigo) {
		librosPersona.add(new Ejemplar(l,codigo));
	}
	
	
	public boolean serSocio() {
		socio = true;
		
		return socio; 
	}

	public int getCantidadLibros() {
		return cantidadLibros;
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
	
	
	
	

	

	
}


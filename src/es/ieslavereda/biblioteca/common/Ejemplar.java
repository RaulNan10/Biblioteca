package es.ieslavereda.biblioteca.common;

import java.util.ArrayList;

public class Ejemplar {

	private Persona aQuien;
	private int codigo;
	private Libro l;

	public Ejemplar(Libro l, int codigo) {
		this.l = l;
		this.aQuien = null;
		this.codigo = codigo;

	}

	@Override
	public String toString() {
		return "Titulo: " + l.getTitulo() + " Ejemplar: " + codigo;
	}

	public Persona getaQuien() {
		return aQuien;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setaQuien(Persona aQuien) {
		this.aQuien = aQuien;
	}

	
	

}

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
		return "Ejemplar [aQuien=" + aQuien + ", codigo=" + codigo;
	}

	public Persona getaQuien() {
		return aQuien;
	}

	public int getCodigo() {
		return codigo;
	}

	

}

package es.ieslavereda.biblioteca.common;

import java.util.*;

public class Libro {

	private String autor;
	private String titulo;
	private int isbn;
	private ArrayList<Ejemplar> lista;
	private int disponibles;

	public Libro(String autor, String titulo, int isbn) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.isbn = isbn;
		lista = new ArrayList<Ejemplar>();
		this.disponibles = 0;

	}

	public int getSizeLista() {
		return lista.size();
	}

	public void setDisponibles(int disvoidponibles) {
		this.disponibles = disponibles;
	}

	public int getDisponibles() {
		return disponibles;
	}

	public int getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", isbn=" + isbn + ", lista=" + lista + ", disponibles="
				+ disponibles + "]" + "\n";
	}

	public String getLista(Libro l) {
		String txt = "";
		for (Ejemplar e : lista) {
			txt += "Titulo: " + l.titulo + " Prestado: " + e.getaQuien() + "| " + "Codigo:" + e.getCodigo() + "\n";
		}
		return txt;
	}

	public void addEjemplar() {
		this.lista.add(new Ejemplar(this, lista.size()));
		disponibles++;
	}
	


	public void addEjemplares(int cantidad) {
		for (int i = 0; i < cantidad; i++)
			addEjemplar();

	}

}

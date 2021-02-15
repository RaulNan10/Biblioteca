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
		this.disponibles = lista.size();

	}

	public int getSizeLista() {
		return lista.size();
	}

	public void setDisponibles(int disponibles) {
		this.disponibles = disponibles;
	}

	public int getDisponibles() {
		return disponibles;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getIsbn() {
		return isbn;
	}

	public Ejemplar buscarPorCodigo(int codigo) {
		for (Ejemplar e : lista) {
			if (e.getCodigo() == codigo)
				return e;
		}
		return null;
	}

	@Override
	public String toString() {
		return "Autor: " + autor + ", titulo: " + titulo + ", isbn: " + isbn + "\n";
	}

	// Devuelve la lista de ejemplares de un libro(l)
	public String getLista(Libro l) {
		String txt = "";
		for (Ejemplar e : lista) {
			txt += "Titulo: " + l.titulo + "|" + " Prestado: " + e.getaQuien() + "| " + "Codigo:" + e.getCodigo()
					+ "\n";
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

	public void devolverEjemplar(int codigo) {
		this.buscarPorCodigo(codigo).devolver();
	}

	@Override
	public boolean equals(Object obj) {
		Libro l;
		if (obj instanceof Libro) {
			l = (Libro)obj;
			if (l.getIsbn()==this.getIsbn()) {
				return true;
			}
		}
		return false;
		
		
	}

}

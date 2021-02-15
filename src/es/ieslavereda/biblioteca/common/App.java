package es.ieslavereda.biblioteca.common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class App {

	public static void main(String[] args) throws IOException {

		Biblioteca b = new Biblioteca("Biblioteca IES la Vereda");
		b = cargar(b);
		mostrarMenu(b);
	}

	public static void mostrarMenu(Biblioteca b) throws IOException {

		int aux = 0;
		int aux2 = 0;
		int option = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("\t" + "Bienvenido a la Biblioteca IES la Vereda");
		System.out.println("¿Qué quieres hacer?");

		System.out.println("1. Crear un nuevo socio");
		System.out.println("2. Crear un libro");
		System.out.println("3. Añadir ejemplares a un libro");
		System.out.println("4. Listar los socios de los bibliteca");
		System.out.println("5. Lista los libros de la biblioteca");
		System.out.println("6. Pedir un libro");
		System.out.println("7. Devolver un libro");
		System.out.println("8. Listado de los ejemplares de un socio");
		System.out.println("9. Listar ejemplares de un libro");
		System.out.println("10. Guardar el estado de la aplición");
		System.out.println("11. Cargar el estado de la aplicación");
		System.out.println("12. Salir");

		option = sc.nextInt();

		switch (option) {
		case 1:
			crearNuevoSocio(b);

			mostrarMenu(b);
			break;
		case 2:
			crearNuevoLibro(b);
			mostrarMenu(b);
			break;
		case 3:
			crearEjemplares(b);
			mostrarMenu(b);
			break;
		case 4:
			listarSocios(b);
			mostrarMenu(b);
			break;
		case 5:
			listarLibros(b);
			mostrarMenu(b);
			break;
		case 6:
			pedirLibro(b);
			mostrarMenu(b);
			break;
		case 7:
			devolverLibro(b);
			mostrarMenu(b);
			break;
		case 8:
			mostrarEjemplaresDeSocio(b);
			mostrarMenu(b);
		case 9:
			listarEjemplares(b);
			mostrarMenu(b);
			break;
		case 10:
			guardarEstado(b);
			mostrarMenu(b);
			break;
		case 11:
			cargar(b);
			mostrarMenu(b);
			break;
		case 12:
			salir(10);
			break;
			
		}
	}

	public static void crearNuevoSocio(Biblioteca b) {
		Scanner sc = new Scanner(System.in);
		String texto1 = "";
		String texto2 = "";
		String texto3 = "";

		System.out.println("Introduce los datos del socio");
		System.out.println("Nombre");
		texto1 = sc.nextLine();
		System.out.println("Apellidos");
		texto2 = sc.nextLine();
		System.out.println("DNI");
		texto3 = sc.nextLine();
		b.newSocio(texto1, texto2, texto3);
	}

	public static void crearNuevoLibro(Biblioteca b) {
		Scanner sc = new Scanner(System.in);
		String texto1 = "";
		String texto2 = "";
		int aux = 0;

		System.out.println("Introduce los datos del libro");
		System.out.println("Autor");
		texto1 = sc.nextLine();
		System.out.println("Título");
		texto2 = sc.nextLine();
		System.out.println("ISBN");
		aux = sc.nextInt();
		b.newLibro(texto1, texto2, aux);
	}

	public static void crearEjemplares(Biblioteca b) {
		Scanner sc = new Scanner(System.in);
		int aux = 0;
		int aux2 = 0;

		System.out.println(b.mostarLibros());
		System.out.println("Introduce el ISBN del libro");
		aux = sc.nextInt();
		System.out.println("¿Cuántos ejemplares quieres añadir?");
		aux2 = sc.nextInt();

		b.addEjemplares(aux, aux2);
	}

	public static void listarSocios(Biblioteca b) {
		System.out.println(b.mostrarSocios());
	}

	public static void listarLibros(Biblioteca b) {
		System.out.println(b.mostarLibros());
	}

	public static void pedirLibro(Biblioteca b) {
		Scanner sc = new Scanner(System.in);
		int aux = 0;
		int aux2 = 0;
		String texto = "";
		Libro l = null;
		Persona p = null;

		b.mostarLibros();
		System.out.println("Introduce el ISBN del libro que quieres pedir");
		aux = sc.nextInt();
		l = b.buscarPorISBN(aux);
		System.out.println();
		System.out.println("A quién se lo quieres prestar");
		texto = sc.nextLine();
		p = b.buscarPorDni(texto);
		System.out.println("Introduce el código del ejemplar");
		aux2 = sc.nextInt();
		b.prestarEjemplar(p, l, aux2);
	}

	public static void devolverLibro(Biblioteca b) {
		Libro l = null;
		int aux = 0;
		int aux2 = 0;
		String texto = "";
		Persona p = null;
		Scanner sc = new Scanner(System.in);

		b.mostrarSocios();
		System.out.println("Introduce el DNI del poseedor");
		texto = sc.nextLine();
		p = b.buscarPorDni(texto);
		p.getLibrosPersona();
		System.out.println("¿Qué libro quieres devolver? Introduce su ISBN");
		aux = sc.nextInt();
		System.out.println("Introduce el código del ejemplar");
		aux2 = sc.nextInt();
		b.buscarPorISBN(aux).devolverEjemplar(aux2);

	}
	public static void mostrarEjemplaresDeSocio(Biblioteca b) {
		String aux = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(b.getSocios());
		System.out.println("introduce el DNI de la persona que quieres mostrar sus ejemplares");
		aux = sc.nextLine();
		b.buscarPorDni(aux).getLibrosPersona();
	}

	public static void listarEjemplares(Biblioteca b) {
		Scanner sc = new Scanner(System.in);
		int aux = 0;

		b.mostarLibros();
		System.out.println("Introduce el IBSN del libro del cual quieres ver los ejemplares");
		aux = sc.nextInt();
		b.buscarPorISBN(aux).getLista(b.buscarPorISBN(aux));
	}

	public static void guardarEstado(Biblioteca b) throws IOException {

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("biblioteca.dat"));
			oos.writeObject(b);
			oos.close();
			System.out.println("Guardado correctamente");
		} catch (Exception e) {
			System.out.println("Error en el guardado");

		}
	}

	public static Biblioteca cargar(Biblioteca b) throws IOException {
		try {
			System.out.println("Cargando");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("biblioteca.dat"));
			b = (Biblioteca) ois.readObject();
			ois.close();
			System.out.println("Cargado correctamente");
			return b;
		} catch (Exception e) {
			System.out.println("Error cargando datos");
			return new Biblioteca("Biblioteca IES la Vereda");
		}
	}
	public static void salir(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("");
		}
	}

}

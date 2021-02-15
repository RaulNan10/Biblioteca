package es.ieslavereda.biblioteca.common;
import java.util.Comparator;

public class OrdenarLibrosPorTitulo implements Comparator<Libro>{


		@Override
		public int compare(Libro arg0, Libro arg1) {
			
			return arg0.getTitulo().compareTo(arg1.getTitulo());
		}
		
		

		
	}


package objetosejerciciosLibreria;

import java.util.ArrayList;

import objetosejerciciosLibreria.LibreriaMontse;

/* 3. Librería. Modela la clase libro para ser utilizada en una librería. La entidad libro debe
 tener:
 a. título (String)
 b. autor (String)
 c. isbn (String)
 d. existencias (numérico)

 4. Librería. Crea una entidad Librería que tenga una colección de libros y permita buscar
 por diferentes criterios como título o autor.

 */
public class MainLibro {

	public static void main(String[] args){
		//INSTANCIAR O CREAR OBJETO 
		Libro libroUno = new Libro ("El Quijote", "Cervantes", "978-1-4028-9462-6", 50);
		Libro libroDos = new Libro ("La Celestina", "Fdo de Rojas", "978-1-4028-9145-6", 30);
		Libro libroTres = new Libro ("El gran Gatsby", "F. Scott Fitzgerald", "978-1-4028-9145-6", 10);
		Libro libroCuatro = new Libro ("1984", "George Orwell", " 978-0451524935", 3);
		Libro libroCinco= new Libro ("Cien años de soledad", "Gabriel Garcia Marquez", "978-0307389732", 1);

		ArrayList<Libro> catalogo = new ArrayList<Libro> ();
		catalogo.add(libroUno);
		catalogo.add(libroDos);
		catalogo.add(libroTres);
		catalogo.add(libroCuatro);
		catalogo.add(libroCinco);


		LibreriaMontse ls = new LibreriaMontse (catalogo);


		// accedo a los atributos y metodos de una clase, lo hago a traves del objeto y por eso, libroUno
		//. metodo q quiera usar y solo mientras sean publicos.

		//para acceder a los atributos PRIVADOS de una clase tiene q entrar a traves del getter y que 
		//sea publico. Desde el Main tiene acceso a existencias

		System.out.println(libroCinco.getExistencias());
		System.out.println(ls.buscarPorTitulo(catalogo, "La Celestina"));
		
		
		//Eliminar libro
		ls.eliminarLibro(libroCinco); 
		
		
        // Añadir un nuevo libro
        Libro nuevoLibro = new Libro("Nuevo Libro", "Autor Desconocido", "123-4567890123", 10);
        ls.aniadirLibro(nuevoLibro);
        
     
        
        // Imprimir catálogo
   
        ls.imprimirCatalogo();
        //System.out.print(catalogo);
	}

	
	}

	





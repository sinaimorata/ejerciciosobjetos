package objetosejerciciosLibreria;
//4. Librería. Crea una entidad Librería que tenga una colección de libros y permita buscar
//por diferentes criterios como título o autor.
import java.util.ArrayList;




public class LibreriaMontse {

	private ArrayList<Libro>catalogo;


	//CONSTRUCTOR
	public LibreriaMontse (ArrayList<Libro>catalogo) {
		this.catalogo = catalogo;
	}
	//GETTERS Y SETTERS
	public ArrayList<Libro> getCatalogo() {
		return catalogo;
	}
//REVISAR ESTE MÉT. NO SE HA USADO
	public void setCatalogo(ArrayList<Libro> catalogo) {
		this.catalogo = catalogo;
	}
	//buscar X TITULO
	public boolean buscarPorTitulo (ArrayList<Libro> catalogo, String titulo ) {
		for (Libro element:catalogo) {
			if (element.getTitulo().equals(titulo)) {
//consigo el elemento. si es igual que el titulo q te ha pasado cm parametro entra en el if
				return true;
			}
		}
		return false;

	}
	
// añadir Libro
	public void aniadirLibro(Libro libro) {
        catalogo.add(libro);
        System.out.println("Libro añadido: " + libro);
	}
	
	//Eliminar libro x isbn
	
	public void eliminarLibro(Libro libro) {
		
		for (Libro element:catalogo) {
			if (element.getIsbn().equals(libro.getIsbn()));
			catalogo.remove(libro);
			
		}
		
	}
	public void imprimirCatalogo () {
		for (Libro libro: catalogo) {
			System.out.println(libro.getTitulo());
		}
	}
     
}

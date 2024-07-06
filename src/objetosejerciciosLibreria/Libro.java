package objetosejerciciosLibreria;

/* 3. Librería. Modela la clase libro para ser utilizada en una librería. La entidad libro debe
 tener:
 a. título (String)
 b. autor (String)
 c. isbn (String)
 d. existencias (numérico)
 
 */

public class Libro {
	private String titulo;
	private String autor;
	private String isbn;
	private double existencias;
	
	
	public Libro(String titulo, String autor, String isbn, int existencias) {
		this.titulo = titulo;
		this.autor= autor;
		this.isbn = isbn;
		this.existencias = existencias;
		
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public double getExistencias() {
		return existencias;
	}

	public void setExistencias(double existencias) {
		this.existencias = existencias;
	}
	
	
}

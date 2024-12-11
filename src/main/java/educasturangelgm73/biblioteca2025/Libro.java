
package educasturangelgm73.biblioteca2025;

/**
 *
 * @author alu10d
 */
public class Libro {
    private String isbn;
    private String autor;
    private String titulo;
    private String genero;
    private int ejemplares;

    public Libro(String isbn, String autor, String titulo, String genero, int ejemplares) {
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.ejemplares = ejemplares;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString() {
        return  isbn + "-" + autor + "-" + titulo + "-" + genero + "-" + ejemplares ;
    }
    
   
    
    
    
}

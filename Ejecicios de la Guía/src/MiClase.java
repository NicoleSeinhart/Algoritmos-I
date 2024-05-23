import java.time.LocalDate;

public class MiClase {
    // Atributos
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    // Método constructor que acepta solo titulo y autor
    public MiClase(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = LocalDate.now().getYear();
    }
    
    // Constructor que acepta todos los atributos
    public MiClase(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    // Método para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
    }    
}

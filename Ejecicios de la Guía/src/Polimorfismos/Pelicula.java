package Polimorfismos;

public class Pelicula extends Medios {
    private String titulo;
    private String director;

    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo Película: \"" + titulo + "\" dirigida por " + director);
    }

}

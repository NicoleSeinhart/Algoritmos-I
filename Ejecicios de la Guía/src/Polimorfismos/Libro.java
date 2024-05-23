package Polimorfismos;

public class Libro extends Medios {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo Libro: \"" + titulo + "\" de " + autor);
    }

}

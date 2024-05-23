package Polimorfismos;

public class Musica extends Medios {
    private String titulo;
    private String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo Música: \"" + titulo + "\" por " + artista);
    }

}

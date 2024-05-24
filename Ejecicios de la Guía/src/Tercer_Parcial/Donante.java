package Tercer_Parcial;

public class Donante {
    private String nombre;
    private String apellido;
    private int id_donante;

    public Donante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id_donante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

}

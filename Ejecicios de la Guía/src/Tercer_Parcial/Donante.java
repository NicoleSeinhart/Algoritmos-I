package Tercer_Parcial;

public class Donante {
    private String nombre;
    private String apellido;
    private int id_donante;
    private static int idCounter = 0;

    public Donante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_donante = ++idCounter;
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

    @Override
    public String toString() {
        return "(" + id_donante + ") " + apellido + ", " + nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Donante donante = (Donante) o;

        if (!nombre.equals(donante.nombre)) return false;
        return apellido.equals(donante.apellido);
    }

    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + apellido.hashCode();
        return result;
    }

}

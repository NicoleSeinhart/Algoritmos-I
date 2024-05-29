package Tercer_Parcial;
import java.util.Objects;

public class Donante {
    private String nombre;
    private String apellido;
    private int id_donante;

    public Donante(String nombre, String apellido, int id_donante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_donante = id_donante;
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
        return this.nombre.equals(donante.nombre) &&
                this.apellido == donante.apellido;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    public String getNombre() {
        return nombre;
    }
}

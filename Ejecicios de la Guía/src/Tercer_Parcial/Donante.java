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

}

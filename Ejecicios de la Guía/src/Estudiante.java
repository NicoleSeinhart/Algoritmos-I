public class Estudiante {
    // Atributos
    static int estudiantesTotales = 0;
    String nombre;
    int edad;
    //String carrera;
    //String [] materias;

    // Constructor que acepta todos los atributos
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    public static int getEstudiantesTotales() {
        return estudiantesTotales;
    }

    public static Estudiante agregarEstudiante(String nombre, int edad) {
        estudiantesTotales++;
        return new Estudiante(nombre, edad);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Crear un objeto Libro con el año de publicación especificado
        //MiClase libro1 = new MiClase("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
        //System.out.println("Detalles del Libro 1:");
        //libro1.mostrarDetalles();

        //System.out.println();

        // Crear un objeto Libro sin especificar el año de publicación
        //MiClase libro2 = new MiClase("El Aleph", "Jorge Luis Borges");
        //System.out.println("Detalles del Libro 2:");
        //libro2.mostrarDetalles();
        Estudiante.estudiantesTotales = 0; // Reiniciar contador de estudiantes
        Estudiante estudiante1 = Estudiante.agregarEstudiante("Juan", 20);
        Estudiante estudiante2 = Estudiante.agregarEstudiante("Maria", 22);

        estudiante1.presentarse();
        estudiante2.presentarse();

        System.out.println("Total de estudiantes: " + Estudiante.getEstudiantesTotales());
    
    }
}

public class Vehiculo {
    // Atributos
    String marca;
    String modelo;
    double precioBase;

    // Método constructor que acepta solo titulo y autor
    public Vehiculo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    //Método que calcule el costo de alquiler del vehículo durante el número de días especificado
    public double calcularCostoAlquiler(int dias) {
        return precioBase * dias;
    }

}

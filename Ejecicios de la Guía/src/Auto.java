public class Auto extends Vehiculo{
    // Atributos
    String marca;
    String modelo;
    double precioBase;

    // Método constructor que acepta solo titulo y autor
    public Auto(String marca, String modelo, double precioBase) {
        super(marca, modelo, precioBase);
    }

    //Método que calcule el costo de alquiler del vehículo durante el número de días especificado
    @Override
    public double calcularCostoAlquiler(int dias) {
        return super.calcularCostoAlquiler(dias) * 1.2;
    }

}

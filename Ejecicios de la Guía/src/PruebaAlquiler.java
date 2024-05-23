public class PruebaAlquiler {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 100);
        Auto auto = new Auto("Ford", "Focus", 150);
        Moto moto = new Moto("Honda", "CBR", 80);

        int dias = 5;

        System.out.println("Costo de alquiler para el vehículo: " + vehiculo.calcularCostoAlquiler(dias));
        System.out.println("Costo de alquiler para el auto: " + auto.calcularCostoAlquiler(dias));
        System.out.println("Costo de alquiler para la moto: " + moto.calcularCostoAlquiler(dias));
    }

}

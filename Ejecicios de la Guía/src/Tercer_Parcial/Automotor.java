package Tercer_Parcial;

import java.time.LocalDate;

public class Automotor extends Poliza {
    private Vehiculo vehiculo;

    public Automotor(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin) {
        super(cliente, calcularMontoAsegurado(vehiculo, fechaInicio), calcularCostoAnual(cliente, calcularMontoAsegurado(vehiculo, fechaInicio), fechaInicio), fechaInicio, fechaFin);
        this.vehiculo = vehiculo;
    }

    private static double calcularCostoAnual(Cliente cliente, double montoAsegurado, LocalDate fechaInicio) {
        int edadCliente = cliente.getEdad(fechaInicio);
        return edadCliente < 30 ? montoAsegurado * 0.20 : montoAsegurado * 0.10;
    }

    private static double calcularMontoAsegurado(Vehiculo vehiculo, LocalDate fechaInicio) {
        int antiguedad = fechaInicio.getYear() - vehiculo.getAñoFabricacion();
        return vehiculo.getMontoCompra() * (1-0.05*antiguedad);
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n" + vehiculo.toString();
    }
}

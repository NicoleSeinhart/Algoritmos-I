package Tercer_Parcial;

import java.time.LocalDate;

public class Seguro_de_Vida extends Poliza {
    public Seguro_de_Vida(Cliente cliente, double montoAsegurado, LocalDate fechaInicio, LocalDate fechaFin) {
        super(cliente, montoAsegurado, calcularCostoAnual(cliente, montoAsegurado, fechaInicio), fechaInicio, fechaFin);
    }

    private static double calcularCostoAnual(Cliente cliente, double montoAsegurado, LocalDate fechaInicio) {
        int edadCliente = cliente.getEdad(fechaInicio);
        return edadCliente < 35 ? montoAsegurado * 0.05 : montoAsegurado * 0.10;
    }
}

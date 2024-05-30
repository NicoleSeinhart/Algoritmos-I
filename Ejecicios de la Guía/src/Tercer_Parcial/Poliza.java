package Tercer_Parcial;

import java.time.LocalDate;

public class Poliza {
    private Cliente cliente;
    private double montoAsegurado;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double costoAnual;

    public Poliza(Cliente cliente, double montoAsegurado, double costoAnual, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.montoAsegurado = montoAsegurado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.costoAnual = costoAnual;;
    }

    public boolean estaVigente(LocalDate fecha) {
        return !fecha.isBefore(fechaInicio) && !fecha.isAfter(fechaFin);
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    @Override
    public String toString() {
        return "-- Poliza --\n" +
                "- Cliente: " + cliente + "\n" +
                "- Monto asegurado: " + montoAsegurado + "\n" +
                "- Costo Anual: " + costoAnual + "\n" +
                "- Vigencia desde: " + fechaInicio + "\n" +
                "- Vigencia hasta: " + fechaFin + "\n" +
                "- Esta vigente: " + (estaVigente(LocalDate.now()) ? "SI" : "NO");
    }

}

package Tercer_Parcial;

import java.time.LocalDate;

enum EstadoDonacion {
    PENDIENTE,
    RECHAZADA,
    COBRADA
}

public class Donacion {
    private Donante donante;
    private LocalDate fecha;
    private double monto;
    private int id_donacion;
    private EstadoDonacion estado;
    private static int idCounter = 0;


    public Donacion(Donante donante, LocalDate fecha, double monto) {
        this.donante = donante;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = EstadoDonacion.PENDIENTE;
        this.id_donacion = ++idCounter;
    }

    public int getId() {
        return id_donacion;
    }

    public Donante getDonante() {
        return donante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }

    public EstadoDonacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoDonacion estado) {
        this.estado = estado;
    }

    public void setCobrada() {
        this.estado = EstadoDonacion.COBRADA;
    }

    public void setRechazada() {
        this.estado = EstadoDonacion.RECHAZADA;
    }

    @Override
    public String toString() {
        return "Donacion " + id_donacion + ":\n" +
        "-  Donante: " + donante + "\n" +
        "-  Fecha: " + fecha + "\n" +
        "-  Estado: " + estado + "\n" +
        "-  Monto: " + monto;
    }

}

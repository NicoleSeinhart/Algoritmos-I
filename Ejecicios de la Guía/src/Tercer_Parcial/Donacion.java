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


    public Donacion(Donante donante, LocalDate fecha, double monto) {
        this.donante = donante;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = EstadoDonacion.PENDIENTE;
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

}

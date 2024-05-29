package Tercer_Parcial;

import java.time.LocalDate;

public class Donacion implements Comparable<Donacion> {
    
    enum EstadoDonacion {
    PENDIENTE,
    RECHAZADA,
    COBRADA
}

    private Donante donante;
    private LocalDate fecha;
    private float monto;
    private int id_donacion;
    private EstadoDonacion estado;
    private static int idCounter = 0;

    private static int getUltimoId() {
        int actual = idCounter;
        idCounter++;
        return actual;
    }

    public Donacion(Donante donante, LocalDate fecha, float monto) {
        this.donante = donante;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = EstadoDonacion.PENDIENTE;
        this.id_donacion = getUltimoId();
    }

    public void setCobrada() {
        this.estado = EstadoDonacion.COBRADA;
    }

    public void setRechazada() {
        this.estado = EstadoDonacion.RECHAZADA;
    }

    @Override
    public String toString() {
        String salida = "";
        salida += "Donacion " + id_donacion;
        salida += "\n- Donante: " + donante;
        salida += "\n- Fecha: " + fecha;
        salida += "\n- Estado: " + estado;
        salida += "\n- Monto: " + monto;
        return salida;
    }

    @Override
    public int compareTo(Donacion otro) {
        return fecha.compareTo(otro.fecha);
    }

    public boolean esPreviaA(LocalDate limite) {
        return fecha.isBefore(limite) || fecha.isEqual(limite);
    }

    public boolean estaCobrada() {
        return estado.equals(EstadoDonacion.COBRADA);
    }

    public boolean estaRechazada() {
        return estado.equals(EstadoDonacion.RECHAZADA);
    }

    public boolean estaPendiente() {
        return estado.equals(EstadoDonacion.PENDIENTE);
    }

    public float getMonto() {
        return monto;
    }

}

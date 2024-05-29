package Tercer_Parcial;

import java.time.LocalDate;

public class Partido {
    // Atributos
    private Equipo local;
    private Equipo visitante;
    private LocalDate fecha;
    private int golesLocal;
    private int golesVisitante;
    private TablaTorneo tablaTorneo;

    public Partido(Equipo local, Equipo visitante, LocalDate fecha, int golesLocal, int golesVisitante, TablaTorneo tablaTorneo) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.tablaTorneo = tablaTorneo;
        actualizarEstadisticas();
    }

    private void actualizarEstadisticas() {
        tablaTorneo.actualizarEstadisticas(local, visitante, golesLocal, golesVisitante);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha.toString() + ", " +
               local.getNombre() + " (" + golesLocal + ") - " +
               visitante.getNombre() + " (" + golesVisitante + ")";
    }
}
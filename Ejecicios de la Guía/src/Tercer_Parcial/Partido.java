package Tercer_Parcial;

import java.time.LocalDate;

public class Partido {
    // Atributos
    private Equipo local;
    private Equipo visitante;
    private LocalDate fecha;
    private int golesLocal;
    private int golesVisitante;

    public Partido(Equipo local, Equipo visitante, LocalDate fecha, int golesLocal, int golesVisitante) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        actualizarEstadisticas();
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    private void actualizarEstadisticas() {
        boolean esEmpatado = golesLocal == golesVisitante;
        boolean esGanadoLocal = golesLocal > golesVisitante;

        local.actualizarEstadisticas(golesLocal, golesVisitante, esGanadoLocal, esEmpatado);
        visitante.actualizarEstadisticas(golesVisitante, golesLocal, !esGanadoLocal && !esEmpatado, esEmpatado);
    }
}
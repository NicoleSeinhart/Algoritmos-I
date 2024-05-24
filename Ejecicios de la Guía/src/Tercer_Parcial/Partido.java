package Tercer_Parcial;

import java.time.LocalDate;

public class Partido {
    // Atributos
    private EquipoConEstadisticas local;
    private EquipoConEstadisticas visitante;
    private LocalDate fecha;
    private int golesLocal;
    private int golesVisitante;

    public Partido(EquipoConEstadisticas local, EquipoConEstadisticas visitante, LocalDate fecha, int golesLocal, int golesVisitante) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        actualizarEstadisticas();
    }

    public EquipoConEstadisticas getLocal() {
        return local;
    }

    public EquipoConEstadisticas getVisitante() {
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
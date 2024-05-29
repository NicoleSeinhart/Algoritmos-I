package Tercer_Parcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablaTorneo {
    private Map<Equipo, Estadistica> estadisticas;

    public TablaTorneo() {
        this.estadisticas = new HashMap<>();
    }

    public void agregarEquipo(Equipo equipo) {
        estadisticas.put(equipo, new Estadistica(equipo));
    }

    private Estadistica encontrarEstadistica(Equipo equipo) {
        return estadisticas.get(equipo);
    }

    public void actualizarEstadisticas(Equipo local, Equipo visitante, int golesLocal, int golesVisitante) {
        Estadistica estadisticaLocal = encontrarEstadistica(local);
        Estadistica estadisticaVisitante = encontrarEstadistica(visitante);
        if (estadisticaLocal != null && estadisticaVisitante != null) {
            estadisticaLocal.actualizar(golesLocal, golesVisitante);
            estadisticaVisitante.actualizar(golesVisitante, golesLocal);
        }
    }

    public void mostrarTabla() {
        List<Estadistica> listaEstadisticas = new ArrayList<>(estadisticas.values());
        Collections.sort(listaEstadisticas);

        System.out.println("Equipo | Ju | Pu | Ga | Em | Pe | GF | GC | DG");
        for (Estadistica estadistica : listaEstadisticas) {
            System.out.println(estadistica.toString());
        }
    }
}

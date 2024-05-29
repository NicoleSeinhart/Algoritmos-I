package Tercer_Parcial;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.time.LocalDate;

public class Torneo {
    private Set<Equipo> equipos;
    private List<Partido> partidos;
    private TablaTorneo tablaTorneo;

    public Torneo() {
        // Inicializa el conjunto de equipos en el constructor
        equipos = new HashSet<>();
        partidos = new ArrayList<>();
        tablaTorneo = new TablaTorneo();
    }

    public void cargarEquipo(String nombre, int fans) {
        Equipo nuevoEquipo = new Equipo(nombre, fans);
        equipos.add(nuevoEquipo);
        tablaTorneo.agregarEquipo(nuevoEquipo);
    }

    public void cargarPartido(String nombreLocal, String nombreVisitante, LocalDate fecha, int golesLocal, int golesVisitante) {
        Equipo equipoLocal = null;
        Equipo equipoVisitante = null;
        // Buscar los equipos por sus nombres en la lista de equipos del torneo
        for (Equipo equipo : equipos) {
            if (equipo.getNombre().equals(nombreLocal)) {
                equipoLocal = equipo;
            }
            if (equipo.getNombre().equals(nombreVisitante)) {
                equipoVisitante = equipo;
            }
        }
        // Verificar si se encontraron los equipos
        if (equipoLocal != null && equipoVisitante != null) {
            // Agregar el partido a la lista de partidos del torneo
            partidos.add(new Partido(equipoLocal, equipoVisitante, fecha, golesLocal, golesVisitante, tablaTorneo));
        } else {
            // Manejar el caso en el que no se encontraron uno o ambos equipos
            System.out.println("Error: Uno o ambos equipos no están registrados en el torneo.");
        }
    }

    public void mostrarPartidosFecha(LocalDate fecha) {
        for (Partido partido : partidos) {
            if (partido.getFecha().equals(fecha)) {
                System.out.println(partido.toString());
            }
        }
    }

    public void mostrarTabla() {
        tablaTorneo.mostrarTabla();
    }
}

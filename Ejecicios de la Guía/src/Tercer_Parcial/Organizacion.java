package Tercer_Parcial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Organizacion {
    private String nombre;
    private Map<String, Donante> donantes;
    private List<Donacion> donaciones;

    public Organizacion(String nombre) {
        this.nombre = nombre;
        this.donantes = new HashMap<>();
        this.donaciones = new ArrayList<>();
    }

    public void mostrarDonantes();
    public void mostrarDonaciones()
    public void mostrarResultadoFecha(LocalDate.of(2023,11,10))

}

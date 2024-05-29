package Tercer_Parcial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ONG {
    private String nombre;
    private  List<Donante> donantes;
    private List<Donacion> donaciones;
    private int prox_id_donante;

    public ONG(String nombre) {
        this.nombre = nombre;
        this.donantes = new ArrayList<>();
        this.donaciones = new ArrayList<>();
        this.prox_id_donante = 0;
    }

    public Donante registrarDonante(String nombre, String apellido) {
        Donante donante = new Donante(nombre, apellido, prox_id_donante);
        int indice = donantes.indexOf(donante);
        if (indice > -1) {
            return donantes.get(indice);
        }
        prox_id_donante++;
        donantes.add(donante);
        return donante;
    }

    public Donacion cargarDonacion(Donante donante, LocalDate fecha, float monto){
        Donacion donacion = new Donacion(donante, fecha, monto);
        donaciones.add(donacion); 
        return donacion;
    }

    public void mostrarDonantes(){
        String salida = "Listado de donantes de " + nombre;
        for (Donante donante : donantes) {
            salida += "\n";
            salida += donante.toString();
        }
        System.out.println(salida);
    }
    public void mostrarDonaciones(){
        String salida = "Listado de donaciones de " + nombre;
        
        for (Donacion donacion : donaciones) {
            salida += "\n";
            salida += donacion;
        }
        System.out.println(salida);
    }

    public void mostrarResultadoFecha(LocalDate fechaLimite){
        String salida = "Estado de Resultado de " + nombre + " al " + fechaLimite;
        int cobradas = 0;
        int rechazadas = 0;
        int pendientes = 0;
        float montoTotalCobradas = 0;
        float maxCobrada = Float.MIN_VALUE;
        float minCobrada = Float.MAX_VALUE;

        for (Donacion donacion : donaciones) {
            if (donacion.esPreviaA(fechaLimite)) {
                if (donacion.estaCobrada()) {
                    cobradas += 1;
                    montoTotalCobradas += donacion.getMonto();
                    if (maxCobrada < donacion.getMonto()) {
                        maxCobrada = donacion.getMonto();
                    }
                    if (minCobrada > donacion.getMonto()) {
                        minCobrada = donacion.getMonto();
                    }
                }
                if (donacion.estaRechazada())
                    rechazadas += 1;
                if (donacion.estaPendiente())
                    pendientes += 1;
            }
        }
        
        salida += "\n- Cobradas: " + cobradas;
        salida += "\n- Rechazadas: " + rechazadas;
        salida += "\n- Pendientes: " + pendientes;
        if (cobradas > 0) {
            salida += "\n- Monto Total: " + montoTotalCobradas;
            salida += "\n- Monto máximo: " + maxCobrada;
            salida += "\n- Monto mínimo: " + minCobrada;
            salida += "\n- Monto medio: " + montoTotalCobradas / cobradas;
        }
        System.out.println(salida);
    }
}
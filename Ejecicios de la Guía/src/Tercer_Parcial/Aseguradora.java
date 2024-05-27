package Tercer_Parcial;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.time.LocalDate;

public class Aseguradora {
    private List<Poliza> polizas;

    public Aseguradora() {
        polizas = new ArrayList<>();
    }

    public void asegurarVehiculo(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin){
        PolizaAutomotor poliza = new PolizaAutomotor(cliente, vehiculo, fechaInicio, fechaFin);    
        polizas.add(poliza);
        }


    public void mostrarPolizas(){
        System.out.println("--- Polizas vigentes ---");
        for (Poliza poliza : polizas) {
            System.out.println("-- Poliza --");
            System.out.println("- Cliente: " + poliza.cliente);
            System.out.println("- Monto asegurado: " + poliza.cliente);
            System.out.println("- Costo Anual: " + poliza.cliente);
            System.out.println("- Vigencia desde: " + poliza.cliente);
            System.out.println("- Vigencia hasta: " + poliza.cliente);
            if (poliza.estaVigente(hoy)) {
                System.out.println("- Esta vigente: SI");
            } else{
                System.out.println("- Esta vigente: NO");
            }
            System.out.println("-- Vehiculo --");
            System.out.println("- Dominio: " + poliza.cliente);
            System.out.println("- Año: " + poliza.cliente);
            System.out.println("- Monto compra: " + poliza.cliente);        
        }
    }

    public void transferirPoliza(poliza, ciente){};
}

package Tercer_Parcial;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Aseguradora {
    private List<Poliza> polizas;

    public Aseguradora() {
        polizas = new ArrayList<>();
    }

    public Poliza asegurarVehiculo(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin) {
        Poliza poliza = new Automotor(cliente, vehiculo, fechaInicio, fechaFin);
        polizas.add(poliza);
        return poliza;
    }

    public Poliza asegurarVida(Cliente cliente, double montoAsegurado, LocalDate fechaInicio, LocalDate fechaFin) {
        Poliza poliza = new Seguro_de_Vida(cliente, montoAsegurado, fechaInicio, fechaFin);
        polizas.add(poliza);
        return poliza;
    }


    public void mostrarPolizas() {
        LocalDate hoy = LocalDate.now();
        System.out.println("--- Polizas vigentes ---");
        for (Poliza poliza : polizas) {
            if (poliza.estaVigente(hoy)) {
                System.out.println(poliza);
            }
        }
    
        System.out.println("--- Polizas vencidas ---");
        for (Poliza poliza : polizas) {
             if (!poliza.estaVigente(hoy)) {
                System.out.println(poliza);
            }
        }
    }

    public void transferirPoliza(Poliza poliza, Cliente nuevoCliente) {
        if (poliza instanceof Automotor && poliza.estaVigente(LocalDate.now())) {
            Poliza nuevaPoliza = new Automotor(nuevoCliente, ((Automotor)poliza).getVehiculo(), poliza.getFechaInicio(), poliza.getFechaFin());
            polizas.remove(poliza);
            polizas.add(nuevaPoliza);
        } else {
            System.out.println("La póliza no está vigente o no es una póliza de automotor y no puede ser transferida.");
        }
    }
}

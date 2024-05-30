package Tercer_Parcial;

public class Vehiculo {
    private String patente;
    private double montoCompra;
    private int añoFabricacion;

    public Vehiculo(String patente, double montoCompra, int añoFabricacion) {
        this.patente = patente;
        this.añoFabricacion = añoFabricacion;
        this.montoCompra = montoCompra;
    }

    public double getMontoCompra() {
        return montoCompra;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    @Override
    public String toString() {
        return "-- Vehiculo --\n" +
                "- Dominio: " + patente + "\n" +
                "- Año: " + añoFabricacion + "\n" +
                "- Monto compra: " + montoCompra;
    }
}

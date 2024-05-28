package Tercer_Parcial;

public class Vehiculo {
    private String patente;
    private double montoCompra;
    private int añoFabricacion;

    public Vehiculo(String dominio, double montoCompra, int añoFabricacion) {
        this.patente = patente;
        this.añoFabricacion = añoFabricacion;
        this.montoCompra = montoCompra;
    }

    public String getDominio() {
        return patente;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public double getMontoCompra() {
        return montoCompra;
    }
}

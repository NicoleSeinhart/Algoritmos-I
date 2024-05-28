package Tercer_Parcial;

public class Equipo {
    // Atributos
    private String nombre;
    private int fans;
    private int partidos;
    private int puntos;
    private int ganados;
    private int empatados;
    private int perdidos;
    private int gf;
    private int gc;
    private int dg;

    public Equipo(String nombre, int fans) {
        this.nombre = nombre;
        this.fans = fans;
        this.partidos = 0;
        this.puntos = 0;
        this.ganados = 0;
        this.empatados = 0;
        this.perdidos = 0;
        this.gf = 0;
        this.gc = 0;
        this.dg = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPartidos() {
        return partidos;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getGanados() {
        return ganados;
    }

    public int getEmpatados() {
        return empatados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public int getGF() {
        return gf;
    }

    public int getGC() {
        return gc;
    }

    public int getDG() {
        return dg;
    }

    public void actualizarEstadisticas(int golesAFavor, int golesEnContra, boolean esGanado, boolean esEmpatado) {
        this.partidos++;
        this.gf += golesAFavor;
        this.gc += golesEnContra;
        this.dg = this.gf - this.gc;

        if (esGanado) {
            this.ganados++;
            this.puntos += 3;
        } else if (esEmpatado) {
            this.empatados++;
            this.puntos++;
        } else {
            this.perdidos++;
        }
    }
}

package Tercer_Parcial;

public class Equipo {
    // Atributos
    private String nombre;
    private int fans;
    private int partidos = 0;
    private int puntos = 0;
    private int ganados = 0;
    private int empatados = 0;
    private int perdidos = 0;
    private int gf = 0;
    private int gc = 0;
    private int dg = 0;

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

    public int getFans() {
        return fans;
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

    public void actualizarEstadisticas(int golesAFavor, int golesEnContra) {
        this.partidos++;
        this.gf += golesAFavor;
        this.gc += golesEnContra;
        this.dg = this.gf - this.gc;

        if (golesAFavor > golesEnContra) {
            this.puntos += 3;
            this.ganados++;
        } else if (golesAFavor == golesEnContra) {
            this.puntos += 1;
            this.empatados++;
        } else {
            this.perdidos++;
        }
    }


}

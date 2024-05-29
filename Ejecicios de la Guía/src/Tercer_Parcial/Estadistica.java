package Tercer_Parcial;

public class Estadistica implements Comparable<Estadistica> {
    private Equipo equipo;
    private int partidos;
    private int puntos;
    private int ganados;
    private int empatados;
    private int perdidos;
    private int gf;
    private int gc;
    private int dg;

    public Estadistica(Equipo equipo) {
        this.equipo = equipo;
        this.partidos = 0;
        this.puntos = 0;
        this.ganados = 0;
        this.empatados = 0;
        this.perdidos = 0;
        this.gf = 0;
        this.gc = 0;
        this.dg = 0;
    }

    public void actualizar(int golesAFavor, int golesEnContra) {
        partidos++;
        gf += golesAFavor;
        gc += golesEnContra;
        dg = gf - gc;

        if (golesAFavor > golesEnContra) {
            ganados++;
            puntos += 3;
        } else if (golesAFavor == golesEnContra) {
            empatados++;
            puntos++;
        } else {
            perdidos++;
        }
    }

    @Override
    public int compareTo(Estadistica otro) {
        if (this.puntos != otro.puntos) {
            return Integer.compare(otro.puntos, this.puntos); // Mayor a menor puntos
        } else {
            return Integer.compare(otro.dg, this.dg); // Mayor a menor diferencia de goles
        }
    }

    public String toString() {
        return equipo.getNombre() + " | " +
                partidos + " | " + puntos + " | " +
                ganados + " | " + empatados + " | " +
                perdidos + " | " + gf + " | " +
                gc + " | " + dg + " |";
    }

    public int getPuntos() {
        return puntos;
    }

    public int getDG() {
        return dg;
    }

}

package Tercer_Parcial;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Cliente(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad(LocalDate fecha) {
        return (int) ChronoUnit.YEARS.between(fechaNacimiento, fecha);
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + getEdad(LocalDate.now()) + ")";
    }

}

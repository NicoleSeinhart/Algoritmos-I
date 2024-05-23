package Entrada;

import java.util.Scanner;
import Salida.SalidaConsola;

public class EntradaConsola {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese el número de entradas a aceptar:");
        int numeroEntradas = entradas.nextInt();

        for (int i = 0; i < numeroEntradas; i++) {
            System.out.println("Ingrese la entrada " + (i + 1) + ":");
            String entrada = entradas.next();
            SalidaConsola.mostrar(entrada);
        }

        entradas.close();
    }
}

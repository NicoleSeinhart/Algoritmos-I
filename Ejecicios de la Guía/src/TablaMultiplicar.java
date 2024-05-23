import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingrese un número:");
        double numero = scanner.nextDouble();

        double resultado = 0;
        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
        }

        scanner.close();
    }

}

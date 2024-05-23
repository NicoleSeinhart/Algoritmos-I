import java.util.Scanner;

public class SumaNumerosPAres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingrese un número positivo:");
        double numero = scanner.nextDouble();

        double resultado = 0;

        // Validar si el número ingresado es positivo
        if (numero <= 0) {
            System.out.println("El número ingresado no es positivo.");
        }

        for (int i = 2; i <= numero; i += 2) {
            resultado += i;}

        System.out.println("La suma de los números pares del 1 al " + numero + " es:" + resultado);

        scanner.close();
    }

}

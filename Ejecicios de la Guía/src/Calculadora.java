import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el primer número:");
    double numero1 = scanner.nextDouble();

    System.out.println("Ingrese el operador (+, -, *, /):");
    char operador = scanner.next().charAt(0);

    System.out.println("Ingrese el segundo número:");
    double numero2 = scanner.nextDouble();

    double resultado = 0;

    switch (operador) {
        case '+':
            resultado = numero1 + numero2;
            break;
        case '-':
            resultado = numero1 - numero2;
            break;
        case '*':
            resultado = numero1 * numero2;
            break;
        case '/':
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Error: división por cero.");
                System.exit(1); // Salir del programa con error
            }
            break;
        default:
            System.out.println("Operador no válido.");
            System.exit(1); // Salir del programa con error
    }

    System.out.println("Resultado: " + resultado);

    scanner.close();
}

}

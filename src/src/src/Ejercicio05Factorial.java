import java.util.Scanner;

public class Ejercicio05Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = sc.nextInt();

        long factorial = 1;

        if (numero < 0) {
            System.out.println("No existe factorial para números negativos.");
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        sc.close();
    }
}

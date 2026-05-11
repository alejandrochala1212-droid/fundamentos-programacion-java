import java.util.Scanner;

public class Ejercicio07SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int n = sc.nextInt();

        int suma = 0;

        if (n <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            for (int i = 1; i <= n; i++) {
                suma += i;
            }

            System.out.println("La suma de los números del 1 al " + n + " es: " + suma);
        }

        sc.close();
    }
}

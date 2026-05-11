import java.util.Scanner;

public class Ejercicio10Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de términos de la serie Fibonacci: ");
        int n = sc.nextInt();

        int primero = 0;
        int segundo = 1;

        if (n <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
        } else {
            System.out.println("Serie Fibonacci:");

            for (int i = 1; i <= n; i++) {
                System.out.print(primero + " ");

                int siguiente = primero + segundo;
                primero = segundo;
                segundo = siguiente;
            }
        }

        sc.close();
    }
}  

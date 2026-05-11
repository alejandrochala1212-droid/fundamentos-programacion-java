import java.util.Scanner;

public class Ejercicio04MayorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int c = sc.nextInt();

        int mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        System.out.println("El número mayor es: " + mayor);

        sc.close();
    }
}

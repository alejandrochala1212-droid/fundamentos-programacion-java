  import java.util.Scanner;

public class Ejercicio06TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número para mostrar su tabla de multiplicar: ");
        int numero = sc.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}

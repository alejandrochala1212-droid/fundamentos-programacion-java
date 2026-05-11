import java.util.Scanner;

public class Ejercicio01AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * radio * radio;

        System.out.println("El área del círculo es: " + area);

        sc.close();
    }
}

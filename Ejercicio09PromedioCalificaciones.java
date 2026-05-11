import java.util.Scanner;

public class Ejercicio09PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones deseas ingresar? ");
        int cantidad = sc.nextInt();

        double suma = 0;

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
        } else {
            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Ingresa la calificación " + i + ": ");
                double calificacion = sc.nextDouble();
                suma += calificacion;
            }

            double promedio = suma / cantidad;

            System.out.println("El promedio es: " + promedio);

            if (promedio >= 70) {
                System.out.println("Resultado: Aprobado");
            } else {
                System.out.println("Resultado: Reprobado");
            }
        }

        sc.close();
    }
}

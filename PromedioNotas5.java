import java.util.Scanner;

public class PromedioNotas5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuántas notas deseas ingresar: ");
        int cantidad = scanner.nextInt();

        int[] notas = new int[cantidad];
        int suma = 0;

        // Inicializar con valores extremos
        int notaMayor = Integer.MIN_VALUE; 
        int notaMenor = Integer.MAX_VALUE;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
            suma += notas[i];  

            if (notas[i] > notaMayor) {
                notaMayor = notas[i]; 
            }

            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
            }
        }
        double promedio = (double)suma/cantidad;

        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("La nota mas alta es: " + notaMayor);
        System.out.println("La nota mas baja es: " + notaMenor);
        scanner.close();
    }
}
    
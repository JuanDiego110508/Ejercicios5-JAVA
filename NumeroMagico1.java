import java.util.Scanner;

public class NumeroMagico1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();

        int resultado = numero;

        while (resultado >= 10) {
            int suma = 0;
            int numeroActual = resultado;

            while(numeroActual > 0) {
                suma += (numeroActual % 10);
                numeroActual /= 10;
            }
            resultado = suma;
        }
        if(resultado == 1) {
            System.out.println("El numero " + numero + " es magico. ");
        } else {
            System.out.print("El numero " + numero + " No es magico. ");
        } scanner.close();
    }
}
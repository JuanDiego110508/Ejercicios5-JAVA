import java.util.Scanner;

public class ConversionSegundos3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de segundos: ");
        int segundos = scanner.nextInt();

        int horas = 0;
        int minutos = 0;
        // Contamos horas
        while (segundos >= 3600) {
            segundos -= 3600;
            horas++;
        }
        // Contamos minutos
        while (segundos >= 60) {
            segundos -= 60;
            minutos++;
        }
        // El restante son los segundos
        int segundosRestantes = segundos;

        String tiempo = horas + ":" + minutos + ":" + segundosRestantes;
        System.out.println("En el formato HH:MM:SS es: " + tiempo);
        scanner.close();
    }
}

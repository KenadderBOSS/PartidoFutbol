import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Partido 1
        String equipo3 = "Argentina";
        String equipo4 = "Brazil";
        int golesEquipo3 = 2;
        int golesEquipo4 = 3;
        System.out.println("Partido 1: " + equipo3 + " vs " + equipo4);
        System.out.println(equipo3 + ": " + golesEquipo3 + " goles");
        System.out.println(equipo4 + ": " + golesEquipo4 + " goles");

        // Partido 2
        String equipo1 = "Polonia";
        String equipo2 = "México";
        int golesEquipo1 = 4;
        int golesEquipo2 = 2;
        System.out.println("Partido 2: " + equipo1 + " vs " + equipo2);
        System.out.println(equipo1 + ": " + golesEquipo1 + " goles");
        System.out.println(equipo2 + ": " + golesEquipo2 + " goles");

        // Para solicitar al usuario que adivine quien ganó
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina quién ganó en cada partido.");
        System.out.print("Partido 1 (1 para " + equipo3 + ", 2 para " + equipo4 + "): ");
        int adivinanza1 = scanner.nextInt();
        System.out.print("Partido 2 (1 para " + equipo1 + ", 2 para " + equipo2 + "): ");
        int adivinanza2 = scanner.nextInt();

        // Verificar las respuestas del usuario y presentar el resultado
        int puntos = 0;
        if (adivinanza1 == 2) {
            puntos++;
            System.out.println("¡Correcto! " + equipo4 + " ganó el partido 1.");
        } else {
            System.out.println("Incorrecto. " + equipo4 + " ganó el partido 1.");
        }
        if (adivinanza2 == 1) {
            puntos++;
            System.out.println("¡Correcto! " + equipo1 + " ganó el partido 2.");
        } else {
            System.out.println("Incorrecto. " + equipo1 + " ganó el partido 2.");
        }
        System.out.println("Tuviste " + puntos + " aciertos de 2 posibles.");
    }
    }

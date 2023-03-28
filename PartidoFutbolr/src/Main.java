import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int aciertos = 0;

        // Partido 1
        try {
            BufferedReader reader = new BufferedReader(new FileReader("partido1.csv"));
            String equipo1 = reader.readLine();
            String equipo2 = reader.readLine();
            String resultado = reader.readLine();
            reader.close();

            System.out.println("Partido 1: " + equipo1 + " vs " + equipo2);
            System.out.print("Ingrese su pronóstico (ej: 2-1): ");
            String pronostico = input.nextLine();

            if (pronostico.equals(resultado)) {
                aciertos++;
                System.out.println("¡Acierto!");
            } else {
                System.out.println("Fallaste");
            }


            FileWriter writer = new FileWriter("partido1.csv");
            writer.write(equipo1 + "\n");
            writer.write(equipo2 + "\n");
            writer.write(pronostico + "\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Partido 2
        try {
            BufferedReader reader = new BufferedReader(new FileReader("partido2.csv"));
            String equipoLocal = reader.readLine();
            String equipoVisitante = reader.readLine();
            String resultado = reader.readLine();
            reader.close();

            System.out.println("Partido 2: " + equipoLocal + " vs " + equipoVisitante);
            System.out.print("Ingrese su pronóstico (ej: 2-1): ");
            String pronostico = input.nextLine();

            if (pronostico.equals(resultado)) {
                aciertos++;
                System.out.println("¡Acierto!");
            } else {
                System.out.println("Fallaste");
            }


            FileWriter writer = new FileWriter("partido2.csv");
            writer.write(equipoLocal + "\n");
            writer.write(equipoVisitante + "\n");
            writer.write(pronostico + "\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        input.close();

        System.out.println("Tuviste " + aciertos + " aciertos.");
    }


}
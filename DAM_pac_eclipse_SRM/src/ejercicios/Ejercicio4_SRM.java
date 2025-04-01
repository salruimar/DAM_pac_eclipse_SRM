package ejercicios;
import java.util.Scanner;
public class Ejercicio4_SRM {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] arrayNombres = new String[20];
        int[] arrayPuntuacion = new int[20];

        // Variables para cálculos
        int puntuacionMax = 0;
        int puntuacionMin = 100;
        String equipoGanador = "";
        String equipoUltimo = "";
        int sumaPuntuaciones = 0;

        // Rellenar array de nombres
        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce el nombre del equipo " + (i + 1) + ":");
            arrayNombres[i] = teclado.nextLine();
        }

        // Rellenar array de puntuaciones de forma aleatoria
        for (int i = 0; i < 20; i++) {
            arrayPuntuacion[i] = (int) (Math.random() * 66) + 35; // Valores entre 35 y 100
            sumaPuntuaciones += arrayPuntuacion[i];


            if (arrayPuntuacion[i] > puntuacionMax) {
                puntuacionMax = arrayPuntuacion[i];
                equipoGanador = arrayNombres[i];
            }


            if (arrayPuntuacion[i] < puntuacionMin) {
                puntuacionMin = arrayPuntuacion[i];
                equipoUltimo = arrayNombres[i];
            }
        }


        double puntuacionMedia = (double) sumaPuntuaciones / 20;

        // Mostrar resultados
        System.out.println("\n--- Clasificación de la Liga Local ---");
        System.out.println("Equipo ganador: " + equipoGanador + " con " + puntuacionMax + " puntos");
        System.out.println("Último clasificado: " + equipoUltimo + " con " + puntuacionMin + " puntos");
        System.out.printf("Puntuación media de los equipos: %.2f puntos\n", puntuacionMedia);

        teclado.close();
    }
}
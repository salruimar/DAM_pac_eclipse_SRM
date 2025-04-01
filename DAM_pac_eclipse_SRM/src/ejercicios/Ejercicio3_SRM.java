package ejercicios;
import java.util.Scanner;
public class Ejercicio3_SRM {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Datos personales del corredor
        System.out.println("Nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("Edad: ");
        int edad = teclado.nextInt();

        System.out.println("Peso (kg): ");
        double peso = teclado.nextDouble();

        System.out.println("Altura (m): ");
        double altura = teclado.nextDouble();
        teclado.nextLine(); // Limpiar buffer

        System.out.println("Sexo (H/M): ");
        String sexo = teclado.nextLine();

        System.out.println("Velocidad inicial (km/h): ");
        double velocidadInicial = teclado.nextDouble();

        System.out.println("Distancia inicial (km): ");
        double distanciaInicial = teclado.nextDouble();

        System.out.println("Calorías quemadas iniciales: ");
        double caloriasIniciales = teclado.nextDouble();
        teclado.nextLine(); // Limpiar buffer

        // Calcular IMC
        double imc = peso / (altura * altura);

        // Arrays para almacenar datos de las sesiones
        double[] velocidades = new double[10];
        double[] distancias = new double[10];
        double[] calorias = new double[10];

        // Variables para cálculos
        double velocidadMedia = 0;
        double distanciaMedia = 0;
        double caloriasMedia = 0;
        double distanciaMax = 0;
        double caloriasMax = 0;

        // Bucle para recoger datos de las 10 sesiones
        for (int i = 0; i < 10; i++) {
            System.out.println("\nSesión " + (i + 1) + ":");
            
            System.out.println("Velocidad (km/h): ");
            velocidades[i] = teclado.nextDouble();
            
            System.out.println("Distancia recorrida (km): ");
            distancias[i] = teclado.nextDouble();
            
            System.out.println("Calorías quemadas: ");
            calorias[i] = teclado.nextDouble();
            teclado.nextLine(); // Limpiar buffer

            velocidadMedia += velocidades[i];
            distanciaMedia += distancias[i];
            caloriasMedia += calorias[i];

            // Actualizar máximos
            if (distancias[i] > distanciaMax) {
                distanciaMax = distancias[i];
            }
            if (calorias[i] > caloriasMax) {
                caloriasMax = calorias[i];
            }
        }

        velocidadMedia /= 10;
        distanciaMedia /= 10;
        caloriasMedia /= 10;

        // Mostrar ficha de seguimiento
        System.out.println("\n----------------------------------------");
        System.out.println("Hola " + nombre + ", te presentamos la ficha de seguimiento de entrenamiento:");
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Sexo: " + sexo);
        System.out.printf("Índice de masa corporal: %.2f\n", imc);
        
        System.out.println("\nLa media del entrenamiento en 10 sesiones es:");
        System.out.println("CFGS DAM Entornos de Desarrollo Curso 2024/2025");
        System.out.printf("Velocidad media: %.2f km/h\n", velocidadMedia);
        System.out.printf("Distancia media recorrida: %.2f km\n", distanciaMedia);
        System.out.printf("Calorías quemadas de media: %.2f\n", caloriasMedia);
        System.out.printf("Máxima distancia recorrida: %.2f km\n", distanciaMax);
        System.out.printf("Máximo número de calorías quemadas en una sesión: %.2f\n", caloriasMax);
        System.out.println("----------------------------------------");

        teclado.close();
    }
}
package ejercicios;
import java.util.*;
public class Ejercicio2_SRM {


	public static void main(String[] args) {
		if (proceso_seleccion()) {
			System.out.println("Contratado");
		} else {
			System.out.println("Descartado");
		}
	}

	public static boolean proceso_seleccion() {
		boolean resultado = true;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");
		int edad = teclado.nextInt();
		
		if (edad > 40) {
			resultado = false;
		} else {
			teclado.nextLine();
			System.out.println("Introduce tu nombre: ");
			String nombre = teclado.nextLine();
			
			System.out.println("Introduce la cantidad de años trabajados");
			int años = teclado.nextInt();
			
			System.out.println("Introduce tu sueldo bruto anual anterior: ");
			int sueldo = teclado.nextInt();
			
			if (sueldo > 30000) {
				resultado = false;
			} else {
				System.out.println("Introduce las 5 últimas nóminas mensuales: ");
				int total = 0;
				
				for (int i = 1; i <= 5; i++) {
					System.out.println("Introduce la nómina " + i);
					int nomina = teclado.nextInt();
					total += nomina;
					System.out.println("Nómina introducida");
				}
				
				double media = total / 5;
				if (media >= 2500) {
					media = media * 1.05;
				} else {
					media = media * 1.10;
				}
				System.out.println("Tu nuevo salario es: " + media);
			}
		}
		return resultado;
	}

}

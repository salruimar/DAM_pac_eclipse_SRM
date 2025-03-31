package ejercicios;
import java.util.*;
public class Ejercicio1_SRM {

	public static Scanner teclado =  new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (auditoriaEmpresa(10000, 5000, 4000, 7, true, 80000)) {
			System.out.println("Apto");
			System.out.println("Enhorabuena!! Ha pasado la auditor�a, nos vemos el a�o que viene");
		}
		
		
		
		teclado.close();
	}

	public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinista, int numeroOficinistas, boolean proyectosTerminados, double presupuestoEmpresa) {
		
		if (!proyectosTerminados) {
			System.out.println("No ha pasado la auditor�a ya que no ha terminado proyectos acordados");
			return false;
		}
		
		double gastoAcumulado = salarioJefe + salarioEncargado + salarioOficinista;
		
		if (gastoAcumulado > 20000) {
			System.out.println("No ha pasado la auditor�a ya que el gasto en personal excede el l�mite mensual de 20.000 euros");
			return false;
		} else {
			if (presupuestoEmpresa > 100000) {
				System.out.println("No ha pasado la auditor�a ya que el presupuesto asignado excede el l�mite establecido en 100.000 euros");
				return false;
			} else {
				return true;
			}
		}
	}
	
}

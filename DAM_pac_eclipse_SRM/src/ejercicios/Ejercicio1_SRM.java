package ejercicios;
import java.util.*;
public class Ejercicio1_SRM {

	public static Scanner teclado =  new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (auditoriaEmpresa(10000, 5000, 4000, 7, true, 80000)) {
			System.out.println("Apto");
			System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
		}
		
		
		
		teclado.close();
	}

	public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, double salarioOficinista, int numeroOficinistas, boolean proyectosTerminados, double presupuestoEmpresa) {
		
		if (!proyectosTerminados) {
			System.out.println("No ha pasado la auditoría ya que no ha terminado proyectos acordados");
			return false;
		}
		
		double gastoAcumulado = salarioJefe + salarioEncargado + salarioOficinista;
		
		if (gastoAcumulado > 20000) {
			System.out.println("No ha pasado la auditoría ya que el gasto en personal excede el límite mensual de 20.000 euros");
			return false;
		} else {
			if (presupuestoEmpresa > 100000) {
				System.out.println("No ha pasado la auditoría ya que el presupuesto asignado excede el límite establecido en 100.000 euros");
				return false;
			} else {
				return true;
			}
		}
	}
	
}

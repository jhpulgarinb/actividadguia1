import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese el sueldo actual del empleado: ");
			double sueldoActual = scanner.nextDouble();

			double aumento = Calculos.calcularAumento(sueldoActual);
			double nuevoSueldo = sueldoActual + aumento;

			System.out.println("El valor del aumento es: " + aumento);
			System.out.println("El nuevo sueldo del empleado es: " + nuevoSueldo);
		}
	  }
}

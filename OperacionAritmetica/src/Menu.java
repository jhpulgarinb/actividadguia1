import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese el primer número: ");
			int numero1 = scanner.nextInt();

			System.out.println("Ingrese el segundo número: ");
			int numero2 = scanner.nextInt();

			System.out.println("Ingrese el operador (+, -, *, /, %, **): ");
			String operador = scanner.next();

			try {
			  double resultado = Calculos.calcularOperacion(numero1, numero2, operador);
			  System.out.println("El resultado de la operación es: " + resultado);
			} catch (IllegalArgumentException e) {
			  System.out.println("Error: " + e.getMessage());
			}
		}
	  }

}

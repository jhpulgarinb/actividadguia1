import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese un número entero: ");
			int numero = scanner.nextInt();

			if (numero < 0 || numero >= 1000) {
			  System.out.println("Error: El número debe ser entre 0 y 999.");
			  return;
			}

			int decena = Calculos.obtenerDecena(numero);
			int unidad = Calculos.obtenerUnidad(numero);

			String unidadRomana = Calculos.convertirUnidadRomana(unidad);
			String decenaRomana = Calculos.convertirDecenaRomana(decena);

			System.out.println("El número " + numero + " en romano es: " + decenaRomana + unidadRomana);
		}
	  }
	
}

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese el nombre del día: ");
			String dia = scanner.next();

			try {
			  String diaManana = Calculos.obtenerDiaManana(dia);
			  System.out.println("El día de mañana es: " + diaManana);
			} catch (IllegalArgumentException e) {
			  System.out.println("Error: " + e.getMessage());
			}
		}
	  }

}

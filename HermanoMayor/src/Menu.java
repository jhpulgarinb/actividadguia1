import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
        System.out.println("Ingrese el nombre del primer hermano: ");
        try (Scanner scanner = new Scanner(System.in)) {
			String nombre1 = scanner.nextLine();

			System.out.println("Ingrese la edad del primer hermano: ");
			int edad1 = new Scanner(System.in).nextInt();

			System.out.println("Ingrese el nombre del segundo hermano: ");
			String nombre2 = new Scanner(System.in).nextLine();

			System.out.println("Ingrese la edad del segundo hermano: ");
			int edad2 = new Scanner(System.in).nextInt();

			System.out.println("Ingrese el nombre del tercer hermano: ");
			String nombre3 = new Scanner(System.in).nextLine();

			System.out.println("Ingrese la edad del tercer hermano: ");
			int edad3 = new Scanner(System.in).nextInt();

			String hermanoMayor = Calculos.obtenerHermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);

			System.out.println("El hermano mayor es: " + hermanoMayor);
		}
    }
	
}

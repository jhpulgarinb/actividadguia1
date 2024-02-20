import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
	    try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese el número de estudiantes de la universidad: ");
			int numeroEstudiantes = scanner.nextInt();

			System.out.println("Ingrese la capacidad de un salón: ");
			int capacidadSalon = scanner.nextInt();

			System.out.println("Ingrese el número de salones por piso: ");
			int salonesPorPiso = scanner.nextInt();

			int numeroSalones = Calculos.calcularNumeroSalones(numeroEstudiantes, capacidadSalon);
			int numeroPisos = Calculos.calcularNumeroPisos(numeroSalones, salonesPorPiso);

			System.out.println("El número de salones del nuevo edificio es: " + numeroSalones);
			System.out.println("El número de pisos del nuevo edificio es: " + numeroPisos);
		}
	  }

}

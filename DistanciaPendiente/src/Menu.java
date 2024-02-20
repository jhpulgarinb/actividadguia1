import java.util.Scanner;

public class Menu {
	  public static void main(String[] args) {
		    try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Ingrese la coordenada X del primer punto: ");
				double x1 = scanner.nextDouble();

				System.out.println("Ingrese la coordenada Y del primer punto: ");
				double y1 = scanner.nextDouble();

				System.out.println("Ingrese la coordenada X del segundo punto: ");
				double x2 = scanner.nextDouble();

				System.out.println("Ingrese la coordenada Y del segundo punto: ");
				double y2 = scanner.nextDouble();

				double distancia = Calculos.calcularDistancia(x1, y1, x2, y2);
				double pendiente = Calculos.calcularPendiente(x1, y1, x2, y2);

				System.out.println("La distancia entre los dos puntos es: " + distancia + " unidades");
				System.out.println("La pendiente de la recta que une los dos puntos es: " + pendiente);
			}
		  }

}

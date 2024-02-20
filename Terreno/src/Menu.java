import java.util.Scanner;

public class Menu {
	  public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);

		    System.out.println("Ingrese el lado A del terreno: ");
		    double ladoA = scanner.nextDouble();

		    System.out.println("Ingrese el lado B del terreno: ");
		    double ladoB = scanner.nextDouble();

		    System.out.println("Ingrese el lado C del terreno: ");
		    double ladoC = scanner.nextDouble();

		    double hipotenusa = Calculos.calcularHipotenusa(ladoA, ladoB);
		    double areaTriangulo = Calculos.calcularAreaTriangulo(ladoA, ladoB);
		    double areaRectangulo = Calculos.calcularAreaRectangulo(ladoC, hipotenusa);
		    double areaTotal = areaTriangulo + areaRectangulo;
		    double perimetro = Calculos.calcularPerimetroTerreno(ladoA, ladoB, ladoC);

		    System.out.println("El área total del terreno es: " + areaTotal + " metros cuadrados");
		    System.out.println("El perímetro del terreno es: " + perimetro + " metros");
		  }
}

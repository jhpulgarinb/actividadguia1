
public class Menu {  public static void main(String[] args) {
    double baseTriangulo = 5.0; 
    double alturaTriangulo = 3.0;
    
    double areaTriangulo = Triangulo.calcularAreaTriangulo(baseTriangulo, alturaTriangulo);

    System.out.println("El área del triángulo es: " + areaTriangulo + " metros cuadrados");
  }

}

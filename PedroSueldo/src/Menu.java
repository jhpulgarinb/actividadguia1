
public class Menu {
	 public static void main(String[] args) {
		    double sueldoPedro = 1000000.0; 

		    double gastoArriendo = Calculos.calcularGastoArriendo(sueldoPedro);
		    double gastoComida = Calculos.calcularGastoComida(sueldoPedro);
		    double dineroRestante = sueldoPedro - gastoArriendo - gastoComida;

		    System.out.println("Gasto en arriendo: $" + gastoArriendo);
		    System.out.println("Gasto en comida: $" + gastoComida);
		    System.out.println("Dinero restante: $" + dineroRestante);
		  }

	

}

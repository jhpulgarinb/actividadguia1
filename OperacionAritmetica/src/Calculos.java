
public class Calculos {
	public static double calcularOperacion(int numero1, int numero2, String operador) {
		  switch (operador) {
		    case "+":
		      return numero1 + numero2;
		    case "-":
		      return numero1 - numero2;
		    case "*":
		      return numero1 * numero2;
		    case "/":
		      return (double) numero1 / numero2;
		    case "%":
		      return numero1 % numero2;
		    case "**":
		      return Math.pow(numero1, numero2);
		    default:
		      throw new IllegalArgumentException("Operador no válido: " + operador);
		  }
		}

}


public class Calculos {
	public static double calcularDistancia(double x1, double y1, double x2, double y2) {
		  return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
		}

		public static double calcularPendiente(double x1, double y1, double x2, double y2) {
		  return (y2 - y1) / (x2 - x1);
		}

}

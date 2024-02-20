
public class Calculos {
	public static double calcularAumento(double sueldoActual) {
		  if (sueldoActual <= 800000) {
		    return sueldoActual * 0.1;
		  } else if (sueldoActual <= 1200000) {
		    return sueldoActual * 0.08;
		  } else {
		    return sueldoActual * 0.05;
		  }
		}
}

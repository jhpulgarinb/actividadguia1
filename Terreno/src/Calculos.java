
public class Calculos {
	public static double calcularAreaRectangulo(double base, double altura) {
		  return base * altura;
		}

		public static double calcularHipotenusa(double catetoA, double catetoB) {
		  return Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		}

		public static double calcularAreaTriangulo(double base, double altura) {
		  return (base * altura) / 2;
		}

		public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
		  return ladoA + ladoB + ladoC;
		}

}


public class Calculos {
	public static double calcularAreaCirculo(double radio) {
		  return Math.PI * Math.pow(radio, 2);
		}

		public static double calcularAreaCoronaCircular(double radioGrande, double radioPequeño) {
		  double areaCirculoGrande = calcularAreaCirculo(radioGrande);
		  double areaCirculoPequeño = calcularAreaCirculo(radioPequeño);
		  return areaCirculoGrande - areaCirculoPequeño;
		}

}

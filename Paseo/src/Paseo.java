
public class Paseo {
	public static int calcularNumeroSillasGordo(int numEstudiantesGordo) {
		  return numEstudiantesGordo * 2;
		}

	public static int calcularNumeroSillasFlaco(int numEstudiantesFlaco) {
		  return numEstudiantesFlaco;
		}

	public static int calcularNumeroBuses(int totalSillas, int numSillasBus) {
		  return (int) Math.ceil((double) totalSillas / numSillasBus);
		}

}

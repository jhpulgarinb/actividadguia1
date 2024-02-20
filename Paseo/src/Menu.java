public class Menu {

	public static void main(String[] args) {
		int numEstudiantesGordo = 10;
		int numEstudiantesFlaco = 15;
		int numSillasBus = 40;
    
		int totalSillasGordo = Paseo.calcularNumeroSillasGordo(numEstudiantesGordo);
		int totalSillasFlaco = Paseo.calcularNumeroSillasFlaco(numEstudiantesFlaco);
		int totalSillas = totalSillasGordo + totalSillasFlaco;
		int numBuses = Paseo.calcularNumeroBuses(totalSillas, numSillasBus);

		System.out.println("Número de estudiantes gordos: " + numEstudiantesGordo);
		System.out.println("Número de estudiantes flacos: " + numEstudiantesFlaco);
		System.out.println("Número total de sillas: " + totalSillas);
		System.out.println("Número de buses necesarios: " + numBuses);
  }
}
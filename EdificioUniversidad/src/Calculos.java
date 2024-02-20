
public class Calculos {
	public static int calcularNumeroSalones(int numeroEstudiantes, int capacidadSalon) {
		  return numeroEstudiantes / capacidadSalon;
		}

		public static int calcularNumeroPisos(int numeroSalones, int salonesPorPiso) {
		  return (numeroSalones + salonesPorPiso - 1) / salonesPorPiso;
		}

}

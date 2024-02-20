
public class Calculos {
	public static String obtenerDiaManana(String dia) {
		  switch (dia) {
		    case "lunes":
		      return "martes";
		    case "martes":
		      return "miercoles";
		    case "miercoles":
		      return "jueves";
		    case "jueves":
		      return "viernes";
		    case "viernes":
		      return "sabado";
		    case "sabado":
		      return "domingo";
		    case "domingo":
		      return "lunes";
		    default:
		      throw new IllegalArgumentException("Día no válido: " + dia);
		  }
		}
}


public class Calculos {
	public static int obtenerDecena(int numero) {
		  return numero / 10;
		}

		public static int obtenerUnidad(int numero) {
		  return numero % 10;
		}

		public static String convertirUnidadRomana(int unidad) {
		  switch (unidad) {
		    case 0:
		      return "";
		    case 1:
		      return "I";
		    case 2:
		      return "II";
		    case 3:
		      return "III";
		    case 4:
		      return "IV";
		    case 5:
		      return "V";
		    case 6:
		      return "VI";
		    case 7:
		      return "VII";
		    case 8:
		      return "VIII";
		    case 9:
		      return "IX";
		    default:
		      throw new IllegalArgumentException("Unidad no válida: " + unidad);
		  }
		}

		public static String convertirDecenaRomana(int decena) {
		  switch (decena) {
		    case 0:
		      return "";
		    case 1:
		      return "X";
		    case 2:
		      return "XX";
		    case 3:
		      return "XXX";
		    case 4:
		      return "XL";
		    case 5:
		      return "L";
		    case 6:
		      return "LX";
		    case 7:
		      return "LXX";
		    case 8:
		      return "LXXX";
		    case 9:
		      return "XC";
		    default:
		      throw new IllegalArgumentException("Decena no válida: " + decena);
		  }
		}
}

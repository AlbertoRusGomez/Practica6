package practica6;

/**
 * Clase Coche que contiene los atributos y m�todos que lo definen.
 * @author Alberto Rus G�mez
 * @version 1.0
 */

public class Coche {
	String matricula;
	String combustible;
	String modelo;
	String fabricante;
	
	/**
	 * Constructor vac�o (sin par�metros).
	 */
   
	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	/**
	 * Constructor con par�metros.
	 * @param m = matr�cula
	 * @param c = combustible
	 * @param mo = modelo
	 * @param f = fabricante
	 */
	
	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}
	
	/**
	 * M�todo por el cual obtendremos informaci�n de un objecto Coche en funci�n del tipo de combustible que tenga.
	 * @return Devuelve un String con la matr�cula, el fabricante y el modelo del coche, adem�s del consumo del mismo.
	 */

	public String metodoCombustibleCoche() {
		String resultado = "";
		if (combustible == "Gasolina") {
			resultado += "El coche con matricula " + matricula + " " + metodoGasolina(modelo, fabricante);
		} else if (combustible == "Diesel") {
			resultado += "El coche con matricula " + matricula + " " + metodoDiesel(modelo, fabricante);
		} else if (combustible == "H�brido") {
			resultado += "El coche con matricula " + matricula + " " + metodoHibrido(modelo, fabricante);
		} else {
			resultado += "El coche con matricula " + matricula + " no dispone de informaci�n";
		}
		return resultado;
	}
	
	/**
	 * M�todo para obtener el gasto de un coche de gasolina.
	 * @param modelo
	 * @param fabricante
	 * @return Devuelve un String con el fabricante, modelo y gasto de un coche de gasolina.
	 */
	
	public String metodoGasolina(String modelo, String fabricante) {
		String res = "es un " + fabricante + " " + modelo + " y gasta 1,337 euros por litro.";
		return res;
	}
	
	/**
	 * M�todo para obtener el gasto de un coche Diesel.
	 * @param modelo
	 * @param fabricante
	 * @return Devuelve un String con el fabricante, modelo y gasto de un coche Diesel.
	 */
	
	public String metodoDiesel(String modelo, String fabricante) {
		String res = "es un " + fabricante + " " + modelo + " y gasta 1,052 euros por litro.";
		return res;
	}
	
	/**
	 * M�todo para obtener el gasto de un coche H�brido.
	 * @param modelo
	 * @param fabricante
	 * @return Devuelve un String con el fabricante, modelo y gasto de un coche H�brido.
	 */
	
	public String metodoHibrido(String modelo, String fabricante) {
		String res = "es un " + fabricante + " " + modelo + " y no necesita combustible.";
		return res;
	}
}
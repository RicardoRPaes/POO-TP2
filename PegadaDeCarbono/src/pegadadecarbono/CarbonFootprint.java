package pegadadecarbono;

/**
 * Classe Interface CarbonFootprint, tem como seu dependente o metodo
 * getCarbonFoorprint, nela que será calculada a quantidade de carbono liberado
 * por elemento.
 * 
 * @version 0.9.0
 * @author Ricardo Paes
 * @author Thiago Alves
 */

public interface CarbonFootprint {

	/**
	 * Método responsável por calcular a quantidade de carbono liberado na
	 * atmosfera
	 * 
	 * @return quantidade de carbono - (double)
	 */

	double getCarbonFootprint();
}
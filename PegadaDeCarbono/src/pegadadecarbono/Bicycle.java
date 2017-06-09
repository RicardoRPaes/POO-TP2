package pegadadecarbono;

/**
 * Classe responsável por calcular o valor de carbono liberado por determinadas
 * bicicletas setadas pelo usuário
 *
 * @version 0.9.0
 * @author Ricardo Paes
 * @author Thiago Alves
 */

public class Bicycle implements CarbonFootprint {

	private double KmAnuais;
	private final int caloriasPorKM = 30;

	// Construtor
	public Bicycle(double KmAnuais) {
		this.KmAnuais = KmAnuais;
	}

	public double getKmAnuais() {
		return KmAnuais;
	}

	public void setKmAnuais(double KmAnuais) {
		this.KmAnuais = KmAnuais;
	}

	@Override
	public String toString() {
		return "Bicycle (" + "KmAnuais = " + KmAnuais + ')';
	}

	@Override
	public double getCarbonFootprint() {
		return KmAnuais * caloriasPorKM;
	}

}

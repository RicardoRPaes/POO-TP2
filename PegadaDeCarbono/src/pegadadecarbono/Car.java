package pegadadecarbono;

/**
 * Classe responsável por calcular o valor de carbono liberado por determinados
 * carros setados pelo usuário
 *
 * @version 0.9.0
 * @author Ricardo Paes
 * @author Thiago Alves
 */

public class Car implements CarbonFootprint {

	private double MediaKmAnuais;
	private double MediaMPG;
	private final int kgCO2PorKM = 8;

	public Car(double MediaKmAnuais, double MediaMPG) {
		this.MediaKmAnuais = MediaKmAnuais;
		this.MediaMPG = MediaMPG;
	}

	public double getMediaKmAnuais() {
		return MediaKmAnuais;
	}

	/**
	 * @param media
	 *            de MPG do carro (double)
	 */
	public void setMediaKmAnuais(double MediaKmAnuais) {
		this.MediaKmAnuais = MediaKmAnuais;
	}

	/**
	 * @return media de MPG do carro (double)
	 */
	public double getMediaMPG() {
		return MediaMPG;
	}

	public void setMediaMPG(double MediaMPG) {
		this.MediaMPG = MediaMPG;
	}

	@Override
	public String toString() {
		return "Car (" + "Media Km Anuais = " + MediaKmAnuais + ", Media MPG = " + MediaMPG + ')';
	}

	@Override
	public double getCarbonFootprint() {
		return ((getMediaKmAnuais() * getMediaMPG()) * kgCO2PorKM);
	}

}

package pegadadecarbono;

public class Building implements CarbonFootprint {

	private double MediaMensalKwh;
	private final int months = 15;

	public Building(double MediaMensalKwh) {
		this.MediaMensalKwh = MediaMensalKwh;
	}

	@Override
	public double getCarbonFootprint() {
		return getMediaMensalKwh() * months;
	}

	public double getMediaMensalKwh() {
		return MediaMensalKwh;
	}

	public void setMediaMensalKwh(double MediaMensalKwh) {
		this.MediaMensalKwh = MediaMensalKwh;
	}

	@Override
	public String toString() {
		return "Building{" + "MediaMensalKwh = " + MediaMensalKwh + '}';
	}

}

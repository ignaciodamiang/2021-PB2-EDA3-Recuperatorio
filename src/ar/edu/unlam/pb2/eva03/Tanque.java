package ar.edu.unlam.pb2.eva03;

public class Tanque extends Terrestre {

	private Double velocidad = 0.0;

	public Tanque(Integer idVehiculo, String nombreVehiculo) {
		super(idVehiculo, nombreVehiculo);
	}

	@Override
	public Double getVelocidad() {
		return velocidad;
	}

	@Override
	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

}

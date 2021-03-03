package ar.edu.unlam.pb2.eva03;

public class Terrestre extends Vehiculo implements ITerrestre{

	private Double velocidad = 0.0;

	public Terrestre(Integer idVehiculo, String nombreVehiculo) {
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

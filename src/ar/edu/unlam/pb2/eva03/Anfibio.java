package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements ITerrestre, IAcuatico {

	private Double profundidad = 0.0;
	private Double velocidad = 0.0;

	public Anfibio(Integer idVehiculo, String nombreVehiculo) {
		super(idVehiculo, nombreVehiculo);
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

	@Override
	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
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

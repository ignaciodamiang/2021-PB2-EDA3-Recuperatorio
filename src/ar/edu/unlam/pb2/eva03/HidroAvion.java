package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements IAcuatico, IVolador {

	private Double profundidad = 0.0;
	private Double altura = 0.0;

	public HidroAvion(Integer idVehiculo, String nombreVehiculo) {
		super(idVehiculo, nombreVehiculo);
	}

	@Override
	public Double getAltura() {
		return altura;
	}

	@Override
	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}

	@Override
	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}

}

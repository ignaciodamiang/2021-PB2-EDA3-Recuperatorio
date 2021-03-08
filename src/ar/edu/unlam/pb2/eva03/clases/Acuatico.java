package ar.edu.unlam.pb2.eva03.clases;

import ar.edu.unlam.pb2.eva03.interfaces.IAcuatico;

public class Acuatico extends Vehiculo implements IAcuatico{

	private Double profundidad = 0.0;

	public Acuatico(Integer idVehiculo, String nombreVehiculo) {
		super(idVehiculo, nombreVehiculo);
	}

	@Override
	public Double getProfundidad() {
		return profundidad ;
	}

	@Override
	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}
	
}

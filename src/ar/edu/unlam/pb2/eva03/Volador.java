package ar.edu.unlam.pb2.eva03;

public class Volador extends Vehiculo implements IVolador{

	private Double altura = 0.0;

	public Volador(Integer idVehiculo, String nombreVehiculo) {
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
}

package ar.edu.unlam.pb2.eva03.clases;

public class Vehiculo {
	
	private Integer idVehiculo;
	private String nombreVehiculo;

	public Vehiculo (Integer idVehiculo, String nombreVehiculo) {
		this.idVehiculo=idVehiculo;
		this.nombreVehiculo=nombreVehiculo;
	}

	public Integer getIdVehiculo() {
		return idVehiculo;
	}

	public String getNombreVehiculo() {
		return nombreVehiculo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVehiculo == null) ? 0 : idVehiculo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vehiculo))
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (idVehiculo == null) {
			if (other.idVehiculo != null)
				return false;
		} else if (!idVehiculo.equals(other.idVehiculo))
			return false;
		return true;
	}

}

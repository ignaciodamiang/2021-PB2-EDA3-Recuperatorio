package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Set;
import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	
	public Batalla(Double latitud, Double longitud, TipoDeBatalla tipo) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		this.vehiculosEnLaBatalla = new HashSet<Vehiculo>();
	}

	public Double getLatitud() {
		return latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}
	
	public Boolean vehiculoABatalla(Vehiculo vehiculoIngresado) {
		return vehiculosEnLaBatalla.add(vehiculoIngresado);
		
	}
}

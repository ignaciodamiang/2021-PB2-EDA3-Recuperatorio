package ar.edu.unlam.pb2.eva03.clases;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;
import ar.edu.unlam.pb2.eva03.interfaces.IAcuatico;
import ar.edu.unlam.pb2.eva03.interfaces.ITerrestre;
import ar.edu.unlam.pb2.eva03.interfaces.IVolador;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;

	public FuerzaArmada() {
		super();
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		convoy.add(vehiculo);
	}

	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipoBatalla, Double latitud, Double longitud) {

		Batalla batallaCreada = new Batalla(latitud, longitud, tipoBatalla);
		batallas.put(nombre, batallaCreada);
	}

	public Batalla getBatalla(String nombreBatalla) {
		return batallas.get(nombreBatalla);
	}

	public Boolean enviarALaBatalla(String nombreBatalla, Integer idVehiculo)
			throws VehiculoInexistente, VehiculoIncompatible {
		
		Boolean vehiculoExistente = false;
		for (Vehiculo i : convoy) {
			if (i.getIdVehiculo().equals(idVehiculo)) {
				vehiculoExistente = true;
			}
		}
		
		if (!vehiculoExistente) {
			throw new VehiculoInexistente("Vehiculo Inexistente");
		}

		TipoDeBatalla laBatalla = batallas.get(nombreBatalla).getTipo();

		switch (laBatalla) {
		case TERRESTRE: {

			for (Vehiculo i : convoy) {
				if (!(i instanceof ITerrestre || i instanceof Terrestre)) {
					throw new VehiculoIncompatible("Este vehiculo no es compatible con la batalla terrestre");
				}
				if (i.getIdVehiculo().equals(idVehiculo) && (i instanceof ITerrestre || i instanceof Terrestre)) {
					return batallas.get(nombreBatalla).vehiculoABatalla(i);
				}
			}
			throw new VehiculoInexistente("Vehiculo Inexistente");
		}

		case NAVAL: {
			for (Vehiculo i : convoy) {
				if (!(i instanceof IAcuatico || i instanceof Acuatico)) {
					throw new VehiculoIncompatible("Este vehiculo no es compatible con la batalla acuatica");
				}
				if (i.getIdVehiculo().equals(idVehiculo) && (i instanceof IAcuatico || i instanceof Acuatico)) {
					return batallas.get(nombreBatalla).vehiculoABatalla(i);
				}
			}
			throw new VehiculoInexistente("Vehiculo Inexistente");
		}

		case AEREA: {
			for (Vehiculo i : convoy) {
				if (!(i instanceof IVolador || i instanceof Volador)) {
					throw new VehiculoIncompatible("Este vehiculo no es compatible con la batalla aerea");
				}
				if (i.getIdVehiculo().equals(idVehiculo) && (i instanceof IVolador || i instanceof Volador)) {
					return batallas.get(nombreBatalla).vehiculoABatalla(i);
				}
			}
			throw new VehiculoInexistente("Vehiculo Inexistente");
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + laBatalla);
		}
	}
}

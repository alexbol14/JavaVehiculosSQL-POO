package com.alexbol.conductores;

import com.alexbol.vehiculos.Bus;

public class ConductorBus extends Conductor{
	public ConductorBus(String nombre, String tipoLicencia, Bus bus) {
		super(nombre, tipoLicencia);
		this.setBus(bus);
	}

	private Bus bus;
	//GETTER UND SETTER
	
	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}
	//POLIFORMISMO

	@Override
	public void mostrarVehiculo() {
		super.mostrarVehiculo();
		System.out.println(getBus().getMatricula());
	}

}

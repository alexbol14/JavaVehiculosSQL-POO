package com.alexbol.vehiculos;

import java.util.ArrayList;

public class Bus extends Vehiculo{

	private ArrayList<String> estaciones;
	//CONSTRUCTOR
	public Bus(String matricula, String marca, String modelo, int anio) {
		super(matricula, marca, modelo, anio);
	}
	//GETTER - SETTER
	public ArrayList<String> getEstaciones() {
		return estaciones;
	}
	public void setEstaciones(ArrayList<String> estaciones) {
		this.estaciones = estaciones;
	}	

}

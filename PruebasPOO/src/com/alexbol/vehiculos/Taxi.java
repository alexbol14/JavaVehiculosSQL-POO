package com.alexbol.vehiculos;

//Utilizando extends estoy haciendo herencia
//La clase Taxi es una SUBCLASE que extiende de la SUPERCLASE Vehiculo
public class Taxi extends Vehiculo{
	//Se debe añadir por lo menos un constructor dentro
	//de la subclase
	public Taxi(String matricula, String marca, String modelo, int anio) {
		super(matricula, marca, modelo, anio);

	}

}

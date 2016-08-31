package com.alexbol.conductores;

import com.alexbol.vehiculos.Taxi;

public class ConductorTaxi extends Conductor{
	//Genero el Constructor y le adiciono la variable taxi
	//El constructor se genero con las variables de la clase padre,
	//sin embargo tengo permitido adicionar variables.
	public ConductorTaxi(String nombre, String tipoLicencia, Taxi taxi){
		super(nombre, tipoLicencia);
		//this hace referencia a los elementos de la Clase en la que estoy ubicado
		this.taxi = taxi;
	}
	//Declaro la variable taxi
	private Taxi taxi;
	//Genero GETTERS UND SETTERS
	public Taxi getTaxi() {
		return taxi;
	}
	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}
	
	//SOBREESCRIBIR UN METODO ---> POLIFORMISMO
	//Clic derecho 	Source -> Override/Implement Methode...
	//Selecciono el metodo mostrarVehiculo de la clase padre
	@Override
	public void mostrarVehiculo() {
		super.mostrarVehiculo();
		//Le añado comportamiento adicional al metodo mostrarVehiculo (viene de
		//la clase padre), asi que el metodo actual se comporta diferente
		//al de su padre. -->POLIFORMISMO
		System.out.println(getTaxi().getMatricula());
	}
	
	
}

package com.alexbol.vehiculos;

import java.util.ArrayList;

public class Principal {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  //INICIALIZO EL OBJETO
  //Puse los 2 objetos obligatorios que estan definido en el Constructor
  //de la clase Vehiculo dentro del parentesis
  Vehiculo miVehiculo = new Vehiculo("ABC231","Toyota");
  //Puedo asignarle mas valores al resto de atributos que no son obligatorios
  miVehiculo.setModelo("hilux");
  
  //IMPRIMO EL VALOR DE LAS VARIABLES LEYENDOLOS CON LOS GETTERS
  System.out.println(miVehiculo.getMatricula());
  System.out.println(miVehiculo.getMarca());
  System.out.println(miVehiculo.getModelo());
  System.out.println(miVehiculo.getAnio());
  
  //LLAMADO DE METODOS
  miVehiculo.arrancar();
  miVehiculo.frenar();
  miVehiculo.reverza();
  miVehiculo.arrancar();
  
  /*
  //EJEMPLO COMO FUNCIONA UN ARRAYLIST
  ArrayList<Integer> miLista = new ArrayList<Integer>();
  miLista.add(1);
  miLista.add(2);
  miLista.add(3);
  for(Integer i: miLista){
	  System.out.println(i);
  }*/
  //Creo una lista de arreglos del objeto Vehiculo
  ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
  vehiculos.add(miVehiculo);
  //asigno valores con la restriccion del PRIMER constructor
  vehiculos.add(new Vehiculo("ABC332", "BMW"));
  vehiculos.add(new Vehiculo("BBB123", "Chevrolet"));
  //asigno valores con la restriccion del SEGUNDO constructor
  vehiculos.add(new Vehiculo("AKJ333", "Mercedes", "C103", 2014));
  vehiculos.add(new Vehiculo("CCC123", "Merecedez Benz", "s10", 2014));
  
  //Iteracion de la Lista de vehiculos
  //El for contiene el Tipo de dato que estoy manejando en la coleccion (Vehiculo)
  for(Vehiculo vehiculo : vehiculos){
	  
	  System.out.println(vehiculo.getMatricula());
	  System.out.println(vehiculo.getMarca());
	  System.out.println(vehiculo.getModelo());
	  System.out.println(vehiculo.getAnio());
  }

 }

}
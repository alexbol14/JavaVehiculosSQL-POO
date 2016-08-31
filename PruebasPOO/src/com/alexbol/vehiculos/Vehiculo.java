package com.alexbol.vehiculos;
public class Vehiculo {
	 
	//ATRIBUTOS, Los vuelvo privados para que solo sean accesibles desde
	//esta clase (A ESTO SE LE LLAMA ENCAPSULAMIENTO)
	//De manera que si otra clase los quieren consumir, tendran
	//que usar los metodos GETTER Y SETTER que creo aqui.
	//--Esto es una buena practica de POO	
	 private String  matricula;
	 private String  marca;
	 private String  modelo;
	 private int   anio;
	 
	 //Creo un Constructor(instanciar objeto Vehiculo) con el cual puedo hacer 
	 //que el objeto siempre que se cree el objeto sea OBLIGATORIO asignarle 
	 //determinados atributos. Este constructor lo puedo crear con clic derecho
	 //Source ->Generate Contructor using..
	 public Vehiculo(String matricula, String marca) {
		super();
		//LLAMADA DEL METODO setMatricula LOCALMENTE
		//Agrego la siguiente linea de codigo para que el objeto este obligado a
		//cumplir la instruccion que escribi en el SETTER de matricula.
		//Si lo quisiera podria aqui dentro del Constructor escribir las condiciones
		//para no tener que escribirlas dentro del SETTER
		setMatricula(matricula);
		
		this.matricula = matricula;
		this.marca = marca;
	}
	 
	//Creo un nuevo Contructor que haga que todos los atributos sean obligatorios
	//Puedo Tener los constructores que yo desee, eso no es problema 
	//Cuando creo dentro de una clase dos metodos con el mismo nombre
	 //recibe el nombre de sobrecarga de metodos
	 public Vehiculo(String matricula, String marca, String modelo, int anio) {
		super();
		//LLamo nuevamente el SETTER para que se cumpla la condicion
		setMatricula(matricula);
		
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}

	 //GETTERS AND SETTERS, los puedo generar a partir de clic derecho,
	 //Me sirven para:
	 //GETTERS= obtener valor de una variable
	 //SETTERS= establecer o cambiar el valor de una variable
	 //Gracias a estos puedo asignarle valores a las variables (que defini
	 //en esta clase como privadas) desde otras clases que instancien el
	 //objeto que tiene dichos atributos. Ademas puedo poner diferentes
	 //restricciones o comportamiento dentro de estos GETTERS AND SETTERS

	 public String getMarca() {
	  return marca;
	 }



	 public void setMarca(String marca) {
	  this.marca = marca;
	 }



	 public String getModelo() {
	  return modelo;
	 }



	 public void setModelo(String modelo) {
	  this.modelo = modelo;
	 }



	 public int getAnio() {
	  return anio;
	 }



	 public void setAnio(int anio) {
	  this.anio = anio;
	 }



	 public String getMatricula() {
	  return matricula;
	 }

	 public void setMatricula(String matricula) {
	   //Le asigno una restriccion de que la matricula siempre debe ser de un largo de 6
	   //caracteres, para que cuando le quieran asignar un valor cumpla esta regla	 
	   if (matricula.length() == 6) {
		   this.matricula = matricula;
	   }else{
		   System.out.println("La matricula debe ser de 6 caracteres");
	   }
	  
	 }

	 //METODOS
	 //Lower Camel Case
	 public void arrancar(){
	  System.out.println("El vehiculo arrancó");
	 }
	 
	 public void frenar(){
	  System.out.println("El vehiculo frenó");
	 }
	 
	 public void reverza(){
	  System.out.println("El vehiculo esta de reverza");
	 }
	 
	 
	}
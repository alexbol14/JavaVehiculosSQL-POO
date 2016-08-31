package com.alexbol.vehiculos;

import java.sql.SQLException;
import java.sql.Statement;

import com.alexbol.datenbank.DatenBank;

public class TaxiCRUD {
	//la variable TIPO se encargara de llenar el campo id_tipo_vehiculo
	//de la tabla de la base de datos. Para el caso de los taxis este
	//codigo siempre sera 1, por lo cual se pone con private final para
	//que nadie mas lo modifique.
	private final String TIPO ="1";
	//Escribo un metodo que recibe como parametro de entrada un objeto Taxi(SUPERCLASE)
	public void insertar(Taxi taxi) throws SQLException{
		String query ="";
		//Statement me permite ejecutar el query
		Statement sentencia = null;
		
		query="insert into vehiculo values('"+taxi.getMatricula()+"','"+taxi.getMarca()+"','"+taxi.getModelo()+"','"+taxi.getAnio()+"','"+TIPO+"');";
		DatenBank datenBank = new DatenBank();
		sentencia=datenBank.conectar().createStatement();
		
		if (sentencia.executeUpdate(query)>0){
			System.out.println("Registro insertado OK");
		}
		else{
			System.out.println("No se pudo insertar registro");
			System.out.println(query);
		}
	}
	
	//QUEDA PENDIENTE CREAR EL CODIGO PARA QUE HAGA ESTAS FUNCIONES
	public void eliminar(){
		
	}
	public void actualizar(){
		
	}

}

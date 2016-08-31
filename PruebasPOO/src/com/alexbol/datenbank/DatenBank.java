package com.alexbol.datenbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatenBank {
	//Al poner 'final' en los siguientes atributos
	//hace referencia a que nadie mas las podra modificar
	//private final String URL="jdbc:sqlserver://localhost:1433";
	private final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Transporte;user=SA;password=kol1234";

	private final String DB ="Transporte";
	private final String USUARIO ="SA";
	private final String PASSWORD ="kol1234";
	
	public Connection conexion = null;
	
	public Connection conectar(){
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//conexion = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
			conexion = DriverManager.getConnection(URL);
			if (conexion != null){
					System.out.println("conexion Exitosa");
			}
		}
		catch (SQLException sqle){
			sqle.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			return conexion;
		}
	}
	
}

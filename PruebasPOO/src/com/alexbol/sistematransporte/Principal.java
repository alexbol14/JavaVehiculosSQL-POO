package com.alexbol.sistematransporte;
import java.sql.SQLException;

import com.alexbol.datenbank.*;
import com.alexbol.vehiculos.Taxi;
import com.alexbol.vehiculos.TaxiCRUD;
public class Principal {

	public static void main(String[] args) throws SQLException {
		//DatenBank datenBank = new DatenBank();
		//datenBank.conectar();
		
		Taxi taxi = new Taxi("ABC456", "Mazda", "Allegro", 2010);
		//taxi.setAnio(2012);
		
		TaxiCRUD taxiCRUD = new TaxiCRUD();
		taxiCRUD.insertar(taxi);
	}

}

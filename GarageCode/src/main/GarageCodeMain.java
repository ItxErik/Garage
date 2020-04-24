package main;

import Factory.VehicleFactory;
import manager.Manager;
import obj.Auto;
import obj.Furgone;
import obj.Garage;
import obj.Moto;
import obj.TipoVeicolo;

public class GarageCodeMain {

	public static void main(String[] args) {
		
		VehicleFactory vf = new VehicleFactory();
		Garage g = new Garage();
		
		//SIMULAZIONE
		Auto auto = (Auto) vf.getVehicle(TipoVeicolo.AUTO); 
		Manager.addVehicle(auto, g);
		Moto moto =(Moto) vf.getVehicle(TipoVeicolo.MOTO);
		Manager.addVehicle(moto, g);
		Furgone furgone = (Furgone) vf.getVehicle(TipoVeicolo.FURGONE);
		Manager.addVehicle(furgone, g);
		
		
		g.getAll();
		
		Manager.removeVehicle(moto, g);
		
		g.getAll();
		
		Manager.addVehicle(moto, g);
		
		g.getAll();		
	}
	
}

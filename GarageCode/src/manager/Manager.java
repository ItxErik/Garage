package manager;

import obj.Garage;
import obj.Veicolo;

public class Manager {
	
	public static void addVehicle(Veicolo v, Garage g) {
		if (g.add(v)){
			System.out.println("Veicolo inserito al posto:"+g.getNumber(v));
		}else {
			System.err.println("Veicolo non aggiunto al garage");
		}
	}
	
	public static void removeVehicle(Veicolo v, Garage g) {
		if(g.remove(v)) {
			System.out.println("Veicolo tolto correttamente!");
		}else {
			System.err.println("Problema nel rimuovere il veicolo");
		}
	}
}

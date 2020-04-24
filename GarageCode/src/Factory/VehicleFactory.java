package Factory;

import java.util.Scanner;

import obj.Auto;
import obj.Furgone;
import obj.Moto;
import obj.TipoVeicolo;
import obj.Veicolo;


public class VehicleFactory {
	
	public Veicolo getVehicle(TipoVeicolo tipo) {
		
		System.out.println("\nCREAZIONE " +tipo);
		Scanner scan = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		
		System.out.println("MARCA:");
		String marca=scan.nextLine();
		
		System.out.println("ANNO:");
		int anno =scanInt.nextInt();
		
		System.out.println("CILINDRATA:");
		int cilindrata=scanInt.nextInt();
		
		switch (tipo) {
		case AUTO: {
			System.out.println("PORTE:");
			int porte=scanInt.nextInt();
			System.out.println("ALIMENTAZIONE:");
			String alimentazione=scan.nextLine();
			
			Auto auto = new Auto(tipo, marca, anno, cilindrata, porte, alimentazione);
			return auto;
		}
		case MOTO: {
			System.out.println("TEMPI:");
			int tempi=scanInt.nextInt();
			Moto moto = new Moto(tipo, marca, anno, cilindrata, tempi);
			return moto;
		}
		
		case FURGONE: {
			System.out.println("CAPACITA':");
			int capacita=scanInt.nextInt();
			Furgone furgone = new Furgone(tipo, marca, anno, cilindrata, capacita);
			return furgone;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
	}
}

package obj;

import java.util.HashMap;
import java.util.Map.Entry;

public class Garage {
	
	private final int posti = 14;
	
	private HashMap<Integer, Veicolo> garage = new HashMap<Integer, Veicolo>();
	
	public boolean add(Veicolo v) {
		boolean result = true;
		if(garage.isEmpty()) {
			garage.put(0, v); //First car inside
		}else {
			for (int i = 0; i != posti; i++) {
				if(garage.containsKey(i)) {
					if(garage.get(i) == null) {
						garage.put(i, v);
						//TODO log system
						result=true;
						break;
					}
				}else {
					garage.put(i, v);
					//TODO log system
					result=true;
					break;
				}
			}
		}
		return result;
	}
	
	public boolean remove(Veicolo v) {
		boolean result = false;
		if(!garage.isEmpty()) {
			for (Entry<Integer, Veicolo> entry : garage.entrySet()) {
				if(entry.getValue().equals(v)) {
					garage.put(entry.getKey(), null);
					result=true;
				}
			}
		}
		return result;
	}
	
	public void getAll() {
		if(!garage.isEmpty()) {
			for (Entry<Integer, Veicolo> entry : garage.entrySet()) {
				if(entry.getValue() == null) {
					System.out.println(entry.getKey() + "|" + "VUOTO");
				}else {
					System.out.println(entry.getKey()+"|"+entry.getValue().getTipo());					
				}
			}			
		}
	}
	
	public int getNumber(Veicolo v) {
		int posto = 0;
		for (Entry<Integer, Veicolo> entry : garage.entrySet()) {
			if(entry.getValue().equals(v)) {
				posto = entry.getKey();
			}
		}
		return posto;
	}

}

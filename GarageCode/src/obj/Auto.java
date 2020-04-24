package obj;

public class Auto extends Veicolo{
	
	private int porte;
	private String alimentazione;

	public Auto(TipoVeicolo tipo, String marca, int anno, int cilindrata, int porte, String alimentazione) {
		super(tipo, marca, anno, cilindrata);
		this.porte=porte;
		this.alimentazione=alimentazione;
	}

	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
	}

	public String getAlimentazione() {
		return alimentazione;
	}

	public void setAlimentazione(String alimentazione) {
		this.alimentazione = alimentazione;
	}
	
	

}

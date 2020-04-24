package obj;

public class Furgone extends Veicolo {

	private int capacita;

	public Furgone(TipoVeicolo tipo, String marca, int anno, int cilindrata, int capacita) {
		super(tipo, marca, anno, cilindrata);
		this.capacita = capacita;
	}

	public int getCapacita() {
		return capacita;
	}

	public void setCapacita(int capacita) {
		this.capacita = capacita;
	}

}

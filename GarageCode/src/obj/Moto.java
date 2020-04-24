package obj;

public class Moto extends Veicolo{

	private int tempi;

	public Moto(TipoVeicolo tipo, String marca, int anno, int cilindrata, int tempi) {
		super(tipo, marca, anno, cilindrata);
		this.tempi=tempi;
	}

	public int getTempi() {
		return tempi;
	}

	public void setTempi(int tempi) {
		this.tempi = tempi;
	}
	
}

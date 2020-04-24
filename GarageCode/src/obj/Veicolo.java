package obj;

public class Veicolo {

	private TipoVeicolo tipo;
	private String marca;
	private int anno;
	private int cilindrata;

	public Veicolo(TipoVeicolo tipo, String marca, int anno, int cilindrata) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.anno = anno;
		this.cilindrata = cilindrata;
	}

	public TipoVeicolo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVeicolo tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}

}

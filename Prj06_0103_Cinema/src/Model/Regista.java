package Model;

public class Regista extends Persona {
	private String tipoRegia;

	public Regista() {

	}

	public Regista(String tipoRegia) {
		super();
		this.tipoRegia = tipoRegia;
	}

	public String getTipoRegia() {
		return tipoRegia;
	}

	public void setTipoRegia(String tipoRegia) {
		this.tipoRegia = tipoRegia;
	}

	@Override
	public String toString() {
		return "tipoRegia: " + tipoRegia;
	}
}

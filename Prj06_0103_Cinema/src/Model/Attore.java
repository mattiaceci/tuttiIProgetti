package Model;

public class Attore extends Persona {
	private String tipoRecitazione;

	public Attore() {

	}

	public Attore(String tipoRecitazione) {
		super();
		this.tipoRecitazione = tipoRecitazione;
	}

	public String getTipoRecitazione() {
		return tipoRecitazione;
	}

	public void setTipoRecitazione(String tipoRecitazione) {
		this.tipoRecitazione = tipoRecitazione;
	}

	@Override
	public String toString() {
		return "tipoRecitazione: " + tipoRecitazione;
	}
}

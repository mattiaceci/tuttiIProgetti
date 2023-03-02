package Controller;

public class Colore {
	
	private String descrizione;
	
	public Colore() {
		
	}

	public Colore(String descrizione) {
		super();
		this.descrizione = descrizione;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	@Override
	public String toString() {
		return "Descrizione: " + descrizione;
	}
}

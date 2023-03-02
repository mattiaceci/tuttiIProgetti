package Controller;

public class Materiale {
	private String descrizione;
	private Colore colore;
	private boolean reciclabile;
	private boolean infiammabile;
	
	public Materiale() {
		
	}
	
	public Materiale(String descrizione, Colore colore, boolean reciclabile, boolean infiammabile) {
		super();
		this.descrizione = descrizione;
		this.colore = colore;
		this.reciclabile = reciclabile;
		this.infiammabile = infiammabile;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Colore getColore() {
		return colore;
	}

	public void setColore(Colore colore) {
		this.colore = colore;
	}

	public boolean isReciclabile() {
		return reciclabile;
	}

	public void setReciclabile(boolean reciclabile) {
		this.reciclabile = reciclabile;
	}

	public boolean isInfiammabile() {
		return infiammabile;
	}

	public void setInfiammabile(boolean infiammabile) {
		this.infiammabile = infiammabile;
	}

	@Override
	public String toString() {
		return "Materiale [descrizione=" + descrizione + ", colore=" + colore + ", reciclabile=" + reciclabile
				+ ", infiammabile=" + infiammabile + "]";
	}
}

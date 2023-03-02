package Controller;
//creazione oggetto bottiglia
public class Bottiglia {
	private Materiale materiale;
	private String capacità;
	private Colore colore;
	
	public Bottiglia() {
		
	}
	
	public Bottiglia(Materiale materiale, String capacità, Colore colore) {
		super();
		this.materiale = materiale;
		this.capacità = capacità;
		this.colore = colore;
	}
	public Materiale getMateriale() {
		return materiale;
	}
	public void setMateriale(Materiale materiale) {
		this.materiale = materiale;
	}
	public String getCapacità() {
		return capacità;
	}
	public void setCapacità(String capacità) {
		this.capacità = capacità;
	}
	public Colore getColore() {
		return colore;
	}
	public void setColore(Colore colore) {
		this.colore = colore;
	}

	@Override
	public String toString() {
		return "materiale=" + materiale + ", capacità=" + capacità + ", colore=" + colore;
	}
}

package Model;

public class Cinema {
	private String nome;
	private String citta;
	private String indirizzo;
	private int numeroPosti;

	public Cinema() {

	}

	public Cinema(String nome, String citta, String indirizzo, int numeroPosti) {
		super();
		this.nome = nome;
		this.citta = citta;
		this.indirizzo = indirizzo;
		this.numeroPosti = numeroPosti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Città: " + citta + ", Indirizzo: " + indirizzo + ", Numero di Posti: "
				+ numeroPosti;
	}
}

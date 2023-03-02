package Model;

public class Persona {
	private String nome;
	private String cognome;
	private int eta;
	private int nTelefono;

	public Persona() {

	}

	public Persona(String nome, String cognome, int eta, int nTelefono) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.nTelefono = nTelefono;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public int getnTelefono() {
		return nTelefono;
	}

	public void setnTelefono(int nTelefono) {
		this.nTelefono = nTelefono;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Cognome: " + cognome + ", Età: " + eta + ", Numero di Telefono: " + nTelefono;
	}
}

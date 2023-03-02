package Controller;

import java.time.LocalDate;

public class Studente extends Persona{
	private String matricola;
	private LocalDate dataImmatricolazione;
	private String numTelefono;
	
	
	
	
	public Studente() {
		
	}
	
	public Studente(String matricola, LocalDate dataImmatricolazione, String numTelefono) {
		super();
		this.matricola = matricola;
		this.dataImmatricolazione = dataImmatricolazione;
		this.numTelefono = numTelefono;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public LocalDate getDataImmatricolazione() {
		return dataImmatricolazione;
	}

	public void setDataImmatricolazione(LocalDate dataImmatricolazione) {
		this.dataImmatricolazione = dataImmatricolazione;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", dataImmatricolazione=" + dataImmatricolazione + ", numTelefono="
				+ numTelefono + "]";
	}
}

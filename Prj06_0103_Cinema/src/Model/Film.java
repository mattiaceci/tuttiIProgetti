package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Film {
	private String titolo;
	private String genere;
	private Regista regista;
	private Double durata;
	private LocalDate dataUscita;
	private ArrayList<Attore> attori = new ArrayList<Attore>();

	
	public static void stampaLista(List<Attore> a) {
		Iterator<Attore> aIterato = a.iterator();

		while (aIterato.hasNext()) {
			Attore testAttore = aIterato.next();
			System.out.println(testAttore.getCognome());
		}
	}
	
	public Film() {

	}

	public Film(String titolo, String genere, Regista regista, Double durata, LocalDate dataUscita,
			ArrayList<Attore> attori) {
		super();
		this.titolo = titolo;
		this.genere = genere;
		this.regista = regista;
		this.durata = durata;
		this.dataUscita = dataUscita;
		this.attori = attori;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public Regista getRegista() {
		return regista;
	}

	public void setRegista(Regista regista) {
		this.regista = regista;
	}

	public Double getDurata() {
		return durata;
	}

	public void setDurata(Double durata) {
		this.durata = durata;
	}

	public LocalDate getDataUscita() {
		return dataUscita;
	}

	public void setDataUscita(LocalDate dataUscita) {
		this.dataUscita = dataUscita;
	}

	public ArrayList<Attore> getAttori() {
		return attori;
	}

	public void setAttori(ArrayList<Attore> attori) {
		this.attori = attori;
	}

	@Override
	public String toString() {
		return titolo + "\n, Genere: " + genere + "\n, Regista: " + regista + "\n, Durata=" + durata
				+ "\n, Data di Uscita: " + dataUscita + "\n, Attori=" + attori;
	}
}

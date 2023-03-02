package Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Model.Attore;
import Model.Cinema;
import Model.Film;
import Model.Regista;

//esempio di utilizzo extends
public class C01 {
	public static void main(String[] args) {
		Cinema cinema = new Cinema();
		cinema.setNome("The space");
		cinema.setCitta("Guidonia");
		cinema.setIndirizzo("Via Roma");
		cinema.setNumeroPosti(150);

		Regista regista = new Regista();
		regista.setNome("franco");
		regista.setCognome("cecchi");
		regista.setEta(67);
		regista.setnTelefono(123456789);
		regista.setTipoRegia("comico");

		Attore attore = new Attore();
		attore.setNome("mattia");
		attore.setCognome("ceci");
		attore.setEta(76);
		attore.setnTelefono(987654321);
		attore.setTipoRecitazione("comico");

		ArrayList<Attore> attori = new ArrayList<Attore>();
		attori.add(attore);
		attori.add(attore);
		attori.add(attore);
		attori.add(attore);
		attori.add(attore);

		Film film = new Film();
		film.setTitolo("rocky");
		film.setGenere("azione");
		film.setDurata(2.12);
		film.setRegista(regista);
		film.setDataUscita(LocalDate.now());
		film.setAttori(attori);

		System.out.println(
				"Il regista del film: " + film + "\n è: " + regista + "\n, verrà proiettato nel cinema: " + cinema);

		List<Attore> attor = new ArrayList<Attore>();
		attor.add(attore);
		attor.add(attore);
		attor.add(attore);
		attor.add(attore);
		Film.stampaLista(attor);
		

		
		List<Regista> regist = new ArrayList<Regista>();
		regist.add(regista);
		regist.add(regista);
		regist.add(regista);
		regist.add(regista);

		Iterator<Regista> rIterato = regist.iterator();

		while (rIterato.hasNext()) {
			Regista testRegista = rIterato.next();
			System.out.println(testRegista.getCognome());

		}

	}
}

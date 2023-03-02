package Controller;

import java.time.LocalDate;

public class C01 {

	public static void main(String[] args) {
		Studente studente = new Studente();
		studente.setNome("mattia");
		studente.setCognome("ceci");
		studente.setDataImmatricolazione(LocalDate.now());
		studente.setMatricola("123456789");
		studente.setNumTelefono("3285634937");
		
		System.out.println(studente);

	}

}

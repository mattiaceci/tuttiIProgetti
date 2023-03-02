package Controller;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Scanner;

public class C04 {
//ESEMPI ARRAY
	public static void main(String[] args) {
		//String array[] = new String[5]; //creazione di un array lungo 5 caselle
		Scanner scanner = new Scanner(System.in);
		boolean bool = false;
		String[] elenco = {
				"giovanni, pace, #12345",
				"Mario, Rossi, #123456",
				"Valeria, Verdi, #1234567"
		};
		
		System.out.print("Inserisci la marticola ricercata: ");
		String matricola = scanner.nextLine();
		
		for(int i = 0; i < elenco.length; i++) {
			String[] prov = elenco[i].split(",");
			if(prov[2].trim().equals(matricola)) { 
				//Split divide la stringa ogni qual volta viene trovat oil paramentro inserito 
				//Trim elimina tutti i spazi vuoti 
				System.out.println("Lo studente ricercato è: " + elenco[i]);
				bool = true;
			}
		}
		if(!bool) {
			System.out.println("Lo studente ricercato non è presente nell' array");
		}
		
	}
}

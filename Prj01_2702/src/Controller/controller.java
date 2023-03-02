package Controller;

import java.util.Iterator;
import java.util.Scanner;

public class controller {

	public static void main(String[] args) {
		/*System.out.println("Ciao mondo!");
		System.out.println(3);
		System.out.println(358);
		System.out.println(50000);
		System.out.println(3+3);
		System.out.println(3*2);
		
		System.out.println("---------------");
		
		int x = 3;
		System.out.println(x);
		String str = "ciao";
		System.out.println(str);
		Boolean bool = true;
		System.out.println(bool);
		char c = 'a';
		System.out.println(c);
		
		System.out.println("---------------");
		
		final int costante = 10; //è l'equivalente di una costante
		System.out.println("variabile costante: " + costante);
		
		System.out.println("---------------");
		
		String a = "Ciao sono";
		String b = "Mattia";
		
		String ab = a + " " + b;
		System.out.println(ab);
		System.out.println(ab);
		System.out.println(ab);
		
		ab = ab.replace('i', '1');
		System.out.println(ab);
		
		int v = ab.indexOf('1');
		ab = ab.substring(v);
		System.out.println(ab);
		
		System.out.println("---------------");*/
		
		
		
		
		
		
		
		
		
		
		
		/*String frase = "ciao sono mattia";
		frase = frase.replace('i', '1'); 
		// sostituisce tutti le i con un 1
		int posizione = frase.indexOf('1'); 
		//indexOf restituisce la posizione di 1 all'interno della stringa oppure -1 nel caso in cui non sia presente
		
		if(posizione>0) {
			System.out.println(frase.substring(posizione + 1)); //con il +1 stampiamo la stringa dal carattere cercato in poi
		}else {
			System.out.println("Il carattere ricercato non è presente nella frase!");
		}*/
		
		//input di codice fiscale e lo spacchetti per ogni carattere: string città, mese, nome, cognome
		
		//CCEMTT03T12H501B
		//1234567890123456
		
		System.out.print("Inserisci il tuo codice fiscale: ");
		Scanner in = new Scanner(System.in);
		String codiceFiscale = in.nextLine();
		codiceFiscale = codiceFiscale.toUpperCase();
		
		if (codiceFiscale.length() != 16) {
			System.out.println("Codice fiscale errato!");
		}else {
			System.out.println("Il cognome è: " + codiceFiscale.substring(0, 3));
			
			System.out.println("Il nome è: " + codiceFiscale.substring(3, 6));
			
			System.out.println("L'anno è: " + codiceFiscale.substring(6, 8));
			
			switch(codiceFiscale.substring(8, 9)) {
			case "A":
				System.out.println("Il mese è: Gennaio");
				break;
			case "B":
				System.out.println("Il mese è: Febbraio");
				break;
			case "C":
				System.out.println("Il mese è: Marzo");
				break;
			case "D":
				System.out.println("Il mese è: Aprile");
				break;
			case "E":
				System.out.println("Il mese è: Maggio");
				break;
			case "H":
				System.out.println("Il mese è: Giugno");
				break;
			case "L":
				System.out.println("Il mese è: Luglio");
				break;
			case "M":
				System.out.println("Il mese è: Agosto");
				break;
			case "P":
				System.out.println("Il mese è: Settembre");
				break;
			case "R":
				System.out.println("Il mese è: Ottobre");
				break;
			case "S":
				System.out.println("Il mese è: Novembre");
				break;
			case "T":
				System.out.println("Il mese è: Dicembre");
				break;
			}
			
			String sesso = codiceFiscale.substring(9, 11);
			int sex = Integer.parseInt(sesso);
			if(sex < 40){
				System.out.println("Sesso: Uomo");
			}else {
				System.out.println("Sesso: Donna");
				sex = sex - 40;
				System.out.println("Il giorno è: " + sex);
			}
			
			System.out.println("Il codice municipale è: " + codiceFiscale.substring(11, 15));
			
			System.out.println("Il carattere di controllo è: " + codiceFiscale.substring(15, 16));
			
			
		}	
	}
	
}

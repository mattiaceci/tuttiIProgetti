package Controller;

import java.util.ArrayList;
import java.util.Scanner;

public class C05 {
/* creare un sistema di gestione della proprio lista dell spesa
 * prevedere tre funzioni principali: inserimento prodotto, stamp elenco, quit
 * */
 
	public static void main(String[] args) {
		Scanner scannerS = new Scanner(System.in);
		Scanner scannerI = new Scanner(System.in);
		ArrayList<String> listaSpesa = new ArrayList<String>();
		int scelta;
		boolean bool = false;
		do {
			System.out.println("1) Inserimento prodotto;");
			System.out.println("2) Lista prodotti;");
			System.out.println("3) Esci;");
			System.out.print("Inserisci il numero corrispondente alla scelta eseguita: ");
			scelta = scannerI.nextInt();
			System.out.println("\n");
			if(scelta == 3) {
				bool = true;
			}
			
			switch (scelta) {
				case 1:
					System.out.print("Inserisci un prodotto della spesa alla tua lista: ");
					String prodotto = scannerS.nextLine();
					if(listaSpesa.contains(prodotto)) {
						System.out.println("\n");
						System.out.println("Questo prodotto è già presente nella lista");
						System.out.println("\n");
					}else {
						listaSpesa.add(prodotto);
					}
				break;
				case 2:
					System.out.print("Ecco a te la tua lista della spesa aggiornata: ");
					System.out.println(listaSpesa);
					System.out.println("\n");
				break;
			}
		}while(scelta <= 3 && bool == false);
		System.out.println("\n");
		System.out.println("Grazie per aver utilizzato la nostra lista della spesa!");
	}

}

package Controller;

import java.util.Scanner;
/*INSERIMENTO DI DATI ALL'INTERNO DI UNA STRINGA CONCATENANDOLI, TERMINARE L'INSERIMENTO CON q ED
 * EFFETTUARE LA RICERCA DI UN COGNOME ALL'INTERNO DELLA STRINGA
 */
public class C02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//dichiarato le variabili
		String listaStudenti = "";
		String prov = "";
		String q = "q";
		Boolean quit = false;
		//ciclo di inserimento studenti
		while(quit == false) {
			
			System.out.print("Inserire cognome: ");
			prov = scanner.nextLine();
			if(prov.equals(q)) {
				quit = true;
				listaStudenti = listaStudenti + prov + " ";
				
			}else {
				listaStudenti = listaStudenti + prov + " ";
				
				System.out.print("Inserire nome: ");
				prov = scanner.nextLine();
				listaStudenti = listaStudenti + prov + " ";
				
				System.out.print("Inserire matricola: ");
				prov = scanner.nextLine();
				listaStudenti = listaStudenti + prov + ", ";
				System.out.print("\n");
			}
		}
		System.out.println(listaStudenti);
		//controllo cognome presente nella lista
		System.out.print("\nInserisci il cognome da ricercare: ");
		String ricerca = scanner.nextLine();
		if(listaStudenti.contains(ricerca)) {
			System.out.println("é presente!");
		}else {
			System.out.println("non è presente!");
		}
	}
}

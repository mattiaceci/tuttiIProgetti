package Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
//ESEMPI ARRAYLIST

public class C03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		ArrayList<String> elencoPersone = new ArrayList<String>();
		Boolean bool = true;
		while(bool) {
			System.out.print("Inserisci una persona o il carattere \"q\" per terminare l'inserimento: ");
			String prov = scanner.nextLine();
			if(prov.equals("q")) {
				bool = false;
			}else {
				elencoPersone.add(prov);
			}
		}
		System.out.print("L'elenco inserito è: " + elencoPersone);
		elencoPersone.sort(null);
		System.out.println("\n");
		System.out.print("L'elenco ordinato è: " + elencoPersone);
	}
	
	
}

/*ArrayList<String> elenco = new ArrayList<String>();

elenco.add("Maserati");
elenco.add("BMW");

System.out.println(elenco.get(0));
System.out.println(elenco.get(1));

elenco.remove(0);

elenco.contains("BMW");

elenco.indexOf("Maserati");*/
package Controller;

import java.util.Scanner;

public class C06 {
//metodo che fornita una stringa restituisce un array di string con 2 caselle che contengono le due metà della stringa
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci una parola: ");
		String parola = scanner.nextLine();
		System.out.println("La parola divisa a metà è: " + dividiStringa(parola)[0]+" "+dividiStringa(parola)[1]);
	}
	public static String[] dividiStringa (String parola){
		String array[] = new String[2];
		array[0] = parola.substring(0, (((parola.length())/2)));
		array[1] = parola.substring((parola.length()/2), ((parola.length())));
		return array;
	}
}
package Controller;

import java.util.Scanner;

public class C01 {
	/*cicli: ripetersi di un pezzo di codice fino a quando una qualsiasi condizione è vera: while
	  prima esegue la verifica e poi il codice		*/
	
	public static void main(String[] args) {  
		//Condizione di while:
		//somma n1 n2 maggiore di 100 oppure somma divisibile per due
		//nel caso una delle due fosse vera stampare tutti i numeri da 1 a somma
		
		Scanner in = new Scanner(System.in);
		System.out.print("Inserisci il primo numero: ");
		int n1 = in.nextInt();
		System.out.print("Inserisci il secondo numero: ");
		int n2 = in.nextInt();
		int i = 0;
		if(n1 > 0 && n2 > 0) {
			while((n1+n2 > 100 || ((n1+n2)%2) == 0) && i<(n1+n2)) {
				i++;
				System.out.println(i);
			}
		}
	}
}

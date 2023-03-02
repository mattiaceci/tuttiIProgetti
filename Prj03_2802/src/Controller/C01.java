package Controller;
import java.util.Scanner;
public class C01 {
//CALCOLATRICE CON MENU' DI LOGIN E DI UTILIZZO 
	public static void main(String[] args) {
		//creazione oggetto scanner
		Scanner scanneri = new Scanner(System.in);
		Scanner scanners= new Scanner(System.in);
		Boolean verifica0 = false;
		Boolean verifica1 = false;
		Boolean verifica2 = false;
		String user ="";
		String pwd = "";
		int scelta0, scelta1, scelta2, n1, n2, risultato,randomNum;
		int contatore = 0;

		do {
			System.out.println("1) Registrazione;");
			System.out.println("2) Login;");
			System.out.println("3) esci;");
			System.out.print("Inserisci il numero della tua scelta: ");
			scelta0 = scanneri.nextInt();
			if(scelta0 == 3) {
				verifica0 = true;
			}
			switch(scelta0) {
				case 1:
					System.out.println("Inserisci il tuo Username: ");
					user = scanners.nextLine();
					System.out.println("Inserisci la tua Password: ");
					pwd = scanners.nextLine();
				break;
				case 2:
					System.out.println("Inserisci Username: ");
					String u = scanners.nextLine();
					System.out.println("Inserisci Password: ");
					String p = scanners.nextLine();
					if(u.equals(user) && p.equals(pwd)) {
						do {
							//Menù iniziale con prima scelta
							System.out.println("1) Utilizza la calcolatrice;");
							System.out.println("2) Esci;");
							System.out.print("Inserisci il numero della tua scelta: "); 
							scelta1 = scanneri.nextInt();
							System.out.println("\n");
							//verifica condizione di ciclo
							if(scelta1 == 2) {
								verifica1 = true;
							}
							//primo switch
							switch(scelta1) {
								case 1:
									do {
										//secondo menù con scelta operazione
										System.out.println("1) Somma");
										System.out.println("2) Sottrazione");
										System.out.println("3) Moltiplicazione");
										System.out.println("4) Divisione");
										System.out.println("5) Esci");
										System.out.print("Inserisci il numero della tua scelta: ");
										//Verifica condizione di ciclo 
										scelta2 = scanneri.nextInt();
										System.out.println("\n");
										if(scelta2 == 5) {
											verifica2 = true;
										}
										//secondo switch
										switch(scelta2) {
											//somma
											case 1:
												System.out.print("Inserisci il primo numero: ");
												n1 = scanneri.nextInt();
												System.out.println("\n");
												System.out.print("Inserisci il secondo numero: ");
												n2 = scanneri.nextInt();
												System.out.println("\n");
												risultato = n1 + n2;
												//do-while utile alla creazione di un numero random
												//utile anche al controllo dell'uguaglianza tra risultato e numero random 
												do {
													randomNum = (int)(Math.random()* 101);
													if(risultato != randomNum) {
														System.out.println("Il risultato è: " + risultato);
														System.out.println("Il risultato sbagliato è: " + randomNum);
													}
												}while(risultato == randomNum);
												contatore++;
											break;
											//sottrazione
											case 2:
												System.out.print("Inserisci il primo numero: ");
												n1 = scanneri.nextInt();
												System.out.println("\n");
												System.out.print("Inserisci il secondo numero: ");
												n2 = scanneri.nextInt();
												System.out.println("\n");
												risultato = n1 - n2;
												//do-while utile alla creazione di un numero random
												//utile anche al controllo dell'uguaglianza tra risultato e numero random
												do {
													randomNum = (int)(Math.random()* 101);
													if(risultato != randomNum) {
														System.out.println("Il risultato è: " + risultato);
														System.out.println("Il risultato sbagliato è: " + randomNum);
													}
												}while(risultato == randomNum);
												contatore++;
											break;
											//moltiplicazione
											case 3:
												System.out.print("Inserisci il primo numero: ");
												n1 = scanneri.nextInt();
												System.out.println("\n");
												System.out.print("Inserisci il secondo numero: ");
												n2 = scanneri.nextInt();
												System.out.println("\n");
												risultato = n1 * n2;
												//do-while utile alla creazione di un numero random
												//utile anche al controllo dell'uguaglianza tra risultato e numero random
												do {
													randomNum = (int)(Math.random()* 101);
													if(risultato != randomNum) {
														System.out.println("Il risultato è: " + risultato);
														System.out.println("Il risultato sbagliato è: " + randomNum);
													}
												}while(risultato == randomNum);
												contatore++;
											break;
											//divisione
											case 4:
												System.out.print("Inserisci il primo numero: ");
												n1 = scanneri.nextInt();
												System.out.println("\n");
												System.out.print("Inserisci il secondo numero: ");
												n2 = scanneri.nextInt();
												System.out.println("\n");
												risultato = n1 / n2;
												//do-while utile alla creazione di un numero random
												//utile anche al controllo dell'uguaglianza tra risultato e numero random
												do {
													randomNum = (int)(Math.random()* 101);
													if(risultato != randomNum) {
														System.out.println("Il risultato è: " + risultato);
														System.out.println("Il risultato sbagliato è: " + randomNum);
													}
												}while(risultato == randomNum);
												contatore++;
											break;
										}
									}while(scelta2 <= 5 && verifica2 == false);
									System.out.println("Le operazioni svolte fino ad ora sono: " + contatore);
									System.out.println("\n");
								break;
							}
						}while(scelta1 <= 2 && verifica1 == false);
					}else {
						System.out.println("Username o Password errati");
					}
				break;
			}
		}while(scelta0 <= 3 && verifica0 == false);
		System.out.println("Grazie di aver utilizzato la calcolatrice! Alla prossima!");
		System.out.println("\n");
	}
}

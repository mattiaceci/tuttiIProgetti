package Controller;

public class C02 {

	public static void main(String[] args) {
		
		Colore colore = new Colore("giallo");
		Materiale mat = new Materiale("carino", colore, true, false);
		Bottiglia bottiglia = new Bottiglia(mat,"2L",colore);
		
		System.out.println(bottiglia);

	}

}

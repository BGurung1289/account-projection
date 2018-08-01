package application;

public class App {

	public static void main(String [] args) {
		System.out.println("Hello World");
		Account bib = new Account("Bibek", "Gurung", 155);
		Service testSer = new Service();
		testSer.addAccount(bib);
		System.out.println(testSer.getAccount(155).getName());
	}
}

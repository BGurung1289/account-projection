package application;

import java.util.Scanner;

public class App {

	public static void main(String [] args) {
		App a = new App();
		System.out.println("Select an option");
		
		a.menu();
		
	}
	
	public void menu() {
		boolean quit = false;
		Scanner sc = new Scanner(System.in);
		int choice;
		Service testSer = new Service();
		while(quit == false) {
			System.out.println("1. Add Account");
			System.out.println("2. Get Account");
			System.out.println("3. Remove Account");
			System.out.println("4. QUIT");
			
			choice = sc.nextInt();
			if(choice == 1) {
				String fName;
				String lName;
				int id;
				System.out.println("enter first name");
				fName = sc.next();
				System.out.println("enter last name");
				lName = sc.next();
				System.out.println("enter id");
				id = sc.nextInt();
				Account addable = new Account(fName, lName, id);
				testSer.addAccount(addable);
			}
			else if(choice == 2) {
				System.out.println("Enter ID of account you want to search for ");
				int id = sc.nextInt();
				System.out.println(testSer.getAccount(id).getName());
			}
			else if(choice == 3){
				System.out.println("Enter ID of account you want to remove");
				int id = sc.nextInt();
				testSer.removeAccount(id);
			}
			else {
				System.out.println(testSer.toJSON());
				System.out.println("Byebye");
				quit = true;
			}
		}
	}
}


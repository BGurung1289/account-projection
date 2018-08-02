package application;

public class Account {

	private String firstName, lastName;
	private int accountNum;
	
	public Account(String firstName, String lastName, int accountNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNum = accountNum;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public String getFirst() {
		return firstName;
	}
	public String getLast() {
		return lastName;
	}
	
	public int getId() {
		return accountNum;
	}
}

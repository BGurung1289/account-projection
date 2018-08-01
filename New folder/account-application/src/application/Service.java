package application;

import java.util.HashMap;

public class Service {
	
	private HashMap<Integer, Account> service = new HashMap<>();
	
	public void addAccount(Account accountToAdd) {
		service.put(accountToAdd.getId(), accountToAdd);
	}
	
	public Account getAccount(int id) {
		return service.get(id);
	}
	
	public void removeAccount(int id) {
		service.remove(id);
	}
	
	
}

package application;

import java.util.HashMap;

import org.json.JSONObject;

public class Service {
	private JSONObject jsonobj;
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
	
	public 	JSONObject toJSON() {
		jsonobj = new JSONObject(service);
		return jsonobj;
	}
	
//	public Account lookFor(String fname) {
//		for(int counter = 0; counter < service.size(); counter++) {
//			if(fname == ) {
//				
//			}
//		}
//	}
}

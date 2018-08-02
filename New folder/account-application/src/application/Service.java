package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
		System.out.println(id + " has been removed.");
	}

	public JSONObject toJSON() {
		jsonobj = new JSONObject(service);
		return jsonobj;
	}

	public int lookFor(String fname) {
		Iterator<Entry<Integer, Account>> iterat = service.entrySet().iterator();
		int count = 0;
		while (iterat.hasNext()) {
			Entry<Integer, Account> entry = iterat.next();
			if (service.get(entry.getKey()).getFirst().equals(fname)) {
				count++;
			}
		}
		return count;
	}
}

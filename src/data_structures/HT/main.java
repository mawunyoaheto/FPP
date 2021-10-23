package data_structures.HT;

import java.util.Hashtable;
import java.util.Map;

public class main {

	static Hashtable<Make, String> table = new Hashtable<Make, String>();
	
	public static void main(String[] args) {
		
		Make a = new Make("Toyota");
		Make b = new Make("Ford");
		Make c = new Make("Dodge");
		Make d = new Make("Mazda");
		Make e = new Make("Toyota");
		Make f = new Make("Ford");
		
		insertIntoTable(a, "Camry");
		insertIntoTable(b, "Escape");
		insertIntoTable(c, "Caravan");
		insertIntoTable(d, "3");
		insertIntoTable(e, "Prius");
		insertIntoTable(e, "Avalon");
		insertIntoTable(f, "Explorer");
		
		for(String s : table.values()) {
			System.out.println(s);
		}
		
		System.out.println("\nAfter removal\n");
		
		removeFromTable(d);
		removeFromTable(a);
		removeFromTable(a);
		removeFromTable(f);
		
		// Set<Map.Entry<Make, String>> entries = table.entrySet();
		for (Map.Entry<Make, String> entry : table.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
	}
	
	static void insertIntoTable(Make key, String value) {
		if(table.containsKey(key)) {
			String oldValue = table.get(key);
			String newValue = oldValue + "-" + value;
			table.put(key, newValue);
		}else {
			table.put(key, value);
		}
	}
	
	static void removeFromTable(Make key) {
		if(!table.containsKey(key)) return;
		
		String s = table.get(key);
		String[] arr = s.split("-");
		
		if(arr.length == 1) {
			table.remove(key);
		}else {
			String newValue = "";
			for(int i = 0; i < arr.length-1; i++) {
				newValue = i == 0 ? (newValue + arr[i]) : (newValue + "-" + arr[i]);
			}
			table.put(key, newValue);
		}
	}
}

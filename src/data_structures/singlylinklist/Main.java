package data_structures.singlylinklist;

public class Main {
	public static void main(String[] args) {
		StringList list = new StringList();
		
		try {
//			list.addFirst("a");
//			list.addFirst("b");
//			list.addFirst("c");
			list.addLast("z");
			
			//list.insert("z", 4);
		} catch (Exception e) {
			
		System.out.println(e.getMessage());
		}
		
		
 
		
		printList(list);
		
		
	}
	
	static void printList(StringList list) {
		for(String s : list) {
			System.out.println(s);
		}
}
}
package polymorphism.Assignment4_3.employeeinfo;

public class AccountList {
	private final int INITIAL_LENGTH = 2;
	private Account[] acctArray;
	private int size;

	public AccountList() {
		acctArray = new Account[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Account s) {

		if (s == null)
			return;

		if (size == acctArray.length)
			resize();
		acctArray[size++] = s;

	}
	
	public Account get(int i) {

		if (i < 0 || i > size)
			throw new ArrayIndexOutOfBoundsException("Index does not exist");

		return acctArray[i];
	}
	
	public boolean find(Account s) {
		if (s == null)
			return false;

		for (int i = 0; i < size; i++) {
			if (acctArray[i].equals(s))
				return true;
		}
		return false;
	}
	
	public void insert(Account s, int pos) {

		if ((acctArray.length + 1) == size)
			resize();
		String[] temp = new String[acctArray.length];
		System.arraycopy(acctArray, pos, temp, 0, acctArray.length - pos - 1);
		System.arraycopy(temp, pos, acctArray, pos + 1, acctArray.length - pos - 1);
		acctArray[pos] = s;
		size++;
		// return result;
		
	}
	
	public boolean remove(Account s) {
		if(find(s)) {
			
			for (int i = 0; i < size; i++) {

				if (acctArray[i].equals(s)) {
					Account[] tempArray = new Account[acctArray.length];
					System.arraycopy(acctArray, 0, tempArray, 0, i);
					System.arraycopy(acctArray, (i + 1), tempArray, i, acctArray.length - (i + 1));
					acctArray = tempArray;
					size--;
				}
			}
		}

		return false;
	}
	
	
	private void resize(){

		System.out.println("Resizing...");

		Account[] tempArray = new Account[acctArray.length * 2];

		System.arraycopy(acctArray, 0, tempArray, 0, acctArray.length);

		acctArray = tempArray;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");

		for (int i = 0; i < size - 1; ++i) {

			sb.append(acctArray[i] + ", ");
		}

		sb.append(acctArray[size - 1] + "]");
		return sb.toString();
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		AccountList l = new AccountList();
//		l.add(Bob);
//		l.add("Steve");
//		l.add("Susan");
//		l.add("Mark");
//		l.add("Dave");
//		System.out.println("The list of size "+l.size()+" is "+l);
//		l.remove("Mark");
//		l.remove("Bob");
//		System.out.println("The list of size "+l.size()+" is "+l);
//		l.insert("Richard", 3);
//		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
//		l.insert("Tonya", 0);
//		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
	}

}

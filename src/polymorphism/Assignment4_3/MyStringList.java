package polymorphism.Assignment4_3;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){

		if (s == null || s == "")
			return;

		if (size == strArray.length)
			resize();
		strArray[size++] = s;

	}
	
	public String get(int i){

		if (i < 0 || i > size)
			throw new ArrayIndexOutOfBoundsException("Index does not exist");

		return strArray[i];
	}
	
	public boolean find(String s){
		if (s == null || s == "")
			return false;

		for (int i = 0; i < size; i++) {
			if (strArray[i].equalsIgnoreCase(s))
				return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){

		if ((strArray.length + 1) == size)
			resize();
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray, pos, temp, 0, strArray.length - pos - 1);
		System.arraycopy(temp, pos, strArray, pos + 1, strArray.length - pos - 1);
		strArray[pos] = s;
		size++;
		// return result;
		
	}
	
	public boolean remove(String s){
		if(find(s)) {
			
			for (int i = 0; i < size; i++) {

				if (strArray[i].equalsIgnoreCase(s)) {
					String[] tempArray = new String[strArray.length];
					System.arraycopy(strArray, 0, tempArray, 0, i);
					System.arraycopy(strArray, (i + 1), tempArray, i, strArray.length - (i + 1));
					strArray = tempArray;
					size--;
				}
			}
		}

		return false;
	}
	
	
	private void resize(){

		// System.out.println("Resizing...");

		String[] tempArray = new String[strArray.length * 2];

		System.arraycopy(strArray, 0, tempArray, 0, strArray.length);

		strArray = tempArray;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");

		for (int i = 0; i < size - 1; ++i) {

			sb.append(strArray[i] + ", ");
		}

		sb.append(strArray[size - 1] + "]");
		return sb.toString();
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard", 3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
	}

}

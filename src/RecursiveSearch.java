
public class RecursiveSearch {
	private String[] arr;
	private int len;


	public RecursiveSearch(String[] array) {
		super();
		this.arr = array;
		// len = arr.length - 1;
		len = arr.length;

	}


	public boolean search(String s) {

		if (s == null || arr == null)
			return false;

		if (s.equalsIgnoreCase(arr[len - 1]))
			return true;

		return recurSearch(s, len - 2);
	}

	private boolean recurSearch(String str, int upperBound) {

		if (upperBound < 0)
			return false;

		if (str.equalsIgnoreCase(this.arr[upperBound])) {
			return true;
		}
		else {
		return recurSearch(str, --upperBound);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "Raymond", "Alex", "Alice", "Michael", "Dagi" };

		RecursiveSearch r = new RecursiveSearch(arr);

		RecursiveSearch m = r;

		System.out.println(r.search("Alice"));
		System.out.println(m.search("dagi"));
	}

}

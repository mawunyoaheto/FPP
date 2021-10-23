
public class RecursiveSearch2 {

	private String[] arr;
	private int len;
	private boolean result;

	public RecursiveSearch2(String[] array) {
		super();
		this.arr = array;
		len = arr.length - 1;

	}

	public boolean search(String s) {

		if (s == null || arr == null)
			return false;

		if (len < 0)
			return false;

		if (recurSearch(s, len--))
			return true;

		else {
			// result = recurSearch(s, len--);
			search(s);
		}

		return result;
	}

	private boolean recurSearch(String str, int upperBound) {

		if (str.equalsIgnoreCase(this.arr[upperBound])) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "Raymond", "Alex", "Alice", "Michael", "Dagi" };

		RecursiveSearch2 r = new RecursiveSearch2(arr);

		RecursiveSearch2 m = r;

		// r.recurSearch("Raymond", 4);

		System.out.println(r.search("dagi"));
		System.out.println(m.search("mawu"));
	}

}

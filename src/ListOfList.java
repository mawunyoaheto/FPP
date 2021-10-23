import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListOfList {

	static List<String> listOfList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = Arrays.asList("A", "B", "C");
		List list2 = Arrays.asList("E", "F", "G");

		listOfList = new ArrayList<>();
		listOfList.addAll(list);
		listOfList.addAll(list2);


		System.out.println(listOfList);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		Iterator<String> itr = listOfList.iterator();

		while (itr.hasNext())
			sb.append(itr.next() + ",");
		sb.append("]");

		return sb.toString();
	}
}

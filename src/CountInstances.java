
public class CountInstances {

	private static int staticCount = 0;
	private int normalCount = 0;

	public CountInstances() {
		++staticCount;
		++normalCount;
	}


	public static int getStaticCount() {
		return staticCount;
	}

	public int getNormalCount() {
		return normalCount;
	}


	public static int addBoth() {

		return staticCount;
	}
	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {

			new CountInstances();
		}

		CountInstances l = new CountInstances();

		System.out.println("Number of static field count for 20 Instances created:" + l.staticCount);
		System.out.println("Number of normal field count for 20 Instances created:" + l.normalCount);
	}

}

package innerclasses;

public class TopTest {

	public static void main(String[] args) {

		Top t = new Top();

		Top.Middle m = t.new Middle();

		Top.Middle.Bottom b = m.new Bottom();

	}

	void callInnerClass() {

		Top t = new Top();
		Top.Middle m = t.new Middle();
	}

}

package adt;

public class StringClass {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");

		String hannah = "Did Hannah see bees? Hannah did.";

		System.out.println(sb.length());
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));

		System.out.println("Write an expression that refers to the letter b in the string referred to by hannah");
		System.out.println(hannah.charAt(15));

		System.out.println("How long is the string returned by the following expression? What is the string?");
		String s = "Was it a car or a cat I saw?";
		System.out.println(s.substring(9, 12));
		System.out.println(s.substring(9));

		String original = "software";
		StringBuilder result = new StringBuilder("hi");
		int index = original.indexOf('a');

	}

}

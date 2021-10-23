package inheritance.test;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person("Dagi", 30, "Male");

		Author a1 = new Author();
		Author a2 = new Author("Michael", 38, "Male", 5);
		Author a3 = new Author("Abigail", 28, "Female", 10);

		Driver d1 = new Driver();
		Driver d2 = new Driver("Johnathan", 62, "Male", 21);
		Driver d3 = new Driver("abigail", 42, "Female", 27);

		Person[] persons = { a1, a2, a3, d1, d2, d3, p1, p2 };

		printPersonInfo(persons);



		System.out.println("***********After Arrays.sort()**************");
		Arrays.sort(persons);
		printPersonInfo(persons);

		Arrays.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getGender().compareTo(o2.getGender());
			}

		});

	}

	public static void printPersonInfo(Person[] arr) {

		for (Person p : arr) {
			System.out.println(p);
		}
	}

	static class NameComparator implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {

			return o1.getName().compareTo(o2.getName());
		}

	}

	static void sortByAge(Person[] arr) {
		class SortByAgeAscending implements Comparator<Person> {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}

		}
		Arrays.sort(arr, new SortByAgeAscending());
	}

}

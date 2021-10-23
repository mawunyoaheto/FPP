package data_structures.vehicle_linkedlist;

public class Main {

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("BMW");
		Vehicle v3 = new Vehicle("HYUNDAI");
		Vehicle v4 = new Vehicle("TOYOTA");

		VehicleLinkedList v = new VehicleLinkedList();

		v.addFirst(v1);
		v.addLast(v2);
		v.addFirst(v3);

		v.forEach(vehicle -> System.out.println(vehicle));

		System.out.println(v.search(v4));

		System.out.println(v.get(0));

		v.insert(v4, 1);
		System.out.println(v);

		v.remove(v2);

		System.out.println(v);

		// System.out.println(v.search("BMW"));
		// System.out.println(v2.getName());

	}

}

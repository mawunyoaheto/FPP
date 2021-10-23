package data_structures.quiz6_practice;

public class Main {

	public static void main(String[] args) throws MyStackException {

		Vehicle v1 = new Vehicle("BMW");
		Vehicle v2 = new Vehicle("DODGE");
		Vehicle v3 = new Vehicle("BUICK");
		Vehicle v4 = new Vehicle("BMW");

		VehicleStack vs = new VehicleStack();
		VehicleQueue vq = new VehicleQueue();

		try {
			// vs.push(null);
			vs.push(v2);
			vs.push(v3);
			vs.push(v4);

			for (int i = 0; i < vs.size; i++) {
				vq.enqueue(vs.get(i));
			}
		} catch (MyStackException e) {
			// System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println(vs);

			System.out.println(vq);
		}

		// System.out.println(vs);

	}

}

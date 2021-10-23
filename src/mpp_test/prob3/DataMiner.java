package mpp_test.prob3;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
	private static List<Figure> objects = new ArrayList<Figure>();
	
	public double totalArea;
	public int numOfFigures;

	//DO NOT MODIFY
	//expected output:  40 (rounded to nearest integer)
	public static void main(String[] args) {
		DataMiner dm = new DataMiner();
		dm.populateList();

		for (Figure f : objects) {

			System.out.println("Figure: " + f.getClass().getSimpleName() + " has an area of: " + f.computeArea());
			dm.totalArea += f.computeArea();
			dm.numOfFigures++;
		}
//		Iterator<Figure> itr = objects.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.computeArea());
//			dm.totalArea += itr.next().computeArea();
//			dm.numOfFigures++;
//		}
		// System.out.println(dm.computeAverageArea());

		System.out.println("Total Area = " + dm.totalArea);
		System.out.println("Average Area = " + dm.computeAverageArea());
	}
	
	//DO NOT MODIFY
	public void populateList() {
		Circle c1 = new Circle(5);
		objects.add(c1);
		Circle c2 = new Circle(3);
		objects.add(c2);
		Rectangle r1 = new Rectangle(2, 5);
		objects.add(r1);
		Rectangle r2 = new Rectangle(3, 11);
		objects.add(r2);
		Circle c3 = new Circle(4);
		objects.add(c3);
		randomShuffle();
	}
	
	//IMPLEMENT
	public double computeAverageArea() {
		return Math.round(totalArea / numOfFigures);
	}
	
	//DO NOT MODIFY
	//randomly rearranges the elements in the objects list
	private void randomShuffle() {
		int len = objects.size();
		for(int i = 0; i < len-1; ++i) {
			int j = RandomNumbers.getRandomInt(i, len-1);
			swap(i,j);
		}
	}

	private void swap(int i, int j) {
		//You may modify the type of temp as necessary
		Figure temp = objects.get(j);
		objects.set(j, objects.get(i));
		objects.set(i, temp);
	}
}

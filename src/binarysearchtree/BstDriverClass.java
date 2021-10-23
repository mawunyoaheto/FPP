package binarysearchtree;

public class BstDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyBinarySearchTree theThree = new MyBinarySearchTree();

		theThree.addNode(50, "Boss");
		theThree.addNode(25, "President");
		theThree.addNode(20, "Vice President");
		theThree.addNode(15, "Director");
		theThree.addNode(60, "Secretary");
		theThree.addNode(75, "Cleaner");
		theThree.addNode(55, "Sales Person");

		theThree.inOrderTraverseNode(theThree.root);

		theThree.inOrderTraverseNode(theThree.root);
	}

}

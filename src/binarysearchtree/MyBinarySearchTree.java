package binarysearchtree;

public class MyBinarySearchTree {

	Node root;

	public void addNode(int key, String name) {

		Node newNode = new Node(key, name);

		if (root == null)
			root = newNode;
		else {

			Node focusNode = root;
			Node parent;

			while (true) {
				parent = focusNode;

				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;

					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {

					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}

	}

	public void inOrderTraverseNode(Node focusNode) {

		if (focusNode != null) {
			inOrderTraverseNode(focusNode.leftChild);

			System.out.println(focusNode.toString());

			inOrderTraverseNode(focusNode.rightChild);
			// System.out.println(focusNode);
		}
	}

}

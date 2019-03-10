class Node {
	int data;
	Node left, right;
	Node(int data) {
		this.data = data;
	}
}

public class BinaryTree {
	Node root;
	BinaryTree() {
		root = null;
	}

	BinaryTree (int data) {
		root = new Node(data);
	}

	public static void main (String args []) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
	}
}
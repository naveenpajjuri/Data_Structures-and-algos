public class CheckBinarySearchTree {
	public static void printInorder(Tree head){
		if (head == null){
			return;
		}
		printInorder(head.getLeft());
		System.out.print(head.getData()+ " ");
		printInorder(head.getRight());
	}
	
	public static void main(String args[]) {
		Tree head = new Tree();
		head.setData(1);
		Tree lChild = new Tree();
		Tree rChild = new Tree();
		head.setLeft(lChild);
		head.setRight(rChild);
		lChild.setData(2);
		rChild.setData(3);
		printInorder(head);
	}
}
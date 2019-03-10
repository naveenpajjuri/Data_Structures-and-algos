import java.util.*;

public class LOrder {
	public static void levelOrder(Tree head) {
		Queue<Tree> q = new LinkedList<>();
		q.add(head);
		q.add(null);

		while (!q.isEmpty()) {
			Tree t = q.poll();
			if(t == null){
				System.out.println("\n");
				//q.add(null);
			} else {
				System.out.print(t.getData()+ "  ");
				if (t.getLeft() != null)
					q.add(t.getLeft());
				if (t.getRight() != null)
					q.add(t.getRight());
			}
		}
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
		levelOrder(head);
	}
}
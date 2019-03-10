public class SiblingSameLevel {
	public static void SiblingAddition(Tree head) {
		Queue<Tree> q = new LinkedList<>();
		q.add(head);
		q.add(null);
		boolean siblingVisited = false;
		while (!q.isEmpty()) {
			Tree t = q.poll();
			if(t == null) {
				q.add(null);
				if (siblingVisited == false) {
					siblingVisited = true;
				} else if (siblingVisited) {
					q.clear();
				}
				siblingVisited = false;
			} else {
				
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
		head = SiblingAddition(head);
	}
}
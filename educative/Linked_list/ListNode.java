public class ListNode {
	private int data;
	private ListNode next;

	public ListNode (int data) {
		this.data = data;
		this.next = null;
	}

	public ListNode (int data, ListNode ln) {
		this.data = data;
		this.next = ln;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getData () {
		return data;
	}

	public void setNext(ListNode listNode) {
		this.next = listNode;
	}

	public ListNode getNext() {
		return this.next;
	}

	public static void printList(ListNode l) {
		while(l != null) {
			System.out.print(l.getData()+ "  ");
			l = l.getNext();
		}
		System.out.print("\n");
	}
}
class ReverseLinkedList {
	public static ListNode reverse (ListNode l) {
		ListNode head = l;
		if (l == null) {
			return l;
		}
		ListNode current = head;
		ListNode next = null;
		ListNode prev = null;
		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		return prev;
	}
	public static void main (String args[]) {
		ListNode l = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
		ListNode.printList(l);
		l = reverse(l);
		ListNode.printList(l);
	}
}

class ReverseKGroups {
	public static ListNode reverse (ListNode l, int k) {
		ListNode current = l;
		ListNode prev = null;
		ListNode next = null;
		ListNode toReturn = null;
		ListNode previousBtachStart = null;
		ListNode batchStrat= null;

		while (current != null) {
			int currentPos = 0;
			if (batchStrat != null) {
				previousBtachStart = batchStrat;
			} else {
				previousBtachStart = current;
			}
			batchStrat = current;

			while (currentPos < k && current != null) {
				next = current.getNext();
				current.setNext(prev);
				prev = current;
				current = next;
				currentPos++;
			}
			previousBtachStart.setNext(batchStrat);
			if (toReturn == null) {
				toReturn = prev; 
			}
		}
		return toReturn;
	}

	public static void main (String args[]) {
		//ListNode l = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6))))));
		ListNode l = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));
		ListNode.printList(l);
		int k = 2;
		l = reverse(l,k);
		ListNode.printList(l);
	}
}
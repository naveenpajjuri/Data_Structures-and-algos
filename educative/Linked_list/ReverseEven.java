
class ReverseEven {
	public static ListNode SplitEvenList(ListNode l) {
		ListNode evenHead = null,even = null;
		evenHead = even;
		if (l != null && l.getNext() != null) {
			evenHead = l.getNext();
			even = l.getNext();
		}
		while(l != null && l.getNext() != null && l.getNext().getNext() != null) {
			l.setNext(l.getNext().getNext());
			even.setNext(even.getNext().getNext());
			l = l.getNext();
			even = even.getNext();
			/*
			if (l.getNext().getNext() != null) {
				l.setNext(l.getNext().getNext());
			}
			if (l.getNext().getNext().getNext() != null){
				System.out.println("even "+ even.getData()+ "  "+l.getNext().getNext().getNext().getData());
				even.setNext(l.getNext().getNext().getNext());
			}
			if (l.getNext().getNext().getNext() != null){
				even = l.getNext().getNext().getNext();
			}
			if (l.getNext().getNext() != null) {
				l = l.getNext().getNext();
			}*/
		}
		return evenHead;
	}

/*	public static ListNode mergeLists(ListNode l1,ListNode l2) {
		ListNode head;
		int bool = false;
		while (l1 != null && l2 != null) {
			if (!bool) {

			} else {

			}
		}
	}*/

	public static void main (String args[]) {
		ListNode l = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
		ListNode.printList(l);
		ListNode even = SplitEvenList(l);
		ListNode.printList(l);
		//ListNode.printList(even);
		even = ReverseLinkedList.reverse(even);
		ListNode.printList(even);
	}
}
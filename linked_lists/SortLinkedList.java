public class SortLinkedList {
	public static Node mergeSort(Node head) {

		Node front = null;
		Node back = null;
		if(!head || head.next == null) {
			return head;
		}

		splitList(head, front, back);

		mergeSort(front);
		mergeSort(back);

		head = merge(front, back);
		return head;
	}

	public static void splitList(Node head, Node front, Node back) {
		Node slow = head;
		Node fast = head.next;

		while(fast!=null) {
			if(fast.next!=null){
				slow = slow.next;
				fast = fast.next.next;
			}
		}

		front = head;
		back = slow.next;
		slow.next = null;
	}

	public static Node merge(Node front, Node back) {
		Node result = null;
		if(front == null) {
			return back;
		}
		else if(back == null) {
			return front;
		}

		if(front.data <= back.data) {
			result = front.data;
			result.next = merge(front.next, back);
		}else {
			result = back.data;
			result.next = merge(front, back.next);
		}
		return result;
	}

}

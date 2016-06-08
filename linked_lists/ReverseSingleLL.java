import java.util.*;

public class ReverseSingleLL {
	public static Node reverseListIterative(Node head) {
		if(!head) {
			return null;
		}
		if(head.next == null) {
			return head;
		}
		Node previous = head;
		Node current = previous.next;
		Node currents_next = null;
		previous.next = null;

		while(!current) {
			currents_next = current.next;
			current.next = previous;
			previous = current;
			current = currents_next;
		}

		head = previous;
		return head;
	}

	public static Node reverseListRecursive(Node head) {

		Node first = head;
		Node rest = first.next;
		if(rest == null) {
			return;
		}


		reverseListRecursive(rest);
		first.next.next = first;
		first.next = null;

		head = rest;
		return head;
	}


}

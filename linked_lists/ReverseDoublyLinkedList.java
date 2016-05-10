import java.util.*;

public class ReverseDoublyLinkedList {
	public static Node reverseDoublyLinkedList(Node head) {
		if(!head) {
			return;
		}
		if(head.next == null || head.prev == null) {
			return;
		}

		Node current = head;
		Node temp = current.prev;
		current.prev = current.next;
		current.next = temp;
		current = current.prev;

		if(temp != null) {
			head = temp.prev;
		}
		return head;
	}
}
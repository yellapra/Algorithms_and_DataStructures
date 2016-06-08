import java.util.*;

public class ReverseDoublyLinkedList {
	public static Node reverseDoublyLinkedList(Node head) {
		if(!head) {
			return null;
		}
		if(head.next == null || head.prev == null) {
			return head;
		}
		Node current = head;
		Node prev = null;
		Node temp = null;
		while(current!=null){
			temp = current.next;
			current.next = prev;
			current.prev = temp;
			prev = current;
			current = temp;
		}
		
		return prev;
	}
}

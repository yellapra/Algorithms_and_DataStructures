public class InsertNodesInSortedOrder{
	public static void insertNode(Node head, Node newNode) {
		if(head == null || head.data > node.data) {
			newNode.next = head;
			head = newNode;
		}else {
			Node current = head;
			while(current.next!=null && current.next.data > newNode.data) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}
}
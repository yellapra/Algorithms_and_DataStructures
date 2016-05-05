public class PrintListInReverseOrder{
	public static void printListInReverseOrder(Node head) {
		if(!head){
			return;
		}

		printListInReverseOrder(head.next);
		System.out.println(head.data);
	}
}
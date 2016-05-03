import java.util.*;

//Using HashMap

public void removeDuplicates(Node head) {
	if(!head) {
		return;
	}

	HashMap<Integer, boolean> hm = new HashMap<Integer, boolean>();
	Node previous = null;
	while(head) {
		if(hm.containsKey(head.data)) {
			previous.next = head.next;
		}else {
			hm.put(head.data, true);
			previous = head;
		}
		head = head.next;
	}
}

//Without using extra memory

public void removeDuplicatesWithoutExtraMemory(Node head) {
	if(!head || !(head.next)) {
		return;
	}

	Node previous = head;
	Node current = head.next;
	Node runner = null;

	while(current){
		//Always start runner from head since you want to compare all previous elements with the current element
		runner = head;
		while(runner != current){
				if(runner.data == current.data) {
				Node temp = current.next;
				previous.next = temp;
				current = temp;
				break;
			}
			runner = runner.next;
		}

		if(runner == current) {
			previous = current;
			current = current.next;
		}
		

	}

}
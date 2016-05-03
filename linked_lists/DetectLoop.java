import java.util.*;

public class DetectLoop {
	public boolean detectLoop(Node head) {
		Node slow = fast = head;
		while(true) {
			if(!fast || !(fast.next)) {
				return false;
			}else if(slow == fast || fast.next == slow) {
				return true;
			}else {
				slow = slow.next;
				fast = fast.next.next;
			}

		}
	}
}
public class CompareLinkedLists {
	boolean areEqual;
	public static boolean compareLinkedLists(Node l1, Node l2) {
		if(l1 == null && l2 == null) {
			areEqual = true;
		}else {
			if(l1 == null || l2 == null) {
				areEqual = false;
			}else if(l1.data != l2.data){
				areEqual = false;
			}else {
				compareLinkedLists(l1.next, l2.next);
			}
		}
		return areEqual;
	}
}

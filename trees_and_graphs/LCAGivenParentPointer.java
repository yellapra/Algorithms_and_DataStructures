public class LCAGivenParentPointer {

	public static Node LCA(Node root, Node n1, Node n2) {
		if(root == null) {
			return null;
		}

		int depth_diff = depth(n1) - depth(n2);

		if(depth_diff < 0) {
			depth_diff *= -1;
			//swap pointers so you can always move n1 if depth_diff is +ve or -ve
			Node temp = n1;
			n1 = n2;
			n2 = temp;
		}

		while(depth_diff != 0) {
			n1 = n1.parent;
		}

		while(n1 && n2) {
			if(n1 == n2) {
				return n1;
			}
			n1 = n1.parent;
			n2 = n2.parent;
		}
		return null;
	}

	public static int depth(Node node){
		int d = 0;
		while(node) {
			d++;
			node = node.parent;
		}
		return d;
	}
}
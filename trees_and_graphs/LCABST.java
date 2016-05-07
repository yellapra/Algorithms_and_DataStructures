import java.util.*;

public class LCABST {
	public static Node LCA(Node node, int n1, int n2){
		Node lca = null;
		if(node == null) {
			return null;
		}
		boolean v1 = false;
		boolean v2 = false;
		v1 = findPresence(node, n1);
		v2 = findPresence(node, n2);

		if(v1 && v2) {
			lca = findLCA(node, n1, n2);
		}

		return lca;
	}

	public static boolean findPresence(Node node, int n) {
		if(node == null){
			return false;
		}else if(node.data == n){
			return true;
		}else if(node.data > n){
			return findPresence(node.left, n);
		}else{
			return findPresence(node.right, n)
		}
	}

	public static Node findLCA(Node node, int n1, int n2) {
		while(node != null) {
			if(node.data > n1 && node.data > n2){
				node = node.left;
			}else if(node.data < n1 && node.data < n2){
				node = node.right;
			}else {
				return node;
			}
		}
	}
}
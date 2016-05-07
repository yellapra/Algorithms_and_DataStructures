import java.util.*;

public class LCABinaryTree {

	Node root;
	static boolean v1=false, v2=false;
	public static Node LCA(Node root, int n1, int n2) {
		if(root == null) {
			return null;
		}

		if(root.data == n1) {
			v1 = true;
			return root;
		}
		if(root.data == n2) {
			v2 = true;
			return root;
		}

		Node left_lca = LCA(root.left, n1, n2);
		Node right_lca = LCA(root.right, n1, n2);

		if(left_lca && right_lca) {
			return root;
		}

		return left_lca != null ? left_lca : right_lca;
	}

	public static Node findLCA(int n1, int n2) {
		v1 = false; 
		v2 = false;
		Node lca = LCA(root, n1, n2);
		if(v1 && v2) {
			return lca;
		}else {
			return null;
		}
	}
}
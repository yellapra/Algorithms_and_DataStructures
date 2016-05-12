//t1 is the bigger tree and t2 is the subtree
public class IsSubTree{
	public boolean isSubTree(Node t1, Node t2){
		if(t2 == null){
			return true;
		}
		return subTree(t1, t2);
	}

	public boolean subtree(Node n1, Node n2){
		//subtree not found in main tree
		if(n1 == null){
			return false;
		}
		//if data matches, then match left and right subtrees
		if(n1.data == n2.data){
			if(matchsubTrees(n1, n2)){
				return true;
		}
		//search in left or right subtree
		return (subtree(n1.left, n2) || subtree(n1.right, n2));
	}

	public boolean matchsubTrees(Node n1, Node n2){
		if(n1 == null && n2 == null){
			return true;
		}
		if(n1 == null || n2 == null){
			return false;
		}
		if(n1.data != n2.data){
			return false;
		}
		return (matchsubTrees(n1.left, n2.left) && matchsubTrees(n1.right, n2.right));

	}
}
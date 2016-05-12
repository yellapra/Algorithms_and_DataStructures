//Balanced tree is where the leaf nodes differ in height max by 1.

class IsBTBalanced {
	public boolean isBalanced(Node root){
		int max_depth = maxDepth(root);
		int min_depth = minDepth(root);
		if(max_depth - min_depth > 1){
			return false;
		}else{
			return true;
		}
	}

	public int maxDepth(Node root){
		if(root == null){
			return 0;
		}
		return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	public int minDepth(Node root){
		if(root == null){
			return 0;
		}
		return 1+Math.min(minDepth(root.left), minDepth(root.right));
	}
}
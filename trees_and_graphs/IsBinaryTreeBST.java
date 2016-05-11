class IsBinaryTreeBST{

	//This is O(n^2)
	public boolean isBST(Node root){
		if(root == null){
			return true;
		}
		if(root.left != null && root.data < maxValue(root.left)){
			return false;
		}	
		if(root.right != null && root.data > minValue(root.right)){
			return false;
		}	
		if(!isBST(root.left) || !isBST(root.right)){
			return false;
		}

		return true;
	}

	//This is O(n)
	public boolean isBST2(Node root){
		return checkBST(root, INTEGER.MIN_VALUE, INTEGER.MAX_VALUE);
	}
	public boolean checkBST(Node root, int min, int max){
		if(root == null){
			return true;
		}

		if(root.data < min || root.data > max){
			return false;
		}

		return (checkBST(root.left, min, root.data - 1) && checkBST(root.right, root.data + 1, max));
	}

}
public class BTHeight{
	public int recursiveHeight(Node root){
		if(root == null){
			return 0;
		}
		int leftHeight = recursiveHeight(root.left);
		int rightHeight = recursiveHeight(root.right);

		if(leftHeight > rightHeight){
			return leftHeight + 1;
		}else{
			return rightHeight + 1;
		}
	}

	public int iterativeHeight(Node root){
		Queue<Node> q = new Queue<Node>();
		q.push(root);
		int height = 0;
		int nodeCount = 0;

		while(true){
			nodeCount = q.size();
			if(nodeCount == 0){
				return height;
			}
			height++;

			while(nodeCount!=0){
				Node elem = q.front();
				q.pop();
				if(elem.left){
					q.push(elem.left);
				}
				if(elem.right){
					q.push(elem.right);
				}
				nodeCount--;
			}
		}
	}
}

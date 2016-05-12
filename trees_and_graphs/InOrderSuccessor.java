public class InOrderSuccessor{
	public Node inOrderSuccessor(Node n){
		if(n == null){
			return null;
		}
		if(n.right){
			return leftMostNode(n.right);
		}else{
			Node p = n.parent;
			while(p != null && n == p.right){
				n = p;
				p = p.parent;
			}
		}

		return p;
	}
}
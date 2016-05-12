public class LinkedListAtEachDepth{

	public ArrayList<LinkedList<Node>> linkedListByLevel(Node root){
		if(root == null){
			return null;
		}
		int level = 0;
		ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
		result.add(level, new LinkedList(root));

		while(true){
			LinkedList<Node> childList = new LinkedList<Node>();
			for(int i = 0; i<result.get(level).size(); i++){
				Node elem = result.get(level).get(i);
				if(elem.left!=null){
					childList.add(elem.left);
				}
				if(elem.right!=null){
					childList.add(elem.right);
				}

			} 
			if(childList.size > 0){
				result.add(level+1, childList);
			}else{
				break;
			}
			level++;
		}

		return result;

	}
}
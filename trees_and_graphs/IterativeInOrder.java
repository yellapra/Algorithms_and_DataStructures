//left, root, right
public class IterativeInOrder{
	public static void iterativeInOrder(Node root){
		if(root == null){
			return;
		}
		Stack<Node> s = new Stack<Node>();

		//Push root first and push left nodes in order so that leftmost will be on top of stack
		while(root!=null){
			s.push(root);
			root = root.left;
		}
		//When root is null, we have reached left child of left most leaf node so pop it, print it and check its right child.
		//If the right child exists, then you need to traverse its left tree first to repeat the same process.
		while(!s.isEmpty()){
			Node elem = s.pop();
			System.out.println(elem.data);
			if(elem.right!=null){
				elem = elem.right;
			}

			while(elem!=null){
				s.push(elem;)
				elem = elem.left;
			}
		}

	}
}

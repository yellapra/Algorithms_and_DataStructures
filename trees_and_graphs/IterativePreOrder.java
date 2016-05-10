//root, left, right
public class IterativePreOrder{
	public void iterativePreOrder(Node root){
		if(root == null){
			return;
		}
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		//Push right then left to get root left right
		while(!(s.isEmpty())){
			Node elem = s.pop();
			System.out.println(elem.data);
			if(elem.right){
				s.push(elem.right);
			}
			if(elem.left){
				s.push(elem.left);
			}
		}
	}
}
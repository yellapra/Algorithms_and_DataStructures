public enum State{
	unvisited, visiting, visited;
}

public class GraphRoute{
	public boolean search(Node start, Node end){
		if(start == null || end == null){
			return false;
		}

		start.state = State.visiting;
		for(Node child : start.adjacency_list){
			child.state = State.unvisited;
		}

		Queue<Node> q = new Queue<Node>();
		q.add(start);

		while(q.size()!=0){
			Node node = q.remove();
			ArrayList<Node> child_list = node.adjacency_list;

			for(Node v : childList){
				if(v.state == State.unvisited){
					if(v == end){
						return true;
					}else{
						q.state = State.visiting;
						q.add(v);
					}
				}
			}
			node.state = State.visited;
		}

		return false;

	}
}
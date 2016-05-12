public class CycleInDirectedGraph{
	public boolean detectCycle(int v, boolean[] visited, boolean[] recursion){
		if(visited[v] == false){
			visited[v] = true;
			recursion[v] = true;

			Iterator<Integer> it = adj[v].iterator();
	        while (it.hasNext())
	        {
	            i = it.next();
	            if(!visited[i] && detectCycle(i, visited, recursion)){
	            	return true;
	            }else if(recursion[i]){
	            	return true;
	            }
			}
		recursion[v] = false;
		return false;
	}
}
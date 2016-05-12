public class FindAllPathsSum{
	public void findAllPathsSum(Node root, int sum, ArrayList<Integer> buffer, int level){
		if(root == null){
			return;
		}
		buffer.add(root.data);
		int temp = sum;
		for(int i=level; i > -1; i--){
			temp = temp - buffer.get(i);
			if(temp == 0){
				printPath(buffer, i, level);
			}
		}

		ArrayList<Integer> a1 = ArrayList<Integer> buffer.clone();
		ArrayList<Integer> a2 = ArrayList<Integer> buffer.clone();
		findAllPathsSum(root.left, sum, a1, level+1);
		findAllPathsSum(root.right, sum, a2, level+1);
	}

	public void printPath(ArrayList<Integer> buffer, int i, int j){
		for(int k=i; k<=j; k++){
			System.out.print(buffer.get(k)+" ");
		}
		System.out.println();
	}
}
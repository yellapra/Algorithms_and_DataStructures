

public Node closestNode(Node root, int value){

    if(root == null || root.value == value){
      return root;
    }
    else if(!root.left && root.value > value){
      Node left = closestNode(root.left, value);
      return Math.abs(left.value - value) > Math.abs(root.value - value) ? root : left;
    }
    else if(!root.right && root.value < value){
      Node right = closestNode(root.right, value);
      return Math.abs(right.value - value) > Math.abs(root.value - value) ? root : right;
    }
    return null;
  }
  

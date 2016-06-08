

public Node closestNode(Node root, int value){

    if(root.value == value){
      return root;
    }
    else if(root.value > value){
        if(!root.left) return root;
        Node left = closestNode(root.left, value);
        return Math.abs(left.value - value) > Math.abs(root.value - value) ? root : left;
    }
    else if(root.value < value){
        if(!root.right) return root;
        Node right = closestNode(root.right, value);
        return Math.abs(right.value - value) > Math.abs(root.value - value) ? root : right;
    }
    return null;
  }
  

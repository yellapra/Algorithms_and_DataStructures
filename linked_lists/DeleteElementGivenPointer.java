import java.util.*;
//Basically, copy the next element's data into the given node and delete the next node
public void deleteNodeGivenPointer(Node node){
	//In java you can't free memory. So if you have a single element return
	if(!node || node.next == null) {
		return;
	}
	node.data = node.next.data;
	node.next = node.next.next;
}

//In C 

void deleteNodeGivenPointer(Node *nodeToDelete) {
	if(!nodeToDelete){
		return;
	}

	nodeToDelete->data = nodeToDelete->next->data;
	Node *temp = nodeToDelete->next->next;
	delete(nodeToDelete->next);
	nodeToDelete->next = temp;

}
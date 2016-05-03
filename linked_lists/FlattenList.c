//Method to flatten doubly linked list with child nodes at each level

void flattenList(Node *head, Node **tail) {
	if(!head) {
		return;
	}

	Node *current = head;
	while(current) {
		if(current->child) {
			append(current->child, tail);
		}
		current = current->next;
	}
}

void append(Node *child, Node **tail) {
	Node *current_node = child;
	*tail -> next = child;
	child -> prev = *tail;
	
	while(current_node -> next != NULL){
		current_node = current_node ->next;
	}

	*tail = current_node;
}
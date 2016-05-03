void UnFlattenList(Node *head, Node **tail) {
	if(!head) {
		return;
	}

	Node *current = head;
	unLink(head);

	while(current->next != NULL) {
		current = current->next;
	}

	*tail = current;
}

void unLink(Node *node) {

	while(node){
		if(node -> child) {
			node->child->prev->next = null;
			node->child->prev = null;
			unLink(node->child);
		}
		node = node->next;
	}
}
	
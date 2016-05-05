void copyLinkedList(struct node *head, struct node **newList) {
	if(head != null){
		*newList = malloc(sizeof(struct node));
		*newList->data = head->data;
		*newList->next = null;
		copyLinkedList(head->next, &(*newList->next));
	}
	
}
class HashMapImplementation <K, V>{
	private Node<K,V> table;
	private int capacity;

	static class Node<K, V>{
		K key;
		V value;
		Node<K, V> next;

		Node(K key, V Value){
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}

	HashMapImplementation(int capacity){
		this.capacity = capacity;
		table = new Node[capacity];
	}

	private int hash(K key){
		return Math.abs(key.hashCode()) % capacity;
	}


//Get value for a key
	public V get(K key){
		int hash = hash(key);
		if(table[hash] == null){
			return null;
		}
		Node<K, V> temp = table[hash];
		while(temp!=null){
			if(temp.key.equals(key)){
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	//Put key value pair, or replace value for existing key
	public boolean put(K key, V value){
		if(key == null){
			return false;
		}
		int hash = hash(key);
		if(table[hash] == null){
			table[hash] = new Node<K, V>(key, value);
			return true;
		}
		else{
			Node<K, V> current = table[hash];
			Node<K, V> prev = null;
			while(current != null){
				if(current.key.equals(key)){
					current.value = value;
					return true;
				}
				prev = current;
				current = current.next;
			}
			Node<K, V> newNode = new Node<K, V>(key, value);
			prev.next = newNode;
			return true;
		}
		return false;
	}


	//Remove key value pair
	public boolean remove(K key){
		if(key == null){
			return false;
		}
		int hash = hash(key);
		if(table[hash] == null){
			return false;
		}

		Node<K, V> current = table[hash];
		Node<K,V> prev = null;
		while(current != null){
			if(current.key.equals(key)){
				if(prev == null){
					Node<K, V> temp = current.next;
					current.next = null;
					table[hash] = temp;
					return true;
				}
				else{
					prev.next = current.next;
					current.next = null;
					return true;
				}
				prev = current;
				current = current.next;				
			}
		}
		return false;

	}
}





















package week4.PriorityQueue;

public class SymbolTable<Key extends Comparable<Key>, Value> {
	private Node root;

	private class Node {
		Key key;
		Value value;
		Node left, right;
		int count; // number of nodes in subtree

		public Node(Key key, Value value) {
			this.key = key;
			this.value = value;
		}

		public Node(Key key, Value value, int count) {
			this.key = key;
			this.value = value;
			this.count = count;
		}

	}

	public Key floor(Key key) {
		Node floor = floor(root, key);
		if (floor == null)
			return null;
		return floor.key;
	}

	private Node floor(Node cur, Key key) {

		return null;
	}

	public void put(Key key, Value value) {
		root = put(root, key, value);
	}

	private Node put(Node cur, Key key, Value value) {
		if (cur == null)
			return new Node(key, value, 1);
		int cmp = cur.key.compareTo(key);
		if (cmp < 0)
			cur.right = put(cur.right, key, value);
		else if (cmp > 0)
			cur.left = put(cur.left, key, value);
		else
			cur.value = value;
		
		cur.count = 1 + size(cur.left) + size(cur.right);
		return cur;
	}

	public Value get(Key key) {
		Node cur = root;
		while (cur != null) {
			int cmp = cur.key.compareTo(key);
			if (cmp < 0)
				cur = cur.left;
			else if (cmp > 0)
				cur = cur.right;
			else
				return cur.value;
		}
		return null;
	}

	public int size() {
		return size(root);
	}

	private int size(Node cur) {
		if (cur == null)
			return 0;
		return cur.count;
	}

}

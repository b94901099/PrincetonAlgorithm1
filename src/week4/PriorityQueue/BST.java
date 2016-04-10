package week4.PriorityQueue;

public class BST<Key extends Comparable<Key>, Value> {
	private Node root;

	private class Node {
		Key key;
		Value value;
		Node left, right;

		public Node(Key key, Value value) {
			this.key = key;
			this.value = value;
		}
	}

	public void put(Key key, Value value) {
		root = put(root, key, value);
	}

	private Node put(Node cur, Key key, Value value) {
		if (cur == null)
			return new Node(key, value);
		int cmp = cur.key.compareTo(key);
		if (cmp < 0)
			cur.right = put(cur.right, key, value);
		else if (cmp > 0)
			cur.left = put(cur.left, key, value);
		else
			cur.value = value;
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

}

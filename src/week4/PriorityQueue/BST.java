package week4.PriorityQueue;

public class BST<Key extends Comparable<Key>, Value> {
	private Node root;

	private class Node {
		Key key;
		Value value;
		Node left, right;
		int count = 0;

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

	public void delete(Key key) {
		root = delete(root, key);
	}

	private Node delete(Node node, Key key) {
		if (node == null)
			return null;

		int cmp = key.compareTo(node.key);
		if (cmp < 0) {
			node.left = delete(node.left, key);
		} else if (cmp > 0) {
			node.right = delete(node.right, key);
		} else {
			if (node.left == null)
				return node.right;
			if (node.right == null)
				return node.left;
			Node tmp = node;
			node = min(node.right);
			node.right = deleteMin(tmp.right);
			node.left = tmp.left;
		}
		node.count = 1 + size(node.left) + size(node.right);
		return node;
	}

	private Node min(Node node) {
		if (node == null)
			return null;
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}

	private Node deleteMin(Node node) {
		if (node == null)
			return null;
		if (node.left == null)
			return node;
		node.left = deleteMin(node.left);
		node.count = 1 + size(node.left) + size(node.right);
		return node;
	}

	private int size(Node node) {
		if (node == null)
			return 0;
		return 1 + size(node.left) + size(node.right);
	}

}

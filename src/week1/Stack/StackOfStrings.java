package week1.Stack;

public class StackOfStrings {

	Node first = null;
	int size = 0;

	StackOfStrings() {

	}

	void push(String item) {
		Node oldHead = first;
		first = new Node();
		first.item = item;
		first.next = oldHead;
	}

	String pop() {
		Node top = first;
		first = first.next;
		return top.item;
	}

	boolean isEmpty() {
		return first == null;
	}

	int size() {
		return 0;
	}

	private class Node {
		String item;
		Node next;
	}
}

package week1.Queue;

public class QueueOfStrings {

	Node head = null;
	Node tail = null;

	public QueueOfStrings() {
	}

	void enqueue(String item) {
		Node oldTail = tail;
		tail = new Node();
		tail.item = item;
		tail.next = null;

		if (isEmpty()) {
			head = tail;
		} else {
			oldTail.next = tail;
		}

	}

	String dequeue() {
		String item = head.item;
		head = head.next;
		if (isEmpty()) {
			tail = null;
		}
		return item;
	}

	boolean isEmpty() {
		return head == null;
	}

	int size() {
		return 0;
	}

	private class Node {
		String item;
		Node next;
	}
}

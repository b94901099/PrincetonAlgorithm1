package week1.Queue;

public class ResizingArrayQueueOfStrings {

	String[] queue = new String[1];
	int head = 0;
	int tail = -1;
	int size = 0;

	void enqueue(String item) {
		if (size == queue.length) {
			resizeQueue(queue.length * 2);
		}

		if (++tail == queue.length) {
			tail = 0;
		}
		queue[tail] = item;
		size++;

	}

	String dequeue() {
		String item = queue[head];
		queue[head++] = null;

		if (head == queue.length) {
			head = 0;
		}

		size--;

		if (size == queue.length / 4) {
			resizeQueue(queue.length / 2);
		}

		return item;
	}

	boolean isEmpty() {
		return size == 0;
	}

	int size() {
		return size;
	}

	private void resizeQueue(int newSize) {
		if (newSize < 1) {
			return;
		}

		String[] newQueue = new String[newSize];
		for (int i = 0; i < size; i++) {
			newQueue[i] = queue[head++];
			if (head == queue.length) {
				head = 0;
			}
		}
		head = 0;
		tail = size - 1;
		queue = newQueue;
	}

}

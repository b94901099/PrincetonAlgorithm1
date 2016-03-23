package week1.Queue;

public class QueueClient {

	public static void main(String[] args) {
//		QueueOfStrings queue = new QueueOfStrings();
		ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings();

		String[][] sampleSet = {
				{ "1", "2", "3", "4", "5", "-", "-", "-", "-", "-" },
				{ "1", "2", "5", "-", "3", "4", "-", "-", "-", "-" },
				{ "5", "-", "4", "-", "3", "-", "2", "-", "1", "-" } };

		for (String[] sample : sampleSet) {
			for (String s : sample) {
				if (s.equals("-")) {
					System.out.print(queue.dequeue() + ", ");
				} else {
					queue.enqueue(s);
				}
			}
			System.out.println();
		}

	}

}

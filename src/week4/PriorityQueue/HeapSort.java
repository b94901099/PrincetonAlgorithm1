package week4.PriorityQueue;

public class HeapSort {

	public static void sort(Comparable[] pq) {
		int N = pq.length;
		for (int k = N / 2; k >= 1; k--) {
			sink(pq, k, N);
		}
		while (N > 1) {
			exchange(pq, 1, N);
			sink(pq, 1, --N);
		}
	}

	private static void sink(Comparable[] pq, int k, int N) {
		int biggerChild = 0;
		while (k * 2 <= N) {
			int leftChild = k * 2;
			int rightChild = k * 2 + 1;

			if (rightChild <= N && less(pq[leftChild], pq[rightChild]))
				biggerChild = rightChild;
			else
				biggerChild = leftChild;

			if (less(pq[k], pq[biggerChild])) {
				exchange(pq, k, biggerChild);
				k = biggerChild;
			}
		}
	}

	private static void exchange(Comparable[] pq, int i, int j) {
		Comparable swap = pq[i - 1];
		pq[i - 1] = pq[j - 1];
		pq[j - 1] = swap;
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

}

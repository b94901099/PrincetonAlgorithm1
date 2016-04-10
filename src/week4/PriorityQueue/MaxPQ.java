package week4.PriorityQueue;

/**
 * For MinPQ, just replace less with greater
 * 
 * @author shenchen
 *
 * @param <Key>
 */
public class MaxPQ<Key extends Comparable<Key>> {

	Key[] pq = null;
	int N = 0;

	public MaxPQ(int capacity) {
		pq = (Key[]) new Comparable[capacity + 1];
		// capacity + 1 because pq[0] is not used
	}

	public void insert(Key key) {
		pq[++N] = key;
		swim(N);
	}

	public Key delMax() {
		Key max = pq[1];
		exchange(1, N--);
		sink(1);
		pq[N + 1] = null;
		return max;
	}

	private void swim(int k) {
		while (k > 1 && less(pq[k / 2], pq[k])) {
			exchange(k / 2, k);
			k = k / 2;
		}
	}

	private void sink(int k) {
		int biggerChild = 0;
		while (k * 2 <= N) {
			int leftChild = k * 2;
			int rightChild = k * 2 + 1;

			if (rightChild <= N && less(pq[leftChild], pq[rightChild]))
				biggerChild = rightChild;
			else
				biggerChild = leftChild;

			if (less(pq[k], pq[biggerChild])) {
				exchange(k, biggerChild);
				k = biggerChild;
			}
		}
	}

	public boolean isEmpty() {
		return N == 0;
	}

	private void exchange(int i, int j) {
		Key swap = pq[i];
		pq[i] = pq[j];
		pq[j] = swap;
	}

	private boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
}

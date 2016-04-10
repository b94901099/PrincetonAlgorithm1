package week3.Sort;

import edu.princeton.cs.algs4.StdRandom;

public class FindKthElement {
	// It is like quick sort. Stop when you find the target index k.
	// At this point, elements smaller than a[k] are at left of k.
	public static Comparable findKthElement(Comparable[] a, int k) {
		StdRandom.shuffle(a);
		int lo = 0, hi = a.length - 1;
		
		while (hi > lo) {
			int j = partition(a, lo, hi);
			if (j < k)  
				lo = j + 1;
			else if (j > k)
				hi = j - 1;
			else
				return a[k];
		}
		return a[k];
	}	

	private static int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j = hi + 1;
		while (true) {
			while (less(a[++i], a[lo]))
				if (i == hi)
					break;
			while (less(a[lo], a[--j]))
				if (j == lo)
					break;
			if (i >= j)
				break;
			exchange(a, i, j);
		}
		exchange(a, lo, j);
		return j;
	}

	private static void exchange(Comparable[] items, int i, int j) {
		Comparable swap = items[i];
		items[i] = items[j];
		items[j] = swap;
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

}

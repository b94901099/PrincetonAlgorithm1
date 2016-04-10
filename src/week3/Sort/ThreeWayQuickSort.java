package week3.Sort;

public class ThreeWayQuickSort {

	public static void sort(Comparable[] a) {
		sort(a, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo)
			return;
		int lt = lo, gt = hi;
		Comparable v = a[lo];
		int i = lo;
		while (i <= gt) {
			int cmp = a[i].compareTo(v);
			if (cmp < 0)
				exchange(a, lt++, i++);
			else if (cmp > 0)
				exchange(a, i, gt--);
			else
				i++;
		}

		sort(a, lo, lt - 1);
		sort(a, gt + 1, hi);
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

package week3.Sort;

public class Merge {

	public static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		// Do Not create aux in recursion. It leads to extra array creation and
		// poor performance.
		sort(a, aux, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		if (hi <= lo)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);

		if (!less(a[mid + 1], a[mid]))
			return;
		// a[mid] <= a[mid + 1]
		// This section [lo, hi] is already sorted, no need to merge again
		merge(a, aux, lo, mid, hi);
	}

	/**
	 * a [A, G, L, O, R, H, I, M, S, T]<br>
	 * aux []<br>
	 * 
	 * @param a
	 * @param aux
	 * @param lo
	 * @param mid
	 * @param hi
	 */
	private static void merge(Comparable[] a, Comparable[] aux, int lo,
			int mid, int hi) {
		assert isSorted(a, lo, mid);
		assert isSorted(a, mid + 1, hi);

		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}

		int i = lo;
		int j = mid + 1;

		for (int k = lo; k <= hi; k++) {
			if (i > mid)
				a[k] = aux[j++];
			else if (j > hi)
				a[k] = aux[i++];
			else if (less(aux[j], aux[i]))
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}

		assert isSorted(a, lo, hi);
	}

	private static boolean isSorted(Comparable[] a, int start, int end) {
		for (int i = start; i < end - 1; i++) {
			if (!less(a[i], a[i + 1])) {
				return false;
			}
		}
		return true;
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

}

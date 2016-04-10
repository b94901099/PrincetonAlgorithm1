package week3.Sort;

public class ButtomUpMerge {

	public static void sort(Comparable[] a) {
		int N = a.length;
		Comparable[] aux = new Comparable[N];
		for (int sz = 1; sz < N; sz = sz * 2) {
			for (int lo = 0; lo < N - sz; lo += sz * 2) {
				merge(a, aux, lo, lo + sz - 1,
						Math.min(lo + sz + sz - 1, N - 1));
			}
		}
	}

	private static void merge(Comparable[] a, Comparable[] aux, int lo,
			int mid, int hi) {
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
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

}

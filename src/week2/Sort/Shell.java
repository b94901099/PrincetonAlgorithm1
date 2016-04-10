package week2.Sort;

public class Shell {
	public static void sort(Comparable[] a) {
		int N = a.length;

		int h = 1;
		while (h < N / 3) {
			h = 3 * h + 1;
		}

		while (h >= 1) {
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
					exchange(a, j, j - h);
				}
			}
			h = h / 3;
		}
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	private static void exchange(Comparable[] items, int i, int j) {
		Comparable swap = items[i];
		items[i] = items[j];
		items[j] = swap;
	}

}

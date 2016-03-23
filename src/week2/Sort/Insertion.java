package week2.Sort;

public class Insertion {

	public static void sort(Comparable[] items) {
		int N = items.length;

		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0; j--) {
				if (less(items[j], items[j - 1])) {
					exchange(items, j, j - 1);
				} else {
					break;
					// stop when it is at the right position, don't have to keep
					// going
				}
			}
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

	private static boolean isSorted(Comparable[] items) {
		for (int i = 1; i < items.length; i++) {
			if (less(items[i], items[i - 1])) {
				return false;
			}
		}
		return true;
	}

}

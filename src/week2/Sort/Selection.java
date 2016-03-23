package week2.Sort;

public class Selection {
	public static void sort(Comparable[] items) {
		for (int i = 0; i < items.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < items.length; j++) {
				if (less(items[j], items[minIndex])) {
					minIndex = j;
				}
			}

			exchange(items, i, minIndex);
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

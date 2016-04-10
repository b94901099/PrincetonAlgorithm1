package week2.Sort;

import edu.princeton.cs.algs4.StdRandom;

/**
 * 1. In iteration i, pick integer r between 0 and i uniformly at random <br>
 * 2. Swap a[i] and a[r]<br>
 * 3. Common bug: pick r between 0 and N - 1<br>
 * 		correct variant: between i and N - 1	  
 */
public class Shuffle {
	public void shuffle(Object[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int r = StdRandom.uniform(i + 1); //between 0 and i 
			exchange(a, i, r);
		}
	}

	private static void exchange(Object[] items, int i, int j) {
		Object swap = items[i];
		items[i] = items[j];
		items[j] = swap;
	}
}

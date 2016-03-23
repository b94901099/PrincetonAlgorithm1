package week1.DynamicConnectivity;

import tools.StdIn;
import tools.StdOut;

public class QuickUnionDemo {

	public static void main(String[] args) {
		System.out.println("Decide N");
		int N = StdIn.readInt();
		QuickUnion qu = new QuickUnion(10);
		while (!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if (!qu.connected(p, q)) {
				qu.union(p, q);
				StdOut.println(String.format("Connect %d and %d", p, q));
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.print(qu.id[i] + ", ");
		}

	}

}

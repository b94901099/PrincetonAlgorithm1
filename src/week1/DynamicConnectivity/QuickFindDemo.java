package week1.DynamicConnectivity;

import tools.StdIn;
import tools.StdOut;

public class QuickFindDemo {

	public static void main(String[] args) {
		System.out.println("Decide N");
		int N = StdIn.readInt();
		QuickFind qf = new QuickFind(10);
		while (!StdIn.isEmpty()) {
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if (!qf.connected(p, q)) {
				qf.union(p, q);
				StdOut.println(String.format("Connect %d and %d", p, q));
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.print(qf.id[i] + ", ");
		}
	}
}

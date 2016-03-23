package week1.DynamicConnectivity;

public class FlattenTreeQuickUnion {
	int[] id = null;

	public FlattenTreeQuickUnion(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	public void union(int p, int q) {
		int pRoot = root(p);
		int qRoot = root(q);
		id[pRoot] = qRoot;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	private int root(int i) {
		while (i != id[i]) {
			id[i] = id[id[i]];
			i = id[i];
		}
		return i;
	}
}

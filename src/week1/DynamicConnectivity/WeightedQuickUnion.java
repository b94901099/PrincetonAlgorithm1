package week1.DynamicConnectivity;

public class WeightedQuickUnion {
	int[] id = null;
	int[] sz = null;

	public WeightedQuickUnion(int N) {
		id = new int[N];
		sz = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}

	public void union(int p, int q) {
		int pRoot = root(p);
		int qRoot = root(q);
		if (pRoot == qRoot) {
			return;
		}
		if (sz[pRoot] < sz[qRoot]) {
			id[pRoot] = qRoot;
			sz[qRoot] += sz[pRoot];
		} else {
			id[qRoot] = pRoot;
			sz[pRoot] += sz[qRoot];
		}
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	private int root(int i) {
		while (i != id[i]) {
			i = id[i];
		}
		return i;
	}
}

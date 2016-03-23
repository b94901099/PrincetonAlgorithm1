package week1.DynamicConnectivity;

public class QuickFind {
	int[] id = null;

	public QuickFind(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	public void union(int p, int q) {
		int qValue = id[q];
		int pValue = id[p];
		for (int i = 0; i < id.length; i++) {
			if (id[i] == qValue) {
				id[i] = pValue;
			}
		}
	}

	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}

}

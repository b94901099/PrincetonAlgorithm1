package week4.PriorityQueue;

/**
 * An example of immutable class
 * 
 * @author shenchen
 *
 */
public final class Vector {
	private final int N;
	private final double[] data;

	public Vector(double[] data) {
		N = data.length;
		this.data = new double[N];
		for (int i = 0; i < N; i++) {
			this.data[i] = data[i];
		}
	}

}

package week2.Sort;

import java.util.Random;

public class SortClient {

	public static void main(String[] args) {

	}

	public void doubleSort() {
		int N = 10;
		Double[] numbers = new Double[N];
		Random random = new Random();
		for (int i = 0; i < N; i++) {
			numbers[i] = random.nextDouble();
		}

		Insertion.sort(numbers);

		for (int i = 0; i < N; i++) {
			System.out.print(numbers[i] + ", ");
		}
	}

	public void stringSort() {
		String[] strings = { "bed bug dad yet zoo all bad yes" };
		Insertion.sort(strings);
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + ", ");
		}
	}

}

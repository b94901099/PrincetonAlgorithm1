package week2.Sort;

import java.util.Random;

import week3.Sort.ButtomUpMerge;
import week3.Sort.Merge;
import week3.Sort.ThreeWayQuickSort;
import week4.PriorityQueue.HeapSort;

public class SortClient {

	public static void main(String[] args) {
		printMergeSort();
		System.out.println();
		printHeapSort();
	}

	public static void printHeapSort() {
		Character[] numbers = { 'M', 'E', 'R', 'G', 'E' };

		HeapSort.sort(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}

	}

	public static void printThreeWayQuickSort() {
		Character[] numbers = { 'M', 'E', 'R', 'G', 'E' };

		ThreeWayQuickSort.sort(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}

	}

	public static void printMergeSort() {

		Character[] numbers = { 'M', 'E', 'R', 'G', 'E' };

		ButtomUpMerge.sort(numbers);

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
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

package tools;

import java.util.Scanner;

public class StdIn {
	private static Scanner sc = new Scanner(System.in);

	public static int readInt() {
		return sc.nextInt();
	}

	public static boolean isEmpty() {
		String s = sc.nextLine();
		if (s == null || s.length() == 0) {
			return true;
		}
		return false;
	}

	public static String readString() {
		
		return null;
	}
}

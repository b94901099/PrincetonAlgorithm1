package week1.Stack;

public class FixedArrayStackOfStrings {
	String[] stack = null;
	int index = 0;

	FixedArrayStackOfStrings(int capacity) {
		stack = new String[capacity];
	}

	void push(String item) {
		stack[index++] = item;
	}

	String pop() {
		String s = stack[--index];
		stack[index] = null;
		return s;
	}

	boolean isEmpty() {
		return index == 0;
	}

}

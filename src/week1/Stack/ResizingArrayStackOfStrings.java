package week1.Stack;

public class ResizingArrayStackOfStrings {

	private String[] stack;
	private int index = 0;

	ResizingArrayStackOfStrings() {
		stack = new String[1];
	}

	void push(String item) {
		if (index == stack.length) {
			resizeStack(stack.length * 2);
		}
		stack[index++] = item;
	}

	String pop() {
		String s = stack[--index];
		stack[index] = null;

		if (index > 0 && index == stack.length / 4) {
			resizeStack(stack.length / 2);
		}
		return s;
	}

	boolean isEmpty() {
		return index == 0;
	}

	private void resizeStack(int size) {
		String[] newStack = new String[size];

		for (int i = 0; i < index; i++) {
			newStack[i] = stack[i];
		}
		stack = newStack;
	}

}

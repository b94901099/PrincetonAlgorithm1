package week1.Stack;

public class StackOfStringsClient {

	public static void main(String[] args) {
		ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings();
//		FixedArrayStackOfStrings stack = new FixedArrayStackOfStrings(5);

		String[][] sampleSet = {
				{ "1", "2", "3", "4", "5", "-", "-", "-", "-", "-" },
				{ "1", "2", "5", "-", "3", "4", "-", "-", "-", "-" },
				{ "5", "-", "4", "-", "3", "-", "2", "-", "1", "-" } };

		for (String[] sample : sampleSet) {
			for (String s : sample) {
				if (s.equals("-")) {
					System.out.print(stack.pop() + ", ");
				} else {
					stack.push(s);
				}
			}
			System.out.println();
		}
	}

}

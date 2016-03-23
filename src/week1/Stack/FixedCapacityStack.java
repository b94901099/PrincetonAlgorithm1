package week1.Stack;

import java.util.Iterator;

public class FixedCapacityStack<Item> implements Iterable<Item> {
	private Item[] stack = null;
	private int index = 0;

	FixedCapacityStack(int capacity) {
		stack = (Item[]) new Object[capacity];
	}

	void push(Item item) {
		stack[index++] = item;
	}

	Item pop() {
		Item s = stack[--index];
		stack[index] = null;
		return s;
	}

	boolean isEmpty() {
		return index == 0;
	}

	@Override
	public Iterator<Item> iterator() {
		return new FixedCapacityStackIterator();
	}

	private class FixedCapacityStackIterator implements Iterator<Item> {

		int size = index;

		@Override
		public boolean hasNext() {
			return size > 0;
		} 

		@Override
		public Item next() {
			return stack[--size];
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub

		}

	}

}

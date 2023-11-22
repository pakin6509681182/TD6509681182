package core;

import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Integer> stack;
	private int Asize;
	public Stack() {
	    this(10); // Default capacity is 10
	    stack = new ArrayList<>();
	}
	public Stack(int size) {
		stack = new ArrayList<>(size);
		Asize = size;
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public int getSize() {
		return stack.size();
	}

	
	public void push(Integer item) {
	    if (Asize > 0 && getSize() >= Asize) {
	        throw new PushToFullStackException("Stack is full. Cannot push to full stack.");
	    }
	    stack.add(item);
	}

	@Override
	public Integer pop() {
		if (isEmpty()) {
			return null; // or throw an exception
		}
		return stack.remove(stack.size() - 1);
	}

	@Override
	public Integer top() {
		if (isEmpty()) {
			return null; // or throw an exception
		}
		return stack.get(stack.size() - 1);
	}
}
package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	Integer pop();
	Integer top();
	void push(Integer item);
}
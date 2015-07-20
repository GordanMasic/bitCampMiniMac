package ba.bitcamp.GenericClasses;

import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class MyStack<T> {

	private Node start;

	public MyStack() {
		this.start = null;
	}

	public String toString() {
		if (start == null) {
			return null;
		}
		String s = start.toString() + " ";
		Node temp = start.getNext();
		while (temp != null) {
			s += temp.toString() + " ";
			temp = temp.getNext();
		}
		return s;
	}

	public T push(T el) {
		if (start == null) {
			start = new Node(el);
		} else {
			Node newNode = new Node(el);
			newNode.setNext(start);
			start = newNode;
		}
		return el;
	}

	public void add(Collection<T> col) {
		Iterator<T> it = col.iterator();
		while (it.hasNext()) {
			this.push(it.next());
		}
	}

	public T pop() {
		if (start == null) {
			throw new EmptyStackException();
		} else {
			T s = start.value;
			start = start.getNext();
			return s;
		}
	}

	public T peek() {
		if (start == null) {
			throw new EmptyStackException();
		} else {
			return start.value;

		}
	}

	public int search(T el) {
		Node temp = start;
		int counter = 1;
		while (temp != null) {
			if (temp.value.equals(el)) {
				return counter;
			} else {
				counter++;
				temp = temp.getNext();
			}
		}
		return -1;
	}

	private class Node {
		private T value;
		private Node next;

		public Node(T col) {
			this.value = col;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public String toString() {

			return value + "";

		}
	}

	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>();
		for (int i = 1; i < 11; i++) {
			stack.push(i);
		}
		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.search(1));
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(150);
		stack.add(list);
		System.out.println(list);
		System.out.println(stack);
	}
}

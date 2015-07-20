package ba.bitcamp.GenericClasses;

import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList<T> {

	private Node start;

	public MyLinkedList() {
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

	public void add(T col) {
		if (start == null) {
			start = new Node(col);
		} else {
			Node temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(new Node(col));
		}

	}

	public void add(Collection<T> col) {
		Iterator<T> it = col.iterator();
		while (it.hasNext()) {
			this.add(it.next());
		}
	}

	public void clone(T col) {
		Node temp = start;
		Node newNode = new Node(col);
		while (temp.getNext() != null) {
			if (temp.value.equals(col)) {
				newNode.setNext(temp.getNext());
				temp.setNext(newNode);
				break;
			} else {
				temp = temp.getNext();
			}
		}
	}

	public void remove(T col) {
		Node temp = start;
		while (temp.getNext() != null) {
			if (temp.next.value.equals(col)) {
				temp.setNext(temp.getNext().getNext());
				break;
			} else {
				temp = temp.getNext();
			}
		}
	}

	public boolean contains(T col) {
		Node temp = start;
		while (temp != null) {
			if (temp.value.equals(col)) {
				return true;
			} else {
				temp = temp.getNext();
			}
		}
		return false;
	}

	public int size() {
		Node temp = start;
		int counter = 0;
		while (temp != null) {

			counter++;
			temp = temp.getNext();
		}
		return counter;
	}

	public Integer indexOf(T col) {
		Node temp = start;
		for (int i = 0; i < size(); i++) {
			if (temp.value.equals(col)) {
				return i;
			} else {
				temp = temp.getNext();
			}
		}
		return null;
	}

	public T get(int index) {
		Node temp = start;
		for (int i = 0; i < size(); i++) {
			if (i == index) {
				return temp.value;
			} else {
				temp = temp.getNext();
			}
		}
		return null;
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
		MyLinkedList<String> list = new MyLinkedList<String>();

		list.add("Baba");
		list.add("Deda");

		System.out.println(list);
		list.clone("Baba");
		System.out.println(list);
		list.remove("Baba");
		System.out.println(list);
		System.out.println(list.contains("Deda"));

		System.out.println(list.size());

		System.out.println(list.indexOf("Deda"));

		System.out.println(list.get(1));

	}
}

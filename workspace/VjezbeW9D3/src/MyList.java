import java.util.Collection;
import java.util.Iterator;

public class MyList implements Collection<MyList> {

	private Node start;

	public MyList() {
		this.start = null;
	}

	@Override
	public int size() {
		int counter = 0;
		Node temp = start;
		while (temp != null) {
			counter++;
			temp = temp.next;
		}
		return counter;
	}

	public void add(Object o) {
		if (start == null) {
			start = new Node(o);
		} else {
			Node last = getLastNode();

			last.next = new Node(o);
		}
	}

	@Override
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean contains(Object o) {
		Node temp = start;
		while (temp != null) {
			if (temp.value.equals(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		Object[] array = new Object[size()];
		Node temp = start;
		for (int i = 0; i < array.length; i++) {
			array[i] = temp.value;
			temp = temp.next;
		}
		return array;
	}

	@Override
	public void clear() {
		this.start = null;
	}

	@Override
	public boolean add(MyList e) {
		if (start == null) {
			start = e.start;
		}
		Node last = getLastNode();
		last.next = e.start;
		return true;
	}

	private Node getLastNode() {
		if (start == null) {
			return null;
		}

		Node temp = start;
		while (temp.next != null) {
			temp = temp.next;
		}

		return temp;
	}

	@Override
	public boolean remove(Object o) {
		Node temp = start;
		int counter = 0;
		while (temp.next != null) {
			counter++;
			temp = temp.next;
			if (temp.value.equals(o)) {
				remove(counter);
				return true;
			}
		}
		return false;
	}

	public void remove(int index) {
		Node temp = start;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}

		Node previous = getPreviousNode(temp);

		previous.next = temp.next;
	}

	public Node getPreviousNode(Node n) {
		if (n == start) {
			return null;
		}

		Node temp = start;
		while (temp.next != n) {
			temp = temp.next;
		}

		return temp;
	}

	@Override
	public String toString() {
		return start.toString();
	}

	// UNUSED METHODS
	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection<? extends MyList> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Iterator<MyList> iterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}

	// PRIVATE CLASS NODE
	private class Node {
		Object value;
		Node next;

		public Node(Object value) {
			this.value = value;
		}

		public String toString() {
			if (next == null) {
				return value + "";
			}
			return value + " " + next.toString();
		}

	}

	public static void main(String[] args) {

		MyList list = new MyList();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		System.out.println(list.toString());
		list.remove(15);
		System.out.println(list.toString());
	}
}

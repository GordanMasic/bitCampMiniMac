public class NumberLinkedList {

	private Node start;

	public NumberLinkedList() {
		this.start = null;
	}

	public void add(int number) {
		if (start == null) {
			start = new Node(number);
		} else {
			Node last = getLastNode();
			last.setNext(new Node(number));
		}
	}

	public Node getLastNode() {
		Node temp = start;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		return temp;
	}

	public void remove(int index) {

		if (index == 0) {
			start = start.getNext();
		} else {
			Node temp = start;

			for (int i = 0; i < index; i++) {
				temp = temp.getNext();
			}

			Node previous = getPreviousNode(temp);

			previous.setNext(temp.getNext());
		}
	}
	
	public int removeFront(){
		if(start == null){
			throw new ArrayIndexOutOfBoundsException();
		}else{
			Node temp = start;
			start = start.getNext();
			return temp.getNumber();
		}
	}

	public void addFront(int number) {
		if (start == null) {
			start = new Node(number);
		}
		Node first = new Node(number);
		first.setNext(start.getNext());
		start = first;
	}

	public void removeLast() {
		Node temp = start;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		Node previous = getPreviousNode(temp);
		previous.setNext(null);
	}

	public Node getPreviousNode(Node n) {
		if (n == start) {
			return null;
		}

		Node temp = start;
		while (temp.getNext() != n) {
			temp = temp.getNext();
		}

		return temp;
	}

	@Override
	public String toString() {
		return String.format("%s", start);
	}

	private class Node {
		private int number;
		private Node next;

		public Node(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}

		public Node getNext() {
			return next;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return String.format("%s, %s", number, next);
		}

	}

	public static void main(String[] args) {

		NumberLinkedList list = new NumberLinkedList();

		list.add(1);
		list.addFront(0);
		list.add(2);

		System.out.println(list.toString());

		list.remove(0);

		System.out.println();
		System.out.println(list.toString());
		list.add(0);
		System.out.println();
		System.out.println(list.toString());
		list.removeLast();
		System.out.println();
		System.out.println(list.toString());
	}
}

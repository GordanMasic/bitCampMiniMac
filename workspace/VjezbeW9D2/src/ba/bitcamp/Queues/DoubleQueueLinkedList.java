package ba.bitcamp.Queues;

public class DoubleQueueLinkedList {

	private Node start;
	
	public DoubleQueueLinkedList() {
		this.start = null;
	}
	
	
	

	private class Node {

		Double number;
		Node next;

		public Node(Double number) {
			this.number = number;
		}

		public String toString() {
			if (next == null) {
				return number + "";
			}
			return number + " " + next.toString();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

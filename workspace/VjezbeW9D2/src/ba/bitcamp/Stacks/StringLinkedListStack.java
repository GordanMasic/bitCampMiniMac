package ba.bitcamp.Stacks;

import java.util.EmptyStackException;

public class StringLinkedListStack {

	private Node start;

	public StringLinkedListStack() {
		this.start = null;
	}

	public String push(String word) {
		if (start == null) {
			start = new Node(word);
		} else {
			Node temp = new Node(word);
			temp.next = start;
			start = temp;
		}
		return word;
	}

	public String pop() {
		if (start == null) {
			return null;
		} else {

			String s = start.word;
			start = start.next;
			return s;
		}
	}

	public boolean isEmpty() {
		return start == null;
	}

	public String peek() {
		if (start == null) {
			return null;
		} else {
			
			return start.word;
		}
	}
	
	public int search(String word){
		if(start == null){
			throw new EmptyStackException();
		}else{
			Node temp = start;
			int index = 0;
			while(temp.next != null){
				index++;
				if(temp.word.equals(word)){
					return index;
				}
				temp = temp.next;
			}
			return -1;
		}
	}

	public String toString() {
		return start.toString();
	}

	private class Node {

		String word;
		Node next;
		

		public Node(String word) {
			this.word = word;
		}

		public String toString() {
			if (next == null) {
				return word;
			}
			return word + " " + next.toString();
		}

	}

	public static void main(String[] args) {

		StringLinkedListStack stack = new StringLinkedListStack();

		System.out.println(stack.isEmpty());
		
		double startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			stack.push("" + i);
		}
		double endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time: " +(endTime - startTime));
		// System.out.println(stack.isEmpty());
		// System.out.println(stack.search("2"));
		// System.out.println(stack);
		 System.out.println(stack.pop());
		 System.out.println(stack);
		// System.out.println(stack.peek());
	}
}

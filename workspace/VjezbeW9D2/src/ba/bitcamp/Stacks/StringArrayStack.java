package ba.bitcamp.Stacks;

import java.util.Arrays;

public class StringArrayStack {

	private String[] array;

	public StringArrayStack() {
		this.array = new String[0];
	}

	public String push(String s) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = s;
		return s;

	}

	public String pop() {
		String s = array[array.length - 1];
		array = Arrays.copyOf(array, array.length - 1);
		return s;
	}

	public String peek() {
		return array[array.length - 1];
	}

	public int search(String s) {
		for (int i = 0; i < array.length; i++) {
			if (s.equals(array[i])) {
				return array.length - i;
			}
		}
		return -1;
	}

	public boolean isEmpty() {
		return array.length == 0;
	}

	public String toString() {
		return Arrays.toString(array);
	}

	public static void main(String[] args) {

		StringArrayStack stack = new StringArrayStack();

		System.out.println(stack.isEmpty());
		double startTime = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			stack.push("" + i);
		}
		double endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("Time: " + (endTime - startTime));
		System.out.println();
		System.out.println(stack.isEmpty());
		System.out.println(stack);

		System.out.println(stack.search("9"));
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);

	}

}

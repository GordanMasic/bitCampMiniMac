package ba.bitcamp.Queues;

import java.util.Arrays;

public class DoubleQueueArray {

	private double[] array;

	public DoubleQueueArray() {
		this.array = new double[0];
	}

	public double push(double s) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = s;
		return s;

	}

	public double pop() {
		double s = array[0];
		array = Arrays.copyOf(Arrays.copyOfRange(array, 1, array.length),
				array.length - 1);
		return s;
	}

	public double peek() {
		return array[0];
	}

	public int search(double s) {
		for (int i = 0; i < array.length; i++) {
			if (s == array[i]) {
				return i;
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

		DoubleQueueArray que = new DoubleQueueArray();

		for (int i = 0; i < 10; i++) {
			que.push(i);
		}

		System.out.println(que);
		System.out.println(que.pop());
		System.out.println(que);
	}
}

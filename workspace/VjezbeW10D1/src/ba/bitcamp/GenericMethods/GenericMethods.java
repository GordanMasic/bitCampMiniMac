package ba.bitcamp.GenericMethods;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JButton;

public class GenericMethods {

	public static <T> void printAll(Collection<T> col) {
		System.out.println(col);
	}

	public static <T> int countOccurences(Collection<T> col, T element) {
		int counter = 0;
		for (T el : col) {
			if (el.equals(element)) {
				counter++;
			}
		}
		return counter;
	}

	public static <T extends Component> void printComponentInfo(T comp) {
		System.out.printf("Width: %d\nHeight: %d\nX: %d\nY: %d\n",
				comp.getWidth(), comp.getHeight(), comp.getX(), comp.getY());
	}

	public static <T> String printType(Collection<T> col) {
		return col.getClass().getName();
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(2);

		ArrayList<Integer> listArray = new ArrayList<Integer>();
		JButton button = new JButton();
		printAll(list);
		System.out.println();
		System.out.println(countOccurences(list, null));
		System.out.println();
		printComponentInfo(button);
		System.out.println();
		System.out.println(printType(listArray));

	}
}

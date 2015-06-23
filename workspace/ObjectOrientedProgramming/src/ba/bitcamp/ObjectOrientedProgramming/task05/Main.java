package ba.bitcamp.ObjectOrientedProgramming.task05;
import java.util.Arrays;

import ba.bitcamp.ObjectOrientedProgramming.task01.Computer;
import ba.bitcamp.ObjectOrientedProgramming.task02.Network;
import ba.bitcamp.ObjectOrientedProgramming.task03.Server;
import ba.bitcamp.ObjectOrientedProgramming.task04.Client;
import ba.bitcamp.ObjectOrientedProgramming.task07.ArrayManipulation;


public class Main {

	public static void main(String[] args) {

		
		char[] array1 = new char[]{'1','2','3','4','5','6','7','8','9','a','b','c'};
		char[] array2 = new char[]{'1','2','3','4','5','6','7','8','9','d','e','f'};
				
		Client cl1 = new Client("PC1", array1);
		Client cl2 = new Client("PC2", array2);

		//System.out.println(cl1.getMacAddress());
		
		Server s1 = new Server("PC1", array1, 3);
		
//		cl2.connect(s1);
		
		//System.out.println(cl2);
		
		Computer[] computers = new Computer[2];
		computers[0] = cl1;
		computers[1] = cl2;
		
		computers = ArrayManipulation.extendArray(computers);
		computers = ArrayManipulation.extendArray(computers);
		computers = ArrayManipulation.shrinkArray(computers,2);
		computers = ArrayManipulation.shrinkArray(computers,2);
		System.out.println(Arrays.toString(computers));
	}

}

import java.util.Arrays;


public class TwoArraysInOne {

	public static void main(String[] args) {
		
		
		int[] array1 = new int[]{1,2,1,2,1,2};
		int[] array2 = new int[]{1,2,3,4,5,6,7,8};
		int[] array = new int[array1.length+array2.length];
		int counter = 0;
		for (int i = 0; i < array1.length;i++){
			array[i] = array1[i];
			counter++;
		}
		System.out.println(counter);
		System.out.println("Array ="+Arrays.toString(array));
		for(int i = 0;i<array2.length;i++){
			array[counter+i] = array2[i];
		}
		System.out.println("Array ="+Arrays.toString(array));
	}

}

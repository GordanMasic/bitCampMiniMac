import java.util.Arrays;
public class DoubleArray {

	public static void main(String[] args) {
		
		int length = (int)(Math.random()*100 + 1);
		int[] array1 = new int[length];
		int[] array2 = new int[2*length];
		
		for(int i = 0; i < length; i++){
			array1[i] = (int)(Math.random()*100 + 1);
			array2[i] = array1[i];
			
		}
		
		System.out.println("Array1 is " + Arrays.toString(array1));
		System.out.println("Array2 is " + Arrays.toString(array2));

	}
}
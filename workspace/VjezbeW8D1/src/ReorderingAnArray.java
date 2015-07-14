import java.util.Arrays;

public class ReorderingAnArray {

	public static void main(String[] args) {

		int[] array = { 0, 1, 2, 3, 101, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(reorderAnArray(array)));
	}

	public static int[] reorderAnArray(int[] array) {
		int[] temp = new int[array.length];
		int[] indexesEven = new int[array.length / 2];
		int[] indexesOdd = new int[array.length - array.length/2];
		
		int counter = 0;
		int counter1 = 0;
		int counter2 = 0;
		
		for(int i : array){
			if(counter %2 == 0){
				indexesEven[counter1] = i;
				counter1++;
			}else{
				indexesOdd[counter2] = i;
				counter2++;
			}
			counter++;
			
		}
		
		
		
//		for (int i = 0; i < array.length; i++) {
//			if(i % 2 == 0){
//				indexesEven[counter] = i;
//				counter++;
//			}else{
//				indexesOdd[counter1] = i;
//				counter1++;
//			}
//		}
//
		counter = 0;
		for(int i1 : indexesEven){
			temp[counter++] = i1;
			
		}
		for(int i1 : indexesOdd){
			temp[counter++] = i1;
			
		}
		
		
		
		
		return temp;
	}

}

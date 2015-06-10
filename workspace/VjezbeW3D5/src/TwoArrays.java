import java.util.Arrays;


public class TwoArrays {

	public static int[] getArray(int n,int m){
		int[] array = new int[10];
		try{
			if (n < 0 || n >= array.length){
				throw new IndexOutOfBoundsException();
			}else{
			
			for (int i = n; i< 10; i++){
				array[i]=m;
			}
			}
			
		}catch(IndexOutOfBoundsException ex){
			System.out.println("IndexOutOfBoundsException");
		}
		return array;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray(4, 1)));

	}

}

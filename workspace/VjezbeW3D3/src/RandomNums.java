public class RandomNums {

	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++){
			
			array[i] = (int)(Math.random()*10 + 1);
			
		}
		
		for (int value:array){
			System.out.println(value);
		}
	}
}

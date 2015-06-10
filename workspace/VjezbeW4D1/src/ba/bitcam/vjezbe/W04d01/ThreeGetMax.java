package ba.bitcam.vjezbe.W04d01;

public class ThreeGetMax {

	
	public static void main(String[] args) {
		
		
		getMax(args);

	}
	public static double getMax(double num1, double num2){
		double max = 0;
		if(num1 < num2){
			max = num2; 
		}else{
			max = num1;
		}
		return max;
	}
	
	public static int getMax(int[] array){
		int max = 0;
		for(int i = 0; i< array.length;i++){
			if(max<array[i]){
				max = array[i];
			}
		}
		return max;
	}
	
	public static void getMax(String[] array){
		double max = 0;
		double[]	array1 = new double[array.length];
		 
		for(int i = 0; i< array.length;i++){
			array1[i]= Double.parseDouble(array[i]);
			if(max<array1[i]){
				max = array1[i];
			}
		}
		System.out.println(max);
	}
}

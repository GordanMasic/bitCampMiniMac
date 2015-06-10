import java.util.Scanner;
import java.util.Arrays;


public class Arrays1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Unesi max broj elemenata: ");
		int maxBroj = in.nextInt();
		maxBroj=Math.max(maxBroj, 5);
		
		
		int[] petBrojeva = new int[maxBroj];
		int i = 0;
		while (true) {
			
			
			System.out.printf("Unesite %d broj, broj -1 za prestanak: ", i + 1);
			int broj = in.nextInt();
			if (broj > 0) {
				petBrojeva[i] = broj;
				i++;
				if (i == petBrojeva.length) {
					i = 0;}
				
			} else {
					break;
				}
		}
		System.out.println(Arrays.toString(petBrojeva));
		int max = 0;
		  for (int u = 0; u < petBrojeva.length;u++){
		  	   
		  	   for(int k = 0; k< petBrojeva.length;k++){ 
			   int elementNiza;
			   elementNiza = petBrojeva[i]; 
			   	if(elementNiza > max){ 
			   		max = elementNiza; 
			   		} 
		  }  
		  }System.out.print("Najveci broj je: "+max);
		  in.close();
	}
}

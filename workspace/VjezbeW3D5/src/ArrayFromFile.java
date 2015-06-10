import java.util.Arrays;


public class ArrayFromFile {

	public static int[] getArray3(String fileName){
		try{
			TextIO.readFile("src/"+fileName);
		
		int counter = 0;
		while (!TextIO.eof()){
			TextIO.getln();
			 counter++;
			 }
		
		TextIO.readStandardInput();
		TextIO.readFile("src/"+fileName);
		int i = 0;
		int[] array = new int[counter];
		int c =0;
		
		while(!TextIO.eof()){
			if (i<counter){
			c = Integer.parseInt(TextIO.getln());
			array[i]=c;
			i++;
			}
		}TextIO.readStandardInput();
		return array;
		}catch(IllegalArgumentException ex){
			System.out.println("IllegalArgumentException!");
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getArray3("File.in")));

	}

}

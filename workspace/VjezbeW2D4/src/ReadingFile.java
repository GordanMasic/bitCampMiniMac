
public class ReadingFile {

	public static void main(String[] args) {
		
		TextIO.readFile("src/text.txt");
		
		int a = TextIO.getInt();
		int b = TextIO.getInt();
		
		TextIO.writeFile("src/text2.txt");
		TextIO.put(a+b);
		TextIO.writeStandardOutput();
	}

}

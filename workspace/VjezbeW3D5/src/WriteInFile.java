
public class WriteInFile {

	public static void writeToFile(String fileName,String sentence){
		TextIO.writeFile("src/"+fileName+"");
		TextIO.putln(sentence);
		TextIO.writeStandardOutput();
	}
	public static void main(String[] args) {
		writeToFile("text.txt", "BitCamp <3");
	}
}

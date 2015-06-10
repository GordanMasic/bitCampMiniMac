
public class TablicaMnozenja {

	public static void main(String[] args) {
		
		TextIO.writeFile("Tablica mnozenja.txt");
		for (int i = -1; i < 10; i++){
			for (int j = -1; j < 10; j++){
				if (i ==  -1 && j == -1){
					TextIO.putf("x ");
				}else if(j > 0 && i == -1){
					TextIO.putf("%2d", j);
					
				} if (i > 0 && j == -1){
					TextIO.putf("%d ",i);
				}else if (i > 0 && j > 0){
					TextIO.putf("%2d", i*j);
				}if (i == 0 && j == 0){
					TextIO.putf("+");
				}if ( i == 0 && j<0 || i == 0 && j > 0 ){
					TextIO.putf("-");
				}if (j == 0 && i < 0 || j==0 && i>0){
					TextIO.put("|");
				}
					
				
			}TextIO.putln();
		}
		TextIO.writeStandardOutput();
	}

}

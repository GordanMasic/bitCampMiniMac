package ba.bitcamp.task02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Poker {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		JFileChooser open = new JFileChooser();
		
		int action = open.showOpenDialog(null);
		
		if (action == JFileChooser.APPROVE_OPTION) {
			
			File poker = open.getSelectedFile();
			Scanner in = null;
			try {
				in = new Scanner(poker);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int counter0 = 0;
			int counter1 = 0;
			int counter2 = 0;
			int counter3 = 0;
			int counter4 = 0;
			int counter5 = 0;
			int counter6 = 0;
			int counter7 = 0;
			int counter8 = 0;
			int counter9 = 0;
			while(in.hasNextLine()){
			String line = in.nextLine();
			StringTokenizer st = new StringTokenizer(line, ",");
			for (int i = 0; i < 10; i++) {
				st.nextToken();
			}
			String number = st.nextToken();
			
			if(Integer.parseInt(number) == 0){
				counter0++;
			}
			if(Integer.parseInt(number) == 1){
				counter1++;
			}
			if(Integer.parseInt(number) == 2){
				counter2++;
			}
			if(Integer.parseInt(number) == 3){
				counter3++;
			}
			if(Integer.parseInt(number) == 4){
				counter4++;
			}
			if(Integer.parseInt(number) == 5){
				counter5++;
			}
			if(Integer.parseInt(number) == 6){
				counter6++;
			}
			if(Integer.parseInt(number) == 7){
				counter7++;
			}
			if(Integer.parseInt(number) == 8){
				counter8++;
			}if(Integer.parseInt(number) == 9){
				counter9++;
			}
			}
			System.out.println("Nothing in hand "+counter0);
			System.out.println("One pair "+counter1);
			System.out.println("Two pairs "+counter2);
			System.out.println("Three of a kind "+counter3);
			System.out.println("Straight "+counter4);
			System.out.println("Flush "+counter5);
			System.out.println("Full house "+counter6);
			System.out.println("Poker "+counter7);
			System.out.println("Straight flush "+counter8);
			System.out.println("Royal flush "+counter9);
		} 
	}
}

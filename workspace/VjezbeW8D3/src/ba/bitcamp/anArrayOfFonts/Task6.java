package ba.bitcamp.anArrayOfFonts;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task6 extends JFrame{

	
	private static final long serialVersionUID = 6234736796571973765L;
	
	private Font[] fonts = new Font[40];
	private JLabel[] label = new JLabel[40];
	public Task6(){
		
		setLayout(new GridLayout(5, 8));
		
		
		for (int i = 0; i < fonts.length; i++) {
			fonts[i] = new Font("Serif", Font.PLAIN, i+1);
			label[i] = new JLabel();
			label[i].setFont(fonts[i]);
			label[i].setText("A");
			add(label[i]);
		}
		
		
		setTitle("An array of Fonts");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Task6();
	}
}

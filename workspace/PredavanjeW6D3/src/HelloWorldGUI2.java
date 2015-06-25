	import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class HelloWorldGUI2 {

	private static class HelloWorldDisplay extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString("TIC TAC TOE", 20, 30);
		}
	}
	
	private static class ButtonHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
		}
	}
	private static class ButtonHandler2 implements ActionListener{
	
		Button button;
		static int counter = 1;
		
		public ButtonHandler2(Button okButton){
			super();
			this.button = okButton;
		}
		public void actionPerformed(ActionEvent e) {
			do{
				counter++;
			if(counter % 2 == 0){
			button.setLabel("O");
			}else {
				button.setLabel("X");
			}break;
			}while(counter < 10);
		}
	}
	
	
	public static void main(String[] args) {
		HelloWorldDisplay displayPanel = new HelloWorldDisplay();
		Button Button1 = new Button("");
		Button Button2 = new Button("");
		Button Button3 = new Button("");
		Button Button4 = new Button("");
		Button Button5 = new Button("");
		Button Button6 = new Button("");
		Button Button7 = new Button("");
		Button Button8 = new Button("");
		Button Button9 = new Button("");
		
		
		
		
		Button1.addActionListener(new ButtonHandler2(Button1));
		Button2.addActionListener(new ButtonHandler2(Button2));
		Button3.addActionListener(new ButtonHandler2(Button3));
		Button4.addActionListener(new ButtonHandler2(Button4));
		Button5.addActionListener(new ButtonHandler2(Button5));
		Button6.addActionListener(new ButtonHandler2(Button6));
		Button7.addActionListener(new ButtonHandler2(Button7));
		Button8.addActionListener(new ButtonHandler2(Button8));
		Button9.addActionListener(new ButtonHandler2(Button9));

		JPanel content = new JPanel();
		content.setLayout(new GridLayout(3,3));
		content.add(Button1);
		content.add(Button2);
		content.add(Button3);
		content.add(Button4);
		content.add(Button5);
		content.add(Button6);
		content.add(Button7);
		content.add(Button8);
		content.add(Button9);
		
		
		
		
		JFrame window = new JFrame("GUI Test");
		window.setContentPane(content);
		window.setSize(250, 100);
		window.setLocation(100, 100);
		window.setVisible(true);
	
	}
}

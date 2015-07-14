import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;


public class Main {

	public static void main(String[] args) {
		
		JFrame window = new JFrame("Layouts");
		JPanel container = new JPanel();
		
		container.setLayout(new FlowLayout(FlowLayout.LEADING,0,0));
		
		//container.setLayout(new BorderLayout(20,30));
		//container.setLayout(new GridLayout(2,3));
		
//		try {
//			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//		} catch (ClassNotFoundException | InstantiationException
//				| IllegalAccessException | UnsupportedLookAndFeelException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		JButton[] buttons = new JButton[5];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Button "+i);
			buttons[i].setForeground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			buttons[i].setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
			buttons[i].setOpaque(true);
//			buttons[i].setBorder(BorderFactory.createEmptyBorder());
//			buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK,5, true));
//			buttons[i].setBorder(BorderFactory.createMatteBorder(5, 5, 10, 10, Color.BLACK));
			
//			buttons[i].setBorder(BorderFactory.createEtchedBorder());
			if(i%2 == 0){
				buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
			}else{
				buttons[i].setBorder(BorderFactory.createLoweredBevelBorder());
			}
			
			buttons[i].setPreferredSize(new Dimension(100,25));
			container.add(buttons[i]);
		}
		
//		container.add(buttons[0], BorderLayout.EAST);
//		container.add(buttons[1], BorderLayout.WEST);
//		container.add(buttons[2], BorderLayout.NORTH);
//		container.add(buttons[3], BorderLayout.SOUTH);
//		container.add(buttons[4], BorderLayout.CENTER);
//		
		
		window.add(container);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 400);
		window.setVisible(true);

	}

}

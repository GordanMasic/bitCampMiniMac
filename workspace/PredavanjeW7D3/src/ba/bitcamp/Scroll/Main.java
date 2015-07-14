package ba.bitcamp.Scroll;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		int fullWidth = 400;
		int fullHeight = 600;

		JFrame window = new JFrame();

		JPanel panel = new ColorPicker(fullWidth, fullHeight);
		
		window.add(panel);
		window.setTitle("Window");
		window.setSize(fullWidth, fullHeight);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}

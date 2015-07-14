package ba.bitcamp.trueColorPicker;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class UseColorPicker {

	public static void main(String[] args) {
		int fullWidth = 800;
		int fullHeight = 500;

		JFrame window = new JFrame();
		
		JPanel panel = new ColorPickerProffessional(fullWidth, fullHeight);
		
		window.add(panel);
		window.setTitle("Window");
		window.setSize(fullWidth, fullHeight);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}

import java.awt.BorderLayout;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Frame1 extends JFrame {

	private static final long serialVersionUID = -841653923868977200L;

	public Frame1() {

		setLayout(new GridLayout(1, 2));

		/*
		 * Panel 1
		 */
		JPanel panel1 = new JPanel();
		panel1.setName("Panel1");
		panel1.setLayout(new BorderLayout());
		panel1.setBorder(BorderFactory.createTitledBorder("Panel 1"));

		/*
		 * Panel1 components
		 */
		JLabel label1 = new JLabel("Label 1");
		JLabel label2 = new JLabel("Label 2");
		JTextArea textArea = new JTextArea("Text Area", 10, 10);

		panel1.add(label2, BorderLayout.NORTH);
		panel1.add(textArea, BorderLayout.CENTER);
		panel1.add(label1, BorderLayout.SOUTH);

		/*
		 * Panel2
		 */
		JPanel panel2 = new JPanel();
		panel2.setName("Panel2");
		panel2.setLayout(new GridLayout(3, 3));
		panel2.setBorder(BorderFactory.createTitledBorder("Panel 2"));

		try {
			UIManager.setLookAndFeel(UIManager
					.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * Panel2 components
		 */
		JButton[] buttons = new JButton[9];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Button" + (i + 1));

			buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
			panel2.add(buttons[i]);
		}

		add(panel1);
		add(panel2);
		
		setTitle("Frame 1");
		setResizable(false);
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Frame1();
	}

}

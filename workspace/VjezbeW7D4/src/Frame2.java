import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Frame2 extends JFrame {

	private static final long serialVersionUID = -7179311755082121827L;

	public Frame2() {
		setLayout(new BorderLayout());

		/*
		 * Panel1
		 */
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(1, 2));
		centerPanel.setBorder(BorderFactory.createTitledBorder("Center panel"));

		/*
		 * Panel1 components
		 */

		// Right panel
		JPanel centerPanelRight = new JPanel();
		centerPanelRight.setLayout(new GridLayout(4, 1));

		try {
			UIManager.setLookAndFeel(UIManager
					.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JButton[] buttons = new JButton[4];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Button" + (i + 1));

			buttons[i].setBorder(BorderFactory.createRaisedBevelBorder());
			centerPanelRight.add(buttons[i]);
		}

		// Left panel
		JPanel centerPanelLeft = new JPanel();
		centerPanelLeft.setLayout(new GridLayout(4, 1));

		JLabel[] labels = new JLabel[4];

		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel("Label" + (i + 1));

			centerPanelLeft.add(labels[i]);
		}

		centerPanel.add(centerPanelLeft);
		centerPanel.add(centerPanelRight);

		/*
		 * Panel2
		 */
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		southPanel.setBorder(BorderFactory.createTitledBorder("South panel"));

		/*
		 * Panel2 components
		 */
		JLabel label1 = new JLabel("Label1");
		JButton buttonSouth = new JButton("Button1");

		southPanel.add(label1);
		southPanel.add(buttonSouth);

		add(centerPanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		
		setTitle("Frame2");
		setResizable(false);
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Frame2();

	}

}

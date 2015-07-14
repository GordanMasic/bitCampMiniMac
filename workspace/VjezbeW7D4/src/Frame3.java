import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Frame3 extends JFrame{

	public Frame3(){
		setLayout(new BorderLayout());
		
		JPanel panelCenter = new JPanel();
		JPanel panelEast = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JTextArea textArea = new JTextArea("Text Area");
		panelCenter.setLayout(new BorderLayout());
		panelCenter.setBorder(BorderFactory.createTitledBorder("Center panel"));
		panelCenter.add(textArea, BorderLayout.CENTER);
		
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		panel2.add(button1);
		panel2.add(button2);
		panel2.setBorder(BorderFactory.createTitledBorder("Panel 2"));
		
		panel1.setLayout(new GridLayout(3, 1));

		JLabel[] labels = new JLabel[4];

		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel("Label" + (i + 1));

			panel1.add(labels[i]);
		}
		panel1.setBorder(BorderFactory.createTitledBorder("Panel 1"));
		
		panelEast.setLayout(new GridLayout(2, 1));
		panelEast.setBorder(BorderFactory.createTitledBorder("East panel"));
		panelEast.add(panel1);
		panelEast.add(panel2);
		
		add(panelCenter,BorderLayout.CENTER);
		add(panelEast, BorderLayout.EAST);
		
		setTitle("Frame3");
		setResizable(false);
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private static final long serialVersionUID = 6303804856151097112L;

	public static void main(String[] args) {
		new Frame3();

	}

}

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		int fullWidth = 400;
		int fullHeight = 600;

		JFrame window = new JFrame();

		JPanel panel = new JPanel();

		// labels
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setForeground(Color.BLUE);
		nameLabel.setFont(new Font("Serif", Font.ITALIC, 15));
		JLabel emailLabel = new JLabel("Email");

		// textfields
		JTextField nameField = new JTextField(30);
		JTextField emailField = new JTextField(30);

		// textarea
		JTextArea terms = new JTextArea(10, 25);
		terms.setText("TERMS OF USE: \n\nBla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla");
		terms.setLineWrap(true);

		// button
		JButton submit = new JButton("Submit");
//		submit.setEnabled(true);
	
		// checkbox
		JCheckBox checkTerms = new JCheckBox(
				"I accept the terms and conditions");
		
		
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkTerms.isSelected()){
				String name = nameField.getText();
				String email = emailField.getText();

				JOptionPane.showMessageDialog(null, "Name: " + name
						+ " email: " + email);
				}else{
					JOptionPane error = new JOptionPane("You must accept terms", JOptionPane.ERROR_MESSAGE);
					error.createDialog(window, "Ha Ha!").setVisible(true);
					nameField.setText("");
					emailField.setText("");
					
				}
				

			}
		});
		

		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(emailLabel);
		panel.add(emailField);
		panel.add(terms);
		panel.add(checkTerms);
		panel.add(submit);
		window.add(panel);

		window.setTitle("Window");
		window.setSize(fullWidth, fullHeight);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}

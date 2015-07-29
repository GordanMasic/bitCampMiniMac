package ba.bitcamp.Task2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Chat extends JFrame {

	private JPanel panel = new JPanel();
	private JTextArea textArea = new JTextArea();
	private JButton send = new JButton("SEND");

	public Chat() {
		add(panel);
		panel.setLayout(new BorderLayout());
		panel.add(textArea, BorderLayout.CENTER);
		textArea.setLineWrap(true);
		panel.add(send, BorderLayout.SOUTH);
		send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Socket socket = new Socket("10.0.82.98", 7777);
					BufferedWriter br = new BufferedWriter(new OutputStreamWriter(
							socket.getOutputStream()));
					br.write(textArea.getText());
					br.newLine();
					br.flush();

				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		

		setSize(200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(true);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Chat();
	}
}

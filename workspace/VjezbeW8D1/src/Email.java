import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Email extends JFrame{
	
	
	private static final long serialVersionUID = 1L;

	private String[] occupiedEmails = {"ajla.mulic.el_tabari@gmail.com","kristina.pupavac@bitcamp.ba","narena.ibrisimovic@yahoo.com"};
	
	private JTextField input = new JTextField();
	private JButton check = new JButton("Check");
	
	public Email(){
		setLayout(new BorderLayout());
		add(input,BorderLayout.CENTER);
		add(check,BorderLayout.SOUTH);
		
		check.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new MyDialog();
				
			}
		});
		
		
		setTitle("Task2 - Is e-mail available");
		setSize(300,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static boolean isOccupied(String s, String[] occupiedEmails){
		
			for (String email : occupiedEmails) {
				if(email.equals(s)){
					return true;
				}
			}
			return false;
	}

private class MyDialog extends JDialog{
		
	private static final long serialVersionUID = 1L;
		JLabel text = new JLabel();
		public MyDialog(){
			String s = input.getText();
			boolean ocup = isOccupied(s, occupiedEmails);
			if(ocup){
				text.setText("Already occupied mail!");
			}else{
				text.setText("Not occupied, you can use this mail");
			}
			add(text);
			setModalityType(ModalityType.APPLICATION_MODAL);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setTitle("Dialog1");
			setSize(300,100);
			setLocationRelativeTo(null);
			setVisible(true);
			
			
		}
		
	}
	public static void main(String[] args) {
		new Email();

	}

}

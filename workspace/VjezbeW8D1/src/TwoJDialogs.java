
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;


public class TwoJDialogs extends JFrame{
	
	private static final long serialVersionUID = -6752994802989468956L;
	
	private JButton button1 = new JButton("Button1");
	private JButton button2 = new JButton("Button2");
	
	
	public TwoJDialogs(){
		setLayout(new GridLayout(1, 2));
		add(button1);
		add(button2);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog1();
				
			}
		});
		
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog2();
				
			}
		});
		
		
		
		
		
		setTitle("Task1 - Two JDialogs");
		setSize(300,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	private class MyDialog1 extends JDialog{
		
		private static final long serialVersionUID = 1L;

		public MyDialog1(){
			
			setModalityType(ModalityType.APPLICATION_MODAL);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setTitle("Dialog1");
			setSize(300,100);
			setLocationRelativeTo(null);
			setVisible(true);
			
			
		}
		
	}
	
private class MyDialog2 extends JDialog{
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public MyDialog2(){
			
			setModalityType(ModalityType.MODELESS);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setTitle("Dialog1");
			setSize(300,100);
			setLocationRelativeTo(null);
			setVisible(true);
			
			
		}
		
	}
	
	public static void main(String[] args) {
		new TwoJDialogs();

	}

}

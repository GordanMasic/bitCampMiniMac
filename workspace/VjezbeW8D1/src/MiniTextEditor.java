

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MiniTextEditor extends JFrame{
	
	private static final long serialVersionUID = 7913874619316330885L;
	
	private JMenuBar bar = new JMenuBar();
	JMenu insert = new JMenu("Insert");
	JMenuItem text = new JMenuItem("New text");
	JTextArea area = new JTextArea();
	
	public MiniTextEditor(){
//		setLayout(new BorderLayout());
		insert.add(text);
		bar.add(insert);
		setJMenuBar(bar);
		add(area);
		
		text.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyDialog();
				
			}
		});
		
		setSize(500,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	private class MyDialog extends JDialog{
		
		private static final long serialVersionUID = 1L;
			
		private JTextField field1 = new JTextField();
		private JTextField field2 = new JTextField();
		private JButton button = new JButton("Insert");
			public MyDialog(){
				
				setLayout(new FlowLayout(FlowLayout.CENTER));
				
				field1.setPreferredSize(new Dimension(450, 20));
				field2.setPreferredSize(new Dimension(60, 20));
				button.setPreferredSize(new Dimension(50, 50));
				
				button.addActionListener(new ActionListener() {
					int index = 0;
					@Override
					public void actionPerformed(ActionEvent e) {
						String sub1 = "";
						if(field2.getText() == null){
							index = 0;
						}else{
						 index = Integer.parseInt(field2.getText());
						}
						 for (int i = 0; i < area.getText().length(); i++) {
							sub1 = area.getText().substring(0, index);
						}
						area.setText(sub1 + field1.getText() + area.getText().substring(index));
					}
				});
				
				add(field1);
				add(field2);
				add(button);
				
				setModalityType(ModalityType.APPLICATION_MODAL);
				setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				setTitle("Dialog1");
				setSize(500,100);
				setLocationRelativeTo(null);
				setVisible(true);
				
				
			}
			
		}
	public static void main(String[] args) {
		new MiniTextEditor();

	}

}

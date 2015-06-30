import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Time extends JFrame {

	private static final long serialVersionUID = -8459730516998441793L;

	private int sekunda =30 ;
	private int minuta = 43;
	private int sat = 13;
	Timer timer1 = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			sekunda++;
			if(sekunda == 60){
				sekunda = 0;
				minuta++;
				if(minuta == 60){
					minuta = 0;
					sat++;
					if(sat == 24){
						sat = 0;
					}
				}
			}
			repaint();
			
		}
	});
	JPanel panel = new MyPanel();

	public Time() {

		add(panel);

		timer1.start();
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = 992962242604660621L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.drawString(String.valueOf(sat + " : " +  minuta + " : "+ sekunda), 250, 250);

		}
	}

	public static void main(String[] args) {
		new Time();
	}
}

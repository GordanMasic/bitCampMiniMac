package ba.bitcamp.ReactionGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Main4 extends JFrame {

	private static final long serialVersionUID = -6052209260791188590L;

	private JLabel label = new JLabel("Wait for it");
	private Timer t1 = null;
	private boolean isGameOver = false;

	public Main4() {
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label);

		t1 = new Timer((int) (Math.random() * 5000 + 5000),
				new ActionListener() {
					int timeStart;
					int timeEnd = 0;
					int time;

					@Override
					public void actionPerformed(ActionEvent e) {
						label.setText("Press any Button");
						timeStart = (int) System.currentTimeMillis();
						addKeyListener(new KeyListener() {

							@Override
							public void keyTyped(KeyEvent e) {
								// TODO Auto-generated method stub

							}

							@Override
							public void keyReleased(KeyEvent e) {
								// TODO Auto-generated method stub

							}

							@Override
							public void keyPressed(KeyEvent e) {

								timeEnd = (int) System.currentTimeMillis();
								time = timeEnd - timeStart;
								label.setText("Needed time " + time + " ms");
								t1.stop();
								
							}
						});
					}
				});
		t1.start();

		setTitle("Animation focus");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Main4();

	}

}

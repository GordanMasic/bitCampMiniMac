import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class DrawPanel extends JPanel{

	private Color bc = Color.RED;
	private static final long serialVersionUID = -3463362970025315765L;

	public DrawPanel(int height, int width){
		setSize(width, height);
		JButton blue = new JButton("Blue");
		
		blue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				bc = Color.BLUE;
			}
		});
		
		add(blue);
		MouseHandler mh = new MouseHandler();
		addMouseListener(mh);		
	}
	private class MouseHandler implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			Graphics g = getGraphics();
			g.fillOval(e.getX(), e.getY(), 20, 20);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("Mouse pressed");			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("Mouse released");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Graphics g =  getGraphics();
			g.setColor(bc);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		
		setBackground(bc);
		g.fillOval(20, 20, 10, 10);
		
	}
	
	public void drawSquare(){
		Graphics g = super.getGraphics();
		g.setColor(Color.red);
		g.fillRect(50, 50, 100, 100);
	}
}

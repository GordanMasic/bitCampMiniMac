import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {

	private PointArray points;
	private Color activeColor;
	private int circleSize = 5;

	private static Color[] supportedColors = new Color[] { Color.RED,
			Color.BLACK, Color.BLUE, Color.ORANGE, Color.GREEN,Color.PINK };

	public PaintPanel(int width, int height) {
		super();

		points = new PointArray();
		setSize(width, height);
		
		MouseHandler mh = new MouseHandler();
		addMouseMotionListener(mh);
		
		setBackground(Color.WHITE);
		for (int i = 0; i < supportedColors.length; i++) {
			JButton color = new JButton("Pick");
			color.setName(Integer.toString(i));
			
			
			
			color.setForeground(supportedColors[i]);
			
			color.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					JButton clicked = (JButton)e.getSource();
					
					String name = clicked.getName();
					int index = Integer.parseInt(name);
					activeColor = supportedColors[index];
					
				}
			});
			add(color);
		}
		JButton b1 = new JButton("5");
		JButton b2 = new JButton("10");
		JButton b3 = new JButton("20");
		b1.addActionListener(new Action());
		b2.addActionListener(new Action());
		b3.addActionListener(new Action());
		add(b1);
		add(b2);
		add(b3);

	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		for (int i = 0; i < points.getLength(); i++) {
			Point p = points.elementAt(i);
			g.setColor(p.getColor());
			g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());
			
		}
	}
	
	
	private class MouseHandler implements MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			Point newPoint = new Point(e.getX(),e.getY(),circleSize,activeColor);
			
			if(e.isShiftDown() == true){
				newPoint.setColor(Color.WHITE);
			}
			
			points.addPoint(newPoint);
			repaint();
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	private class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JButton clicked = (JButton)e.getSource();
			
			String name = clicked.getText();
			circleSize = Integer.parseInt(name);
			
		}
		
	}
}

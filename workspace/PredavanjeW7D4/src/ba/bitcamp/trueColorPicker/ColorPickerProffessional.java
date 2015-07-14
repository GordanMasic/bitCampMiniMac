package ba.bitcamp.trueColorPicker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorPickerProffessional extends JPanel {

	private int red;
	private int green;
	private int blue;

	// Panels
	private JPanel buttonPanel = new JPanel();
	private JPanel previewPanel = new JPanel();
	private JPanel sliderPanel = new JPanel();

	// Buttons
	private JButton[] buttonsOnPanel1 = new JButton[12];
	private JButton previewButton = new JButton("Click me");

	//Colors
	Color[] colorsOnButtons = new Color[]{Color.BLACK,Color.BLUE,Color.CYAN,Color.GRAY,Color.GREEN,Color.MAGENTA,Color.ORANGE
			,Color.PINK,Color.RED,Color.YELLOW,Color.WHITE,Color.LIGHT_GRAY};
	
	public ColorPickerProffessional(int width, int height) {

		try {
			UIManager.setLookAndFeel(UIManager
					.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.setLayout(new GridLayout(1, 3));
		
		// Panel1
		buttonPanel
				.setPreferredSize(new Dimension(width / 3 - 10, height - 10));
		buttonPanel.setLayout(new GridLayout(10, 3));

		// Buttons
		for (int i = 0; i < buttonsOnPanel1.length; i++) {
			buttonsOnPanel1[i] = new JButton();
			buttonsOnPanel1[i].setBorder(BorderFactory
					.createRaisedBevelBorder());
			buttonsOnPanel1[i].setBackground(colorsOnButtons[i]);
			buttonPanel.add(buttonsOnPanel1[i]);
		}

		// Panel2
		previewPanel
				.setPreferredSize(new Dimension(width / 3 - 10, height - 10));
		

		initButton(width, height);
		previewPanel.add(previewButton);

		//Panel3
		sliderPanel
				.setPreferredSize(new Dimension(width / 3 - 10, height - 10));
		
		sliderPanel.setLayout(new GridLayout(1, 3));

		//Sliders
		

		JSlider redSlider = new JSlider(0, 255);
		initSlider(redSlider, "red");
		JSlider greenSlider = new JSlider(0, 255);
		initSlider(greenSlider, "green");
		JSlider blueSlider = new JSlider(0, 255);
		initSlider(blueSlider, "blue");

		

		
		sliderPanel.add(redSlider);

		
		sliderPanel.add(greenSlider);
		
		 
		sliderPanel.add(blueSlider);
		
		
		
		add(buttonPanel);
		add(previewPanel);
		add(sliderPanel);
		
		
		

	}

	private void initButton(int width, int height) {
		previewButton.setFont(new Font("Monospaced", Font.BOLD, 25));
		previewButton
				.setPreferredSize(new Dimension(width / 3 - 10, height-10));
		previewButton.setOpaque(true);
		previewButton.setBorderPainted(false);
		updateButton();
	}

	private void updateButton() {
		
		previewButton.setBackground(new Color(red, green, blue));
		previewButton.setForeground(new Color(255 - red, 255 - green,
				255 - green));

	}

	private void initSlider(JSlider slider, String name) {
		slider.setName(name);
		slider.setValue(0);
		slider.setMajorTickSpacing(50);
		slider.setPaintTicks(true);
		slider.setOrientation(JSlider.VERTICAL);
		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider changed = (JSlider) e.getSource();
				String name = changed.getName();
				switch (name) {
				case "red":
					red = changed.getValue();
					break;
				case "green":
					green = changed.getValue();
					break;
				case "blue":
					blue = changed.getValue();
					break;
				}
				updateButton();

			}
		});
	}
}

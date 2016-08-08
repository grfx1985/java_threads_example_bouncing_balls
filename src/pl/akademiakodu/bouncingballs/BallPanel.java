package pl.akademiakodu.bouncingballs;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class BallPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Ball> balls = new ArrayList<Ball>();

	public void add(Ball b) {
		balls.add(b);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D graphics = (Graphics2D) g;
		for (Ball b : balls) {
			graphics.fill(b.getShape());
		}
	}

}

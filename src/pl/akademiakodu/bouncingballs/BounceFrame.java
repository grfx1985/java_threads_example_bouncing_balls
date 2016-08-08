package pl.akademiakodu.bouncingballs;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BounceFrame extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 450;
	public static final int HEIGHT = 450;
	private BallPanel ballPanel;

	public BounceFrame() {
		super("Pileczki watki");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setLayout(new BorderLayout());

		JPanel buttonsPanel = new JPanel();
		add(buttonsPanel, BorderLayout.SOUTH);

		ballPanel = new BallPanel();
		add(ballPanel, BorderLayout.CENTER);

		// buttonsPanel.setVisible(true);
		// JButton button = new JButton("start");
		// button.addActionListener(this);
		// buttonsPanel.add(button);
		addButton(buttonsPanel, "start", this);

		// JButton button2 = new JButton("cancel");
		// button2.addActionListener(new CloseListener());
		// buttonsPanel.add(button2);

		addButton(buttonsPanel, "cancel", new CloseListener());

	}

	private void addButton(JPanel panel, String title, ActionListener listener) {
		JButton button = new JButton(title);
		panel.add(button);
		button.addActionListener(listener);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("test dziala");
		Ball ball = new Ball();
		ballPanel.add(ball);
		Runnable ballRunnable = new BallRunnable(ball, ballPanel);
		Thread t = new Thread(ballRunnable);
		t.start();
		
	}

}

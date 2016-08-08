package pl.akademiakodu.bouncingballs;

public class BallRunnable implements Runnable {

	BallPanel ballPanel;
	private Ball ball;

	public BallRunnable(Ball ball, BallPanel ballPanel) {
		this.ball = ball;
		this.ballPanel = ballPanel;
	}

	@Override
	public void run() {
		int max = 2000;
		for (int i = 1; i <= max; i++) {
			ball.move(ballPanel.getBounds());
			ballPanel.repaint(); // refactor //.paint(ballPanel.getGraphics());
			try {
				Thread.sleep(6);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}

	}

}

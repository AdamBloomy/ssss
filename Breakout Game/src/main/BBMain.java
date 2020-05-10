package main;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BBMain {

	public static final int WIDTH = 1920, HEIGHT = 1080;

	public static void main(String[] args) {

		JFrame theFrame = new JFrame("Breakout Game");

		GamePanel thePanel = new GamePanel();
		theFrame.setSize(WIDTH, HEIGHT);

		theFrame.setLocationRelativeTo(null);
		theFrame.setResizable(false);

		theFrame.add(thePanel);

		theFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		theFrame.setVisible(true);

		thePanel.playGame();

	}

}

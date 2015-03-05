package spiel;

import java.awt.Graphics;
import java.awt.Image;
import bilder.InternalImage;

public class Ball {
	private Image ball;
	private int X = 300;
	private int Y = 250;

	public Ball(int X, int Y) {

		this.X = X;
		this.Y = Y;

		ball = InternalImage.load("gruen.gif");

	}

	public void zeichneBall(Graphics g) {

		g.drawImage(ball, X, Y, null);
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public void setX(int x) {
		X = x;
	}

	public void setY(int y) {
		Y = y;
	}
}

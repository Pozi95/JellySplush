package spiel;

import java.awt.Graphics;
import java.awt.Image;
import bilder.InternalImage;

public class RoterBall {
	private Image roterball;
	private int X = 250;
	private int Y = 400;

	public RoterBall(int X, int Y) {

		this.X = X;
		this.Y = Y;

		roterball = InternalImage.load("rot.gif");

	}

	public void zeichneRotenBall(Graphics g) {

		g.drawImage(roterball, X, Y, null);
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

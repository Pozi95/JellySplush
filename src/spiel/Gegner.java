package spiel;

import java.awt.Graphics;
import java.awt.Image;

import bilder.InternalImage;

public class Gegner {
	private Image gegner;
	private int X;
	private int Y;

	public Gegner(int X, int Y) {
		this.X = X;
		this.Y = Y;

		gegner = InternalImage.load("blau.gif");
	}

	public void zeichneGegner(Graphics g) {
		g.drawImage(gegner, X, Y, null);
	}

	public void move(InputController2 ic2) {

		if (ic2.isUp()) {
			if (Y >= 22) {
				Y -= 5;
			}
		}

		if (ic2.isDown()) {
			if (Y <= 416) {
				Y += 5;
			}
		}

		if (ic2.isLeft()) {
			if (X >= 22) {
				X -= 5;
			}
		}

		if (ic2.isRight()) {
			if (X <= 416) {
				X += 5;
			}
		}
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}
}

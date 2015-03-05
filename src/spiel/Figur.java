package spiel;

import java.awt.Graphics;
import java.awt.Image;
import bilder.InternalImage;

public class Figur {
	private Image figur;
	private int X;
	private int Y;

	public Figur(int X, int Y) {

		this.X = X;
		this.Y = Y;

		figur = InternalImage.load("biggrin.gif");

	}

	public void zeichneFigur(Graphics g) {
		g.drawImage(figur, X, Y, null);
	}

	public void move(InputController ic) {

		if (ic.isUp()) {
			if (Y >= 22) {
				Y -= 5;
			}
		}

		if (ic.isDown()) {
			if (Y <= 416) {
				Y += 5;
			}
		}

		if (ic.isLeft()) {
			if (X >= 22) {
				X -= 5;
			}
		}

		if (ic.isRight()) {
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

package spiel;

import java.awt.Graphics;
import java.awt.Image;

import bilder.InternalImage;

public class Stein {
	private Image stein;

	public Stein(int X, int Y) {

		stein = InternalImage.load("29.png");

	}

	public void zeichneStein(Graphics g) {

		for (int x = 0; x <= 440; x += 20) {
			for (int y = 0; y <= 440; y += 20) {
				if (x == 0) {
					g.drawImage(stein, x, y, null);
				}

				if (y == 0) {
					g.drawImage(stein, x, y, null);
				}

				if (x == 440) {
					g.drawImage(stein, x, y, null);
				}

				if (y == 440) {
					g.drawImage(stein, x, y, null);
				}
			}
		}
	}
}

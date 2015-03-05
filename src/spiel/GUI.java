package spiel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import bilder.InternalImage;

public class GUI extends JPanel implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Figur figur = new Figur(20, 20);
	private Gegner gegner = new Gegner(420, 20);
	private Stein stein = new Stein(70, 70);
	private Ball ball = new Ball(225, 200);
	private RoterBall roterball = new RoterBall(400, 250);
	private RoterBall roterball2 = new RoterBall(210, 90);
	private RoterBall roterball3 = new RoterBall(110, 390);
	private RoterBall roterball4 = new RoterBall(70, 120);
	private RoterBall roterball5 = new RoterBall(50, 386);
	private RoterBall roterball6 = new RoterBall(387, 400);
	private RoterBall roterball7 = new RoterBall(299, 240);
	private RoterBall roterball8 = new RoterBall(410, 220);
	private RoterBall roterball9 = new RoterBall(20, 260);
	private RoterBall roterball10 = new RoterBall(97, 40);
	private RoterBall roterball11 = new RoterBall(180, 30);
	private RoterBall roterball12 = new RoterBall(222, 290);
	private RoterBall roterball13 = new RoterBall(420, 190);
	private RoterBall roterball14 = new RoterBall(320, 160);
	private RoterBall roterball15 = new RoterBall(110, 80);
	private RoterBall roterball16 = new RoterBall(206, 350);
	private RoterBall roterball17 = new RoterBall(40, 90);
	private RoterBall roterball18 = new RoterBall(320, 50);
	private RoterBall roterball19 = new RoterBall(150, 180);
	private RoterBall roterball20 = new RoterBall(211, 150);
	private RoterBall roterball21 = new RoterBall(300, 310);
	private Thread game;
	private InputController ic = new InputController();
	private InputController2 ic2 = new InputController2();
	private int punkteFigur;
	private int punkteGegner;
	private int rot = 1;
	private double lebenFigur = 3;
	private double lebenGegner = 3;

	public GUI() {
		setFocusable(true);
		addKeyListener(ic);
		addKeyListener(ic2);
		game = new Thread(this);
		game.start();
	}

	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 466, 490);
		stein.zeichneStein(g);
		ball.zeichneBall(g);

		if (rot >= 2) {
			roterball2.zeichneRotenBall(g);
		}
		if (rot >= 4) {
			roterball3.zeichneRotenBall(g);
		}
		if (rot >= 6) {
			roterball4.zeichneRotenBall(g);
		}
		if (rot >= 8) {
			roterball5.zeichneRotenBall(g);
		}
		if (rot >= 10) {
			roterball6.zeichneRotenBall(g);
		}
		if (rot >= 12) {
			roterball7.zeichneRotenBall(g);
		}
		if (rot >= 14) {
			roterball8.zeichneRotenBall(g);
		}
		if (rot >= 16) {
			roterball9.zeichneRotenBall(g);
		}
		if (rot >= 18) {
			roterball10.zeichneRotenBall(g);
		}
		if (rot >= 20) {
			roterball11.zeichneRotenBall(g);
		}
		if (rot >= 22) {
			roterball12.zeichneRotenBall(g);
		}
		if (rot >= 24) {
			roterball13.zeichneRotenBall(g);
		}
		if (rot >= 26) {
			roterball14.zeichneRotenBall(g);
		}
		if (rot >= 28) {
			roterball15.zeichneRotenBall(g);
		}
		if (rot >= 30) {
			roterball16.zeichneRotenBall(g);
		}
		if (rot >= 32) {
			roterball17.zeichneRotenBall(g);
		}
		if (rot >= 34) {
			roterball18.zeichneRotenBall(g);
		}
		if (rot >= 36) {
			roterball19.zeichneRotenBall(g);
		}
		if (rot >= 38) {
			roterball20.zeichneRotenBall(g);
		}
		if (rot >= 40) {
			roterball21.zeichneRotenBall(g);
		}
		if (rot >= 42) {
			roterball.zeichneRotenBall(g);
		}
		figur.zeichneFigur(g);
		gegner.zeichneGegner(g);
		Graphics2D punkteBlau = (Graphics2D) g;
		Font test = new Font("Arial", Font.BOLD, 20);
		punkteBlau.setColor(Color.blue);
		punkteBlau.setFont(test);
		punkteBlau.drawString("Punkte: " + punkteGegner, 360, 17);
		Graphics2D punkteGelb = (Graphics2D) g;
		Font test2 = new Font("Arial", Font.BOLD, 20);
		punkteGelb.setColor(Color.yellow);
		punkteGelb.setFont(test2);
		punkteGelb.drawString("Punkte: " + punkteFigur, 2, 17);
		Graphics2D lebenBlau = (Graphics2D) g;
		Font test3 = new Font("Arial", Font.BOLD, 20);
		lebenBlau.setColor(Color.blue);
		lebenBlau.setFont(test3);
		lebenBlau.drawString("" + (int) lebenGegner, 264, 17);
		Graphics2D lebenGelb = (Graphics2D) g;
		Font test4 = new Font("Arial", Font.BOLD, 20);
		lebenGelb.setColor(Color.yellow);
		lebenGelb.setFont(test4);
		lebenGelb.drawString("" + (int) lebenFigur, 183, 17);

	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JFrame Frame = new JFrame("JellySplush");

		Frame.setSize(466, 489);

		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Frame.setResizable(false);

		Frame.add(new JLabel("Beispiel JLabel"));

		Frame.add(new GUI());

		Frame.setVisible(true);
	}

	public void update() {
		figur.move(ic);
		gegner.move(ic2);
		repaint();
	}

	public void ballupdate() {
		int x = new Random().nextInt() % 420;
		int y = new Random().nextInt() % 420;

		if (x < 0) {
			y *= -1;
			if (x < 30) {
				x = 30;
				ball.setX(x);
			}
		}
		if (x < 30) {
			x = 30;
			ball.setX(x);
		} else {
			ball.setX(x);
		}

		if (y < 0) {
			y *= -1;
			if (y < 30) {
				y = 30;
				ball.setY(y);
			}
		}
		if (y < 30) {
			y = 30;
			ball.setX(y);
		} else {
			ball.setY(y);
		}
	}

	public boolean CollisionFigur(Figur figur, Ball ball) {
		boolean collision = false;

		if (figur.getX() - ball.getX() <= 3
				&& figur.getX() - ball.getX() >= -10
				&& figur.getY() - ball.getY() <= 3
				&& figur.getY() - ball.getY() >= -10) {
			punkteFigur++;
			collision = true;
			rot++;
		}
		return collision;
	}

	public boolean CollisionGegner(Gegner gegner, Ball ball) {
		boolean collision = false;

		if (gegner.getX() - ball.getX() <= 3
				&& gegner.getX() - ball.getX() >= -10
				&& gegner.getY() - ball.getY() <= 3
				&& gegner.getY() - ball.getY() >= -10) {
			punkteGegner++;
			collision = true;
			rot++;
		}
		return collision;
	}

	public boolean CollisionFigurFalsch(Figur figur, RoterBall roterball) {
		boolean collision = false;

		if (figur.getX() - roterball.getX() <= 1
				&& figur.getX() - roterball.getX() >= -10
				&& figur.getY() - roterball.getY() <= 1
				&& figur.getY() - roterball.getY() >= -10) {
			collision = true;
		}
		return collision;
	}

	public boolean CollisionGegnerFalsch(Gegner gegner, RoterBall roterball) {
		boolean collision = false;

		if (gegner.getX() - roterball.getX() <= 1
				&& gegner.getX() - roterball.getX() >= -10
				&& gegner.getY() - roterball.getY() <= 1
				&& gegner.getY() - roterball.getY() >= -10) {
			collision = true;
		}
		return collision;
	}

	public void showDialogFigur() {

		JOptionPane.showMessageDialog(this,
				"!!! Gelb hat zu viele rote Bälle gecrasht !!!",
				"GELB HAT VERLOREN", JOptionPane.WARNING_MESSAGE,
				new ImageIcon(InternalImage.load("biggrin.gif")));
		System.exit(1);
	}

	public void showDialogGegner() {
		JOptionPane.showMessageDialog(this,
				"!!! Blau hat zu viele rote Bälle gecrasht !!!",
				"BLAU HAT VERLOREN", JOptionPane.WARNING_MESSAGE,
				new ImageIcon(InternalImage.load("blau.gif")));
		System.exit(1);
	}

	@Override
	public void run() {
		for (;;) {
			update();

			if (CollisionFigur(figur, ball) == true
					|| CollisionGegner(gegner, ball) == true) {
				ballupdate();
			}
			if (rot >= 42 && CollisionFigurFalsch(figur, roterball) == true) {
				lebenFigur -= 0.25;

			}
			if (rot >= 42 && CollisionGegnerFalsch(gegner, roterball) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 2 && CollisionFigurFalsch(figur, roterball2) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 2 && CollisionGegnerFalsch(gegner, roterball2) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 4 && CollisionFigurFalsch(figur, roterball3) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 4 && CollisionGegnerFalsch(gegner, roterball3) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 6 && CollisionFigurFalsch(figur, roterball4) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 6 && CollisionGegnerFalsch(gegner, roterball4) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 8 && CollisionFigurFalsch(figur, roterball5) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 8 && CollisionGegnerFalsch(gegner, roterball5) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 10 && CollisionFigurFalsch(figur, roterball6) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 10 && CollisionGegnerFalsch(gegner, roterball6) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 12 && CollisionFigurFalsch(figur, roterball7) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 12 && CollisionGegnerFalsch(gegner, roterball7) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 14 && CollisionFigurFalsch(figur, roterball8) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 14 && CollisionGegnerFalsch(gegner, roterball8) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 16 && CollisionFigurFalsch(figur, roterball9) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 16 && CollisionGegnerFalsch(gegner, roterball9) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 18 && CollisionFigurFalsch(figur, roterball10) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 18 && CollisionGegnerFalsch(gegner, roterball10) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 20 && CollisionFigurFalsch(figur, roterball11) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 20 && CollisionGegnerFalsch(gegner, roterball11) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 22 && CollisionFigurFalsch(figur, roterball12) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 22 && CollisionGegnerFalsch(gegner, roterball12) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 24 && CollisionFigurFalsch(figur, roterball13) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 24 && CollisionGegnerFalsch(gegner, roterball13) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 26 && CollisionFigurFalsch(figur, roterball14) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 26 && CollisionGegnerFalsch(gegner, roterball14) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 28 && CollisionFigurFalsch(figur, roterball15) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 28 && CollisionGegnerFalsch(gegner, roterball15) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 30 && CollisionFigurFalsch(figur, roterball16) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 30 && CollisionGegnerFalsch(gegner, roterball16) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 32 && CollisionFigurFalsch(figur, roterball17) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 32 && CollisionGegnerFalsch(gegner, roterball17) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 34 && CollisionFigurFalsch(figur, roterball18) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 34 && CollisionGegnerFalsch(gegner, roterball18) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 36 && CollisionFigurFalsch(figur, roterball19) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 36 && CollisionGegnerFalsch(gegner, roterball19) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 38 && CollisionFigurFalsch(figur, roterball20) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 38 && CollisionGegnerFalsch(gegner, roterball20) == true) {
				lebenGegner -= 0.25;
			}
			if (rot >= 40 && CollisionFigurFalsch(figur, roterball21) == true) {
				lebenFigur -= 0.25;
			}
			if (rot >= 40 && CollisionGegnerFalsch(gegner, roterball21) == true) {
				lebenGegner -= 0.25;
			}
			if (punkteFigur == 30) {
				JOptionPane.showMessageDialog(this,
						"!!! Gelb hat gewonnen !!!", "GELB SIEGT",
						JOptionPane.PLAIN_MESSAGE,
						new ImageIcon(InternalImage.load("biggrin.gif")));
				System.exit(1);
			}
			if (punkteGegner == 30) {
				JOptionPane.showMessageDialog(this,
						"!!! Blau hat gewonnen !!!", "BLAU SIEGT",
						JOptionPane.PLAIN_MESSAGE,
						new ImageIcon(InternalImage.load("blau.gif")));
				System.exit(1);
			}
			if (lebenFigur == 0) {
				showDialogFigur();
			}
			if (lebenGegner == 0) {
				showDialogGegner();
			}
			try {
				Thread.sleep(33);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
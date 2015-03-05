package spiel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputController2 implements KeyListener  
{
	
	private boolean up = false;
	private boolean down = false;
	private boolean left = false;
	private boolean right = false;

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			up=true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			down=true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			left=true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			right=true;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			up=false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			down=false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			left=false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			right=false;
		}
	}

	@Override
	public void keyTyped(KeyEvent e){}

	public boolean isUp() 
	{
		return up;
	}

	public boolean isDown() 
	{
		return down;
	}

	public boolean isLeft() 
	{
		return left;
	}

	public boolean isRight() 
	{
		return right;
	}
}

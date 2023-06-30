package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	public boolean up = false,down = false,right = false,left = false;

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keys = e.getKeyCode();
		switch(keys) {
		case KeyEvent.VK_W:
			 up = true;
			 down = false;
			 left = false;
			 right = false;
			break;
		
		
		case KeyEvent.VK_S:
			down = true;
			up = false;
			left = false;
			right = false;
			break;
	
		
		case KeyEvent.VK_A:
			left = true;
			right = false;
			down = false;
			up = false;
			break;
	
		
		case KeyEvent.VK_D:
			right = true;
			left = false;
			down = false;
			up = false;
			break;

		
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int keyco = e.getKeyCode();
		switch(keyco) {
			case KeyEvent.VK_W:
				up = false;
			break;
			case KeyEvent.VK_S:
				down = false;
			break;
			case KeyEvent.VK_D:
				right = false;
			break;
			case KeyEvent.VK_A:
				left = false;
			break;
		
		}
		
	}
	

}

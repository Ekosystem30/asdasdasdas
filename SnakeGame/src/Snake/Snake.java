package Snake;

import java.awt.Color;
import java.awt.Graphics2D;

public class Snake {
	public int x;
	public int y;
	
	public void draw(Graphics2D g2) {
		g2.setColor(Color.GREEN);
		g2.fillRect(x, y, 32, 32);
		
	}
	
	

}

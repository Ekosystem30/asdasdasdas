package Snake;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.TileObserver;
import java.util.ArrayList;

import Main.GamePanel;

public class SnakeManage {
	public GamePanel gp;
	public ArrayList<Snake> square;
	public int snakelenght = 6;
	public SnakeManage(GamePanel gp) {
		this.gp = gp;
		square = new ArrayList<Snake>();
		manage();
		
	}
	public void manage() {
		for(int i = 0;i < snakelenght;i++) {
			Snake sn = new Snake();
			sn.x = gp.tilesize * i;
			sn.y = gp.tilesize * gp.screenrow - gp.tilesize;
			square.add(sn);

		}
	}
	public void update() {
		if(gp.keyh.up) {
			square.remove(0);
			Snake sn = new Snake();
			sn.x = square.get(square.size()-1).x;
			sn.y = square.get(square.size() - 1).y - gp.tilesize;
			square.add(sn);
			gp.repaint();
			
			
			
		}
		else if(gp.keyh.down) {
			square.remove(0);
			Snake sn = new Snake();
			sn.x = square.get(square.size()-1).x;
			sn.y = square.get(square.size() - 1).y + gp.tilesize;
			square.add(sn);
			
			
			gp.repaint();
			
		}
		else if(gp.keyh.left) {
			square.remove(0);
			Snake sn = new Snake();
			sn.x = square.get(square.size()-1).x - gp.tilesize;
			sn.y = square.get(square.size() - 1).y;
			square.add(sn);
			
			gp.repaint();
			
		}
		else if(gp.keyh.right) {
			square.remove(0);
			Snake sn = new Snake();
			sn.x = square.get(square.size()-1).x + gp.tilesize;
			sn.y = square.get(square.size() - 1).y;
			square.add(sn);
			gp.repaint();
			
		}
		
		
		
		
		
	}
	public void draw(Graphics2D g2) {
		
			for(Snake sn : square) {
				System.out.println(square.size());
				sn.draw(g2);
				
				
				
			}
		
			
		
		
		
		
	}

}


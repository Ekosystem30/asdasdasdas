package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import Snake.SnakeManage;

public class GamePanel extends JPanel implements Runnable{
	public final int tilesize = 32;
	public final int screenrow = 15;
	public final int screencol = 15;
	public final int screenheight = screenrow * tilesize;
	public final int screenwidth = screencol * tilesize;
	public final int FPS = 30;
	public Thread gameThread;
	public KeyHandler keyh = new KeyHandler();
	public SnakeManage manage = new SnakeManage(this);
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenwidth,screenheight));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(keyh);
	}
	public void startThread() {
		gameThread = new Thread(this);
		gameThread.start();
		
	}
	@Override
	public void run() {
		long drawtime = 1000000000/ FPS;
		long nextdrawtime = System.nanoTime() + drawtime;
		while(gameThread != null) {
			

			update();
			repaint();
			long remaining = nextdrawtime - System.nanoTime();
			remaining = remaining/1000000;
			if(remaining < 0) {
				remaining = 0;
				
				
			}
			try {
				Thread.sleep(remaining);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			nextdrawtime += drawtime;
			
			
			
		}
		
		
	}
	public void update() {
		manage.update();
		
		
	}
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		int row = 0;
		int col = 0;
		while(row < screenrow && col < screencol) {
			g2.setColor(Color.WHITE);
			g2.drawRect(col * tilesize, row * tilesize, tilesize, tilesize);
			col++;
			if(col == screencol) {
				col = 0;
				row++;
				
			}
			
		}
		manage.draw(g2);
		
		
		
	}
	
	
	

}

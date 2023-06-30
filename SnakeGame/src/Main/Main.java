package Main;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		GamePanel gp = new GamePanel();
		JFrame ekran = new JFrame();
		
		ekran.setResizable(false);
		
		ekran.add(gp);
		ekran.pack();
		
		
		
		ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ekran.setLocationRelativeTo(null);
		ekran.setBackground(Color.black);
		ekran.setVisible(true);
		gp.startThread();
		
		
		
	}

}

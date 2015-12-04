package Hacking_Game;
/*
 * Kevin Dixson
 * 11-18-15
 * The Hacking Game
 * Java 1 2015/2016 Final Project
 */

import java.awt.*;
import javax.swing.*;

public class DrawPics {
	
	private static Graphics g;

	public DrawPics() {
		showImage(0);
	}
	 
    public void showImage(int whichDevice) {
    	String device = null;
    	JFrame frame = new JFrame("Display Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel panel = (JPanel)frame.getContentPane();
 
        JLabel label = new JLabel();
        
        switch (whichDevice) {
        	case 1:
        		device = "iphone2";
        		break;
        		
        	case 2:
        		device = "nexus";
        		break;
        		
        	case 3:
        		device = "surface";
        		break;
        		
        	case 4:
        		device = "macbook";
        		break;
        }
        
        if (device != null) {
	        label.setIcon(new ImageIcon(device + ".png"));
	        panel.add(label);
	 
	        frame.setLocationRelativeTo(null);
	        frame.pack();
	        frame.setVisible(true);
        }
    }
 
    public void paint(Graphics g) {
    	g.setColor(Color.BLACK);
    	g.drawRect(480, 480, 200, 100);
    }
    
    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DrawPics();
                DrawPics bzofghia = new DrawPics();
                bzofghia.paint(g);
            }
        });
    }
}
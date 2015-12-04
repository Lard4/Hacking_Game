package Hacking_Game;
/*
 * Kevin Dixson
 * 11-18-15
 * The Hacking Game
 * Java 1 2015/2016 Final Project
 */

import java.io.*;
import java.util.*;

public class Mainframe {
	private static final int IPHONE6S = 1;
	private static final int NEXUS6 = 2;
	private static final int SURFACEPRO2 = 3;
	private static final int MACBOOKPRO = 4;

	private Hack hack = new Hack();

	public static void main(String[] args) throws Exception {
		boolean deciding = true;
		
		Mainframe here = new Mainframe();
		MainframeTutorial tut = new MainframeTutorial();
		Random r = new Random();
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		here.printWithDelays("Welcome to the hacking game.", 100);
	    Thread.sleep(250);
	    here.printWithDelays("Would you like a tutorial?", 75);
	    
	    try {
	    	while (deciding) {
		    	String sInput = input.readLine();
		    	
		    	switch (sInput.toLowerCase()) {
			    	case "yes":
			    		deciding = false;
			    		System.out.println("Well, I guess I can accomadate for a newbie.");
			    		Thread.sleep(500);
			    		// Clear the console
			    		tut.determineMachine();
			    		break;
			    		
			    	case "no":
			    		deciding = false;
			    		System.out.println("Well then. Aren't you just the pro at this?");
			    		Thread.sleep(500);
			    		// Clear the console
			    	    here.determineMachine( (1 + r.nextInt(4)));
			    		break;
			    		
		    		default:
		    			System.out.println("Please answer yes or no and try again.");
		    	}
	    	}
	    } catch (IOException exc) {
	    	System.out.println(exc);
	    }
	}
	
	public void determineMachine(int whichMachine) throws InterruptedException {
		switch (whichMachine) {
			case 1:
				hack.iPhone6s();
				break;
			case 2:
				hack.Nexus6();
				break;
			case 3:
				hack.SurfacePro2();
				break;
			case 4:
				hack.MacbookPro();
				break;
		}
	}

	public void printWithDelays(String data, long delay) throws InterruptedException {
	    for (char ch:data.toCharArray()) {
	        System.out.print(ch);
	        Thread.sleep(delay);
	    }
	    System.out.println();
	}
}
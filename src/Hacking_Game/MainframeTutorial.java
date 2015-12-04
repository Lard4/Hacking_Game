package Hacking_Game;
/*
 * Kevin Dixson
 * 11-18-15
 * The Hacking Game
 * Java 1 2015/2016 Final Project
 */

import java.io.*;
import java.util.*;

public class MainframeTutorial {
	
DrawPics picture = new DrawPics();
	
	private static final int IPHONEINTERNALS = 1;
	private static final int NEXUSINTERNALS = 2;
	private static final int SURFACEINTERNALS = 3;
	private static final int MACBOOKINTERNALS = 4;
	
	public void determineMachine() throws InterruptedException {
		boolean deciding = true;
		
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		
		printWithDelays("Which device would you like to learn how to hack?", 50);
		System.out.println("1) Apple iPhone 6s" + '\n' +
				"2) Google Nexus 6"+ '\n' +
				"3) Microsoft Surface Pro 2"+ '\n' +
				"4) Apple Macbook Pro");
	    
	    try {
	    	while (deciding) {
		    	String sInput = input.readLine();
		    	int nInput = Integer.parseInt(sInput);
		    	
		    	switch (nInput) {
			    	case 1:
			    		deciding = false;
			    		// Clear the console
			    		iPhone6s();
			    		break;
			    		
			    	case 2:
			    		deciding = false;
			    		// Clear the console
			    		Nexus6();
			    		break;
			    		
			    	case 3:
			    		deciding = false;
			    		// Clear the console
			    		SurfacePro2();
			    		break;
			    		
			    	case 4:
			    		deciding = false;
			    		// Clear the console
			    		MacbookPro();
			    		break;

		    		default:
		    			System.out.println("Please pick a valid device and try again.");
		    	}
	    	}
	    } catch (IOException exc) {
	    	System.out.println("Please type a number and try again");
	    }
	}

	public void iPhone6s() throws InterruptedException {
		// User is hacking the iPhone 6s
		picture.showImage(IPHONEINTERNALS);
		printWithDelays("Welcome to the tutorial for the Apple iPhone 6s.", 80);
		printWithDelays("This is your Apple iPhone 6s.", 10);
	}

	public void Nexus6() throws InterruptedException {
		// User is hacking the Nexus 6
		picture.showImage(NEXUSINTERNALS);
		printWithDelays("Welcome to the tutorial for the Google Nexus 6.", 80);
	}

	public void SurfacePro2() throws InterruptedException {
		// User is hacking the Surface Pro 2
		picture.showImage(SURFACEINTERNALS);
		printWithDelays("Welcome to the tutorial for the Microsoft Surface Pro 2.", 80);
	}

	public void MacbookPro() throws InterruptedException {
		// User is hacking the Macbook Pro
		picture.showImage(MACBOOKINTERNALS);
		printWithDelays("Welcome to the tutorial for the Apple Macbook Pro.", 80);
	}
	
	public void printWithDelays(String data, long delay) throws InterruptedException {
	    for (char ch:data.toCharArray()) {
	        System.out.print(ch);
	        Thread.sleep(delay);
	    }
	    System.out.println();
	}
}
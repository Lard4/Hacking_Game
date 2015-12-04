package Hacking_Game;
/*
 * Kevin Dixson
 * 11-18-15
 * The Hacking Game
 * Java 1 2015/2016 Final Project
 */

import java.awt.image.*;
import java.io.*;
import java.util.*;

public class Hack {
	DrawPics picture = new DrawPics();
	
	private static final int IPHONEINTERNALS = 1;
	private static final int NEXUSINTERNALS = 2;
	private static final int SURFACEINTERNALS = 3;
	private static final int MACBOOKINTERNALS = 4;

	public void iPhone6s() throws InterruptedException {
		// User is hacking the iPhone 6s
		picture.showImage(IPHONEINTERNALS);
		printWithDelays("This is the Apple iPhone 6s.", 80);
	}

	public void Nexus6() throws InterruptedException {
		// User is hacking the Nexus 6
		picture.showImage(NEXUSINTERNALS);
		printWithDelays("This is the Google Nexus 6.", 80);
	}

	public void SurfacePro2() throws InterruptedException {
		// User is hacking the Surface Pro 2
		picture.showImage(SURFACEINTERNALS);
		printWithDelays("This is the Microsoft Surface Pro 2.", 80);
	}

	public void MacbookPro() throws InterruptedException {
		// User is hacking the Macbook Pro
		picture.showImage(MACBOOKINTERNALS);
		printWithDelays("This is the Apple Macbook Pro.", 80);
	}
	
	public void printWithDelays(String data, long delay) throws InterruptedException {
	    for (char ch:data.toCharArray()) {
	        System.out.print(ch);
	        Thread.sleep(delay);
	    }
	    System.out.println();
	}
}
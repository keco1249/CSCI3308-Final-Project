
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.applet.*;
import java.util.Random;

public class applet extends JApplet {
	String n, a, g, w, h, s;
	private String Name;
	private int Age;
	private String Sex;
	private double Weight;
	private double Height;
	private String State;
	Random death = new Random();
	
	public void init() {
		n = JOptionPane.showInputDialog("What is your name?");
	    a = JOptionPane.showInputDialog("How old are you?");
	    g = JOptionPane.showInputDialog("Male or Female?");
	    w = JOptionPane.showInputDialog("What is your weight?");
	    h = JOptionPane.showInputDialog("How tall are you?(exact height in decimal form)");
	    s = JOptionPane.showInputDialog("Where are you from?");
	}
	
	public void start() {
		//Name
	    Name = n;
	    //Age
	    try {
	    	Age = Integer.parseInt(a);
	    }
	    catch(Exception e) {
	    	a = "0";
	    	Age = Integer.parseInt(a);
	    }
	    //Sex
	    try {
	    	if(g.equals("m") || g.equals("M") || g.equals("male") || g.equals("Male"))
	    		Sex = "Male";
	    	else if(g.equals("f") || g.equals("F") || g.equals("female") || g.equals("Female"))
	    		Sex = "Female";
	    }
	    catch(Exception e) {
	    	Sex = "Invalid sex";
	    }
	    //Weight
	    try {
	    	Weight = Double.parseDouble(w);
	    }
	    catch(Exception e) {
	    	w = "0";
	    	Weight = Double.parseDouble(w);
	    }
	    //Height
	    try {
	    	Height = Double.parseDouble(h);
	    }
	    catch(Exception e) {
	    	h = "0";
	    	Height = Double.parseDouble(h);
	    }
	    //State
	    State = s;
	}
	
	public void paint(Graphics g) {
	    super.paint(g);
	    g.setColor(Color.BLUE);
	    
	    g.drawString("Name:  " + Name, 25, 30);
	    g.drawString("Age:   " + Age, 25, 50);
	    g.drawString("Sex: " + Sex, 25, 70);	
	    g.drawString("Weight: " + Weight + " lbs", 25, 90);
	    g.drawString("Height: " + Height + " feet", 25, 110);
	    g.drawString("State: " + State, 25, 130);
	    
	    g.setColor(Color.BLACK);
	    g.drawString("You will die in: " + death.nextInt(70) + " years.", 25,150);
	}
	
	public void stop() {
		
	}
	
	public void destroy() {
		
	}
	
}

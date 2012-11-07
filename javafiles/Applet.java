

import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.applet.*;
import java.util.Random;

public class Applet extends JApplet {
	String n, a, g, w, h, s;
	private String Name;
	private int Age;
	private String Sex;
	private double Weight;
	private double Height;
	private String From;
	Random death = new Random();
	int randomno;
	Font title = new Font("TimesRoman", Font.BOLD, 25);
	Font info = new Font("TimesRoman", Font.PLAIN, 14);
	Font result = new Font("Serif", Font.BOLD + Font.ITALIC, 15);

	public Applet() {
		this.setBackground(Color.BLACK);
	}
	
	public void init() {
		this.setSize(800, 500);
		randomno = death.nextInt(70);
		n = JOptionPane.showInputDialog("What is your name?");
	    while(!n.matches("[a-zA-Z ]*$") || n.length() < 2 || n.equals(null)) {
	    	n = JOptionPane.showInputDialog("Please enter a valid name: ");
	    }
	    a = JOptionPane.showInputDialog("How old are you?");
	    while(!a.matches("[0-9]+") || a.length() > 3 || a.equals(null)) {
		    a = JOptionPane.showInputDialog("Please enter a valid age: ");
	    }
	    g = JOptionPane.showInputDialog("Male or Female? Enter m, male, f, or female.");
	    while(!g.matches("[a-zA-Z]+") || g.equals(null)) {
	    	g = JOptionPane.showInputDialog("Please only enter m, male, m, or female: ");
	    }
	    w = JOptionPane.showInputDialog("What is your weight?");
	    while(!w.matches("[0-9.]*$") || w.length() < 2 || w.equals(null)) {
		    w = JOptionPane.showInputDialog("Please enter a valid weight: ");
	    }	    
	    h = JOptionPane.showInputDialog("How tall are you?(exact height in decimal form)");
	    while(!h.matches("[0-9.]*$") || h.equals(null)) {
	    	h = JOptionPane.showInputDialog("Please enter a valid height:");
	    }
	    s = JOptionPane.showInputDialog("Where are you from?");
	    while(!s.matches("[a-zA-Z ]*$") || s.length() < 2 || s.equals(null)) {
		    s = JOptionPane.showInputDialog("This field can only contains letters. Where are you from?");
	    }
	    
	   //Name
	    Name = n;	    
	    //Age
	    Age = Integer.parseInt(a);
	    //Sex
	    if(g.equals("m") || g.equals("M") || g.equals("male") || g.equals("Male"))
		   	Sex = "Male";
		else if(g.equals("f") || g.equals("F") || g.equals("female") || g.equals("Female"))
		   	Sex = "Female";
		else 
			Sex = "Invalid sex or you can't type properly.";
	    //Weight
	    Weight = Double.parseDouble(w);
	    //Height
	    Height = Double.parseDouble(h);
	    //State
	    From = s;
	}
	
	public void start() {
		
	}
	
	public void paint(Graphics g) {
	    super.paint(g);
	     
	    g.setFont(title);
	    g.setColor(Color.BLACK);
	    g.drawString("DEATH PROBABILITY", 200, 30);
	    
	    g.setFont(info);
	    g.setColor(Color.BLUE);	    
	    g.drawString("Name:" + Name, 25, 70);
	    g.drawString("Age:" + Age, 25, 90);
	    g.drawString("Sex:" + Sex, 25, 110);	
	    if(Weight > 1000) {
	    	g.drawString("Weight:" + "Your weight, " + Weight + " lbs, is too high for this probability.",  25,130);
	    }
	    else 
	    	g.drawString("Weight:" + Weight + " lbs", 25, 130);
	    if(Height > 9) {
	    	g.drawString("Height:" + "Your height, " + Height + " feet, is too high for this probability.", 25, 150);
	    }
	    else
	    	g.drawString("Height:" + Height + " feet", 25, 150);
	    g.drawString("From:" + From, 25, 170);
	    
	    g.setFont(result);
	    g.setColor(Color.RED);
	    if(Weight > 1000 && Height > 9) 
	    	g.drawString("You will die now because there's no way you can be this heavy and so tall.", 25, 230);
	    else if(Height > 9)
	    	g.drawString("You will die now because there's no way you can be this tall.", 25, 230);
	    else if(Weight > 1000)
	    	g.drawString("You will die now because there's no way you can be this heavy.", 25, 230);
	    else 
	    	g.drawString("You will die in " + randomno + " years.", 25,230);
	}
		
}

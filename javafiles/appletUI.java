


import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.applet.*;
import java.util.Random;
import java.lang.Object;
import javax.swing.JCheckBox;

public class appletUI extends JApplet {
	String nameString, ageString, genderString, weightString, heightString, stateString;
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

	
	public void init() {
		this.setSize(800, 500);
		randomno = death.nextInt(70);
	
	    try{
	    	javax.swing.SwingUtilities.invokeAndWait(new Runnable() {
	    		public void run() {
	    			createGUI();
	    		}
	    	});
	    } catch (Exception e) {
	    	System.err.println("create GUI didn't successfully complete");
	    }
	    
	}
	private void createGUI() {
		
		this.getContentPane().setLayout(new GridBagLayout());
		this.setBackground(Color.black);
		GridBagConstraints c = new GridBagConstraints();
		
		c.weightx = .3;
		c.gridx = 0;
		c.gridy = 0;
		JLabel nameLabel = new JLabel("First Name:");
		nameLabel.setHorizontalTextPosition(JLabel.CENTER);
		this.getContentPane().add(nameLabel, c);
	    
	    JTextField textField = new JTextField("");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = .5;
	    c.gridx = 1;
	    c.gridy = 0;
	    this.getContentPane().add(textField, c);
	    
	    JPanel spacePanel = new JPanel();
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 1;
	    c.gridx = 2;
	    c.gridy = 0;
	    this.getContentPane().add(spacePanel, c);
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = .3;
	    c.gridx = 0;
	    c.gridy = 1;
	    nameLabel = new JLabel("Last Name:");
	    nameLabel.setHorizontalAlignment(JLabel.CENTER);
	    nameLabel.setHorizontalTextPosition(JLabel.CENTER);
	    this.getContentPane().add(nameLabel, c);
	    
	    textField = new JTextField("");
	    c.fill = GridBagConstraints.HORIZONTAL;	
	    c.weightx = .5;
	    c.gridx = 1;
	    c.gridy = 1;
	    this.getContentPane().add(textField, c);
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 1;
	    c.gridx = 2;
	    c.gridy = 1;
	    this.getContentPane().add(spacePanel, c);
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = .3;
	    c.gridx = 0;
	    c.gridy = 2;
	    nameLabel = new JLabel("Age:");
	    nameLabel.setHorizontalAlignment(JLabel.CENTER);
	    nameLabel.setHorizontalTextPosition(JLabel.CENTER);
	    this.getContentPane().add(nameLabel, c);
	    
	    textField = new JTextField("");
	    c.fill = GridBagConstraints.HORIZONTAL;	
	    c.weightx = .5;
	    c.gridx = 1;
	    c.gridy = 2;
	    this.getContentPane().add(textField, c);
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 1;
	    c.gridx = 2;
	    c.gridy = 2;
	    this.getContentPane().add(spacePanel, c);
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = .3;
	    c.gridx = 0;
	    c.gridy = 3;
	    nameLabel = new JLabel("Height :");
	    nameLabel.setHorizontalAlignment(JLabel.CENTER);
	    nameLabel.setHorizontalTextPosition(JLabel.CENTER);
	    this.getContentPane().add(nameLabel, c);
	    
	    textField = new JTextField("");
	    c.fill = GridBagConstraints.HORIZONTAL;	
	    c.weightx = .5;
	    c.gridx = 1;
	    c.gridy = 3;
	    this.getContentPane().add(textField, c);
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 1;
	    c.gridx = 2;
	    c.gridy = 3;
	    this.getContentPane().add(spacePanel, c);
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = .3;
	    c.gridx = 0;
	    c.gridy = 4;
	    nameLabel = new JLabel("Weight:");
	    nameLabel.setHorizontalAlignment(JLabel.CENTER);
	    nameLabel.setHorizontalTextPosition(JLabel.CENTER);
	    this.getContentPane().add(nameLabel, c);
	    
	    textField = new JTextField("");
	    c.fill = GridBagConstraints.HORIZONTAL;	
	    c.weightx = .5;
	    c.gridx = 1;
	    c.gridy = 4;
	    this.getContentPane().add(textField, c);
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 1;
	    c.gridx = 2;
	    c.gridy = 4;
	    this.getContentPane().add(spacePanel, c);
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = .3;
	    c.gridx = 0;
	    c.gridy = 5;
	    nameLabel = new JLabel("Location:");
	    nameLabel.setHorizontalAlignment(JLabel.CENTER);
	    nameLabel.setHorizontalTextPosition(JLabel.CENTER);
	    this.getContentPane().add(nameLabel, c);
	    
	    textField = new JTextField("");
	    c.fill = GridBagConstraints.HORIZONTAL;	
	    c.weightx = .5;
	    c.gridx = 1;
	    c.gridy = 5;
	    this.getContentPane().add(textField, c);
	    
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 1;
	    c.gridx = 2;
	    c.gridy = 5;
	    this.getContentPane().add(spacePanel, c);
	    

	}
	
	public void start() {
		
	}

		
}


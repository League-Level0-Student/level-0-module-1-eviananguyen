package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String mother = "is a super hero";
		String MrDaveDunn = "he puts up with coding with a slow typer";
		String nicholas = "very out going";
		String christofer = "very chill";

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("Please  enter a name");
		// 3. In a pop-up, tell the user what is remarkable about that person.
		if (name.equalsIgnoreCase("mother")) {
			JOptionPane.showMessageDialog(null, mother);

		} else if (name.equalsIgnoreCase("christofer")) {
			JOptionPane.showMessageDialog(null, christofer);

		} else if (name.equalsIgnoreCase("MrDaveDunn")) {
			JOptionPane.showMessageDialog(null, MrDaveDunn);
		} else if (name.equalsIgnoreCase("nicholas")) {
			JOptionPane.showMessageDialog(null, nicholas);

		}

		else {
			JOptionPane.showMessageDialog(null, "I dont know who " + name + "is. \n But I'msure they're great!");
		}
	}
	
}
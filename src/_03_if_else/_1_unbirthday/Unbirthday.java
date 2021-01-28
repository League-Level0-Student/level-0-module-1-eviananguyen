package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("Enter your birthday (mm/dd");
		if(birthday.equals("01/28")) {
	JOptionPane.showMessageDialog(null, "happy birthday!!");
	
}
		else {
			JOptionPane.showMessageDialog(null, "Merry Unbirthday!!");
		}
}
}
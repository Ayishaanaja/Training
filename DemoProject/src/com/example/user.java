package com.example;

import javax.swing.JOptionPane;

public class user {
	public static void main(String[] args) {
		//Dog d1=new Dog();
		//d1.eat();
		//Dog.main(null);
		//String name=JOptionPane.showInputDialog("Enter your name");
		//JOptionPane.showMessageDialog(null, "Hai "+name+" Welcome to UST");
		String s1=JOptionPane.showInputDialog("enter first number");
		String s2=JOptionPane.showInputDialog("enter second number");
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		JOptionPane.showMessageDialog(null, "addition is"+(a+b));
	}

}

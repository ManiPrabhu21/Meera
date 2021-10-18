package org.revese;

public class TaskReverse {
	public static void main(String[] args) {
	String name ="keera";
	String reverse ="";
	for (int i = name.length()-1; i>=0; i--) {
		char charAt = name.charAt(i);
		reverse=reverse+charAt;
	}
	System.out.println(reverse);
	
	
	
	}
}

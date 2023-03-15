package assignment8;

import java.util.ArrayList;

/*Write a Java program to create a new array list, add some colors (string)
and print out the collection. */

public class ColorsList {

	public static void main(String[] args) {
		ArrayList<String> color = new ArrayList<String>();//Declare and allocate memory for an ArrayList
		color.add("Blue");
		color.add("White");
		color.add("Pink");
		color.add("Green");
		color.add("Black");
		System.out.println(color);
		System.out.println(color.size());
		

	}

}

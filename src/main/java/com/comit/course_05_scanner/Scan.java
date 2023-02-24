package com.comit.course_05_scanner;

import java.util.Scanner;

public class Scan {
	/*Scanner --- is a class accepting user input.
	 * we can also save the memory leak if we use "try" method instead of using scan.nextline()
    page 59-62 from book*/
	public static void main(String[] args) {
		// create a scanner who accept user input from the keyboard
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter an integer");
		int i=scan.nextInt();
		System.out.println("You entered" +"    " + i);
		System.out.println("enter a double number");
		double d =scan.nextDouble();
		System.out.println("You entered" + "   "+ d);
		scan.nextLine();//clean the buffer, read the return key(13) left
		System.out.println("enter a string");
	    String str =scan.nextLine();
	    System.out.println("You input" +"  " + str);
	    scan.close();
	    
		

	}

}

package assignment2;
import java.util.Scanner;

public class Cad2Us {

	public static void main(String[] args) {
		System.out.println("Enter the amount of canadian dollars: ");
		Scanner cad=new Scanner(System.in);
		double caddollars =cad.nextDouble();
		double usdollars=caddollars*0.74;
		System.out.println("The converted u.s dollars are:"+ usdollars);
		
		

	}

}

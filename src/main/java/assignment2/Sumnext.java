package assignment2;
import java.util.Scanner;

public class Sumnext {

	public static void main(String[] args) {
		System.out.println("Enter any integer number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int num3=0;
		int num4=0;
		
		for (int i=1;i<=100;i++) {
			
		
		num3=num3+num;
		 num4=num3;
		 
		 num++;
		 
			
		}
		System.out.println(num4);
		
		

	}

}

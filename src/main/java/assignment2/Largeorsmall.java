package assignment2;
import java.util.Scanner;

public class Largeorsmall {

	public static void main(String[] args) {
		Scanner num1= new Scanner(System.in);
		System.out.println("Enter the first number :");
		double number_1 = num1.nextDouble();
		System.out.println("Enter the Second number :");
		double number_2 = num1.nextDouble();
		System.out.println(number_1+" " + number_2);
		if(number_1>number_2) {
			System.out.println("num1 is largest and num2 is smallest");
		}else
			System.out.println("num2 is largest and num1 is smallest");
		

	}

}

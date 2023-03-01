package assignment3;
import java.util.Scanner;



public class Calculator {

	public static void main(String[] args) {
		double num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=scan.nextDouble();
		System.out.println("Enter the second number");
		num2=scan.nextDouble();
		System.out.println("Enter the operation you want to perform");
		char op=scan.next().charAt(0);
		double o=0;
		switch(op) {
		case '+':
			if((num1>0)&& (num2>0)){
			o=num1+num2;}
			break;
		case '-':
			if(num1>num2) {
				o=num1-num2;
			}else {
				o=num2-num1;
			}
			break;
		case '*' :
			o=num1*num2;
			break;
		case '/' :
			o=num1/num2;
			break;
		default:
			System.out.println("You enter a wrong input");
		
		}
		
		System.out.println("The final output is:");
		System.out.println();
		System.out.println(num1+ " "+op +" "+num2+ " = " +o);

	}

}

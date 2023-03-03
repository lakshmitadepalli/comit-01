package assignment3;
import java.util.Scanner;
/*Write an algorithm that calls another name "add", which receives 2 numbers. 
The summation algorithm must add its parameters. 
The algorithm you invoke must receive that value and display it on the screen.*/
class Add{
	static int a;
	static int b;
	
public static int getA() {
		return a;
	}

	public static void setA(int a) {
		Add.a = a;
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		Add.b = b;
	}

int add()	{
	return a+b;
}
}

public class AddDisplay {

	public static void main(String[] args) {
		Add obj=new Add();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=scan.nextInt();
		System.out.println("Enter the second number");
		int b=scan.nextInt();
		obj.setA(a);
		obj.setB(b);
		int c=obj.add();
		System.out.println(c);
		scan.close();

	}

}

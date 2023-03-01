package assignment3;
import java.util.Scanner;
//Make a program that prints the 10 multiplication tables.
class Realtable{
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	void multiplication() {
		for(int i=1;i<=12;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
			
		}
	}
	
}

public class Multtables {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number you want to calculate it's table");
		int num=scan.nextInt();
		Realtable a1=new Realtable();
		a1.setNum(num);
		a1.multiplication();
		

	}

}

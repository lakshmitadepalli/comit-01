package assignment3;

import java.util.Scanner;

/*Write a program that asks for a numerical password and allows three attempts.
If the user enters the correct password, 
it shows "Correct!" And run any program, after the message. 
Otherwise the program should display "Wrong password". Then finish the program immediately.*/
class NextProgram{
	static int num;
	static int password;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	void squareofnum() {//other operations in the program
		num=num*num;
		System.out.println("The square of the number is:"+ num);
	}
}

public class Password {

	public static void main(String[] args) {
		NextProgram obj=new NextProgram();
		
		
		for (int i=1;i<=3 ;i++) {
			System.out.println("Enter the password");
			Scanner scan=new Scanner(System.in);
			boolean access=false;
			int password=scan.nextInt();
		
			if(password==89764) {
				//int a=scan.nextInt();
				access=true;
				System.out.println("You entered correct password");
				System.out.println("enter the number");
				int num=scan.nextInt();
				obj.setNum(num);
				obj.squareofnum();
				break;
				
			}else {
				System.out.println("You entered a wrong password");
			   access=false;
			  
			}
			
			
			//scan.close();
			
		}
		
	
		
		
		
			
			
		
		

	}
	

}

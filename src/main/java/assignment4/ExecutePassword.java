package assignment4;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
/*Create a class called Password with the following conditions:
It has the length and password attributes. By default, the length will be 8.
 The constructors will be as follows: A default constructor. 
 A constructor with the length that we send as parameter.
  Generate a random password with that length. 
  The methods you implement will be: isStrong (): return a boolean if it is strong or not,
   to be strong you must have more than 2 uppercase, more than 1 lower case and
    more than 5 numbers. GeneratePassword (): Generates the password of the object with the defined length.
     Get method for password and length. Set method for length. 
Now let's create an executable class:
Create an array of Passwords with the size that you indicate by keyboard. 
Create a loop that creates an object for each position in the array.
It also indicates by keyboard the length of the Passwords (before loop). 
Create another array of booleans where we store if the password of the password array is strong or not (use the previous loop). 
At the end, we show the password and whether or not it is strong (use the previous loop). Use this simple format: password1 boolean_value1
password2 boolean_value2*/

class Password{
	static int length;
	static String password;
	
	static String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String lowercase="abcdefghijklmnopqrstuvwxyz";
	static String digits="0123456789";
	
	
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	Password(){
		
	}
	Password(int length){
		this.length=length;
		
	}
	void isStrong() {
		
	
			
		if((password).equals((uppercase.length()==2)&&(lowercase.length()==1)&&(digits.length()==1))){
				System.out.println("true");
			}else {
				System.out.println("false");
			
			}
		
	
		
		}
	
	String generatePassword() {
		
		char a;
		password="";
		
		for (int i=0;i<length;i++) {
			int rand=(int)(Math.random()*62);
		if(rand<=9) {
			int ascii=rand+48;
			a= (char)(ascii);
		}else if (rand<=35) {
			int ascii=rand+55;
			a= (char)(ascii);
		}else {
			int ascii=rand+61;
			a= (char)(ascii);
		}
		
			password=password +a;
			
		

		}
		return password;
		
		
	}
		
	}
	

public class ExecutePassword {

	public static void main(String[] args) {
		boolean[] result=new boolean[4];
		
		Password obj1=new Password();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the password");
		int length=scan.nextInt();
		String[] password=new String[4];
		obj1.setLength(length);
		obj1.setPassword(null);
		
		
		for (int i=0;i<4;i++) {
			
			password[i]=obj1.generatePassword();
			obj1.isStrong();
						
			
		 }
		
		System.out.println(Arrays.toString(password));
		//System.out.println(Arrays.toString(result));
		//obj1.isStrong();
		
		
			
		scan.close();	
		
		
		
		
		
		
		
		

	}

}
 

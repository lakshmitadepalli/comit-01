package com.comit.course_tryouts;

public class Example {
	String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
  
    String numbers = "1234567890";
    String password="";

	boolean isStrong() {
		if(password.equals(capitalCaseLetters.length()==2 && lowerCaseLetters.length()==1 && numbers.length()==5 )) {
		return true;
		}else {
			return false;}
		}

	public static void main(String[] args) {
		//int rand=(int)(Math.random()*62);
		//System.out.println(rand);
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	  
	    String numbers = "1234567890";
	    Example a1=new Example();
		int length=9;
		char a;
		String password="";
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
		System.out.println( password);
		System.out.println(a1.isStrong());
		
		

	}

}

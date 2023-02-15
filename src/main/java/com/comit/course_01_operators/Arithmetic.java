package com.comit.course_01_operators;

class Arithmetic {

	public static void main(String[] args) {
		int firstnum = 8;
		int secondnum = 3;
		int thirdnum = 5;
		int fourthnum = 11;
		
		
		int sum = firstnum + secondnum;//Addition operator
		int sub = firstnum - secondnum;//subtraction operator
		int mult = firstnum * secondnum;//multiplication operator
		double div =(double)firstnum / secondnum;//Division operator
		int mod=firstnum%secondnum;//modulus operator
				
		System.out.println("Addition " + sum);
		System.out.println("subtraction" +  sub);
		System.out.println("Multiplication " + mult);
		System.out.println("Division " + div);
		System.out.println("Modulus" +  mod);
		
		int exp=(firstnum+thirdnum) * secondnum/fourthnum;

		System.out.println("expression" + exp);
		
		 
		 
	}

}

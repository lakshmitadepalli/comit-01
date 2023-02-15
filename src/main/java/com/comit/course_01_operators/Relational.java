package com.comit.course_01_operators;

 class Relational {

	public static void main(String[] args) {
		int a=10;
		int b=8;
		int c=12;
		boolean equalto = a==b;
		boolean notequal = a!=b;
		boolean greaterthan = a>b;
		boolean lessthan = a<b;
		boolean greaterthanequal = a>=b;
		boolean lessthanequal = a<=b;
		boolean exp=(a==b)&&(c>=b)||(a>c);
		
		
		
		
		
		System.out.println(equalto);
		System.out.println(notequal);
		System.out.println(greaterthan);
		System.out.println(lessthan);
		System.out.println(greaterthanequal);
		System.out.println(lessthanequal);
		System.out.println(exp);

	}

}

package com.comit.course_01_operators;

public class Unary {

	public static void main(String[] args) {
		int a=5;
		int b=a++;
		System.out.println(a);//post increment
		System.out.println(b);
		a=5;
		b=++a;
		System.out.println(a);//pre increment
		System.out.println(b);
		 a=5;
		 b=a--;
		System.out.println(a);//post derement
		System.out.println(b);
		a=5;
		b=--a;
		System.out.println(a);//pre decrement
		System.out.println(b);

	}

}

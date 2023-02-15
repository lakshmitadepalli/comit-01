package com.comit.course_02_flow_control;

public class Ifstatement {

	public static void main(String[] args) {
		int a=28;
		int b=28;
		//1 scenario
		if(a>b) {
			System.out.println("a is greater than b");
		}else if (a<b){
			System.out.println("a is less than b");
		}else {
			System.out.println("a and b are equal");
		}
		//2 scenario
		if(a>b) {
			System.out.println("a is greater than b");
		}
		if(a<b) {
			System.out.println("a is less than b");
			
		}
		if(a==b) {
			System.out.println("a is equal to b");
		}
		//3 scenario nested if
		int c=25;
		if (a>b) {
			if(a<c) {
				System.out.println("a is equal to b");
			}
		}
		String str;
		a=10;
		b=15;
		if(a>b) {
			str="a greater than b";
			
		}
		else {
			str="a is less than b";
		}
	
	str = (a > b) ? "a greater than b" : "a less than b"; 
	
	System.out.println(str);

	}
}

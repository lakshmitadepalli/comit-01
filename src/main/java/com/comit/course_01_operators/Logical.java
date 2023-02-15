package com.comit.course_01_operators;

 class Logical {

	public static void main(String[] args) {
		boolean a= true;
		boolean b=false;
		boolean c=false;
		boolean and = a&&b;//the and operator returns true only if both are operands are true
		boolean or = a||b;//the and operator returns false only if both are operands are false
		boolean not = !a;//the not returns the opposite
		boolean exp=a&&b||c;
		System.out.println(and);
		System.out.println(or);
		System.out.println(not);
		System.out.println(exp);

	}

}

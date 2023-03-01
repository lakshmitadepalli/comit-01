package com.comit.course_07_overloading;
class MyClass{
	int num;
	String str;
	//constructor overloading
	MyClass(){
		
	}
	MyClass(String str){
		this.str=str;
	}
	MyClass(String str,int num){
		this.str=str;
		this.num=num;
	}
	//method overloading
	// overloading by changing the type of parameters
	String concatenate(String str,int num) {
		return str+"   "+num;
	}
	String concatenate(String str) {
		return "Hello"+str;
		
	}
	int add(int a, int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
}

public class Overloading {

	public static void main(String[] args) {
		MyClass obj1=new MyClass();
		MyClass obj2=new MyClass("COMIT");
		MyClass obj3=new MyClass("comit",1);
		System.out.println(obj1.concatenate("COMIT",1));
		System.out.println(obj1.concatenate("comit"));
		System.out.println(obj1.add(1, 2));
		System.out.println(obj1.add(1, 2,3));

	}

}

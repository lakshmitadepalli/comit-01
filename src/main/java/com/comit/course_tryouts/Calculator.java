package com.comit.course_tryouts;

public class Calculator {
int num = 10;

public void calculate(int num) {
this.num = num * 10;
}

public void print() {
System.out.println(num);
}

public static void main(String[] args) {
Calculator obj = new Calculator();
obj.calculate(2);
obj.print();
}
}
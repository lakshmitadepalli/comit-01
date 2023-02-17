package com.comit.course_02_flow_control;

public class Whileloop {

	public static void main(String[] args) {
		int i=0;
		while(i<10) {
			
			i++;
			if (i==5) {
				//break;
				continue;//continues with the next iteration
			}
			System.out.println(i);
		}
		i=0;
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		System.out.println("The end");
	}

}

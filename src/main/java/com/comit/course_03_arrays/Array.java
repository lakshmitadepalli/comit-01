package com.comit.course_03_arrays;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//1st way to create an array when we know the initial values
		// arrays are not resizable--drawback--so java provided ArrayList
		int[] a= {4,5,6,7,8,9,9,67};
		/*for (int i=0;i<a.length;i++) {
			int j=a[i];
			System.out.println(j);
		}*/
		/*for (int i:a) {
			System.out.println(i);
		}*/
		//prints memory address
		//System.out.println(a);
		
		//java library arrays prints out the elements of the array in one line
		a[7]=-1;
		//another way of creating an array when i don't know the initial values
		int[] c = new int[10];
		c[4]=107;
		c[c.length-1]=108;
		//cannot add a invalid index
		//c[11]=108;
		System.out.println(Arrays.toString(c));
		//add a new line manually
		/*for (int i :a) {
			System.out.print(i +  "/n");
		}*/
		String [] brands= {"Toyota","Ford","Nissan","BMW"};
		String[] d=new String[4];
		d[0]="john";
		d[1]="george";
	
		System.out.println(Arrays.toString(d));
		

	}

}

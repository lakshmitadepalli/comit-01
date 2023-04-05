package com.comit.course_tryouts;
import java.util.*;
import java.io.*;

public class Expression {
	
	//import java.lang.Math;
	//import java.lang.Object;

	
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int value= a+ (int)(Math.pow(2,0))*b;
	            System.out.print(value + " ");
	            for(int j=1;j<n;j++){
	                System.out.print(value+(int)(Math.pow(2,j))*b);
	                value=value+(int)(Math.pow(2,j))*b;
	                System.out.print(" ");
	            }
	            System.out.println(value);
	        }
	        
	        in.close();
	    }
	}



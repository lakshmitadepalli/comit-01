package com.comit.course_04_strings;

public class Strings {
	/* A string is a data structure that holds a sequence of characters
	 * more info
	 * Strings are immutable - cannot change.
	 * java is case sensitive
	 * https://docs.oracle.com/en/java/javase/17docs/api/java.base/java/lang/String.html
	 */

	public static void main(String[] args) {
		char[] chars= {'c','o','m','i','t'};
		String str0= new String(chars);
		System.out.println(str0);
		/*declare variable and initialize it*/
		String str1="comit";
		System.out.println(str1);
		System.out.println(str1.length());
		/*string concatenation */
		String str2="Hello";
		String str3=str2+ "   " +str1;
		System.out.println(str3);
		String str4 = str2.concat(str1).concat(",  I Love Java." );//more object oriented
		System.out.println(str4);
		String str5 = "     Hello    ";
		System.out.println("---->"+ str5.trim()  + "<----");
		System.out.println("--->"+str5 +"<----");
		/*grabs a string character*/
		String str6="Hello";
		System.out.println(str6.charAt(3));
		//checks if a string is a substring of another string.
        System.out.println(str6.contains("el"));
        //string comparison
        System.out.println(str6.equals("Hello"));
        //It ignores the case of a string we want to compare
        System.out.println(str6.equalsIgnoreCase("hello"));
        //we can use replace to replace whole string or portion of the string
        System.out.println(str6.replace("He", "XO"));
        String str7="Comit,  I love java";
        System.out.println(str7.substring(9,14));
	}

}

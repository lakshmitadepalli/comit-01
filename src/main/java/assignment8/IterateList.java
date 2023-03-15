package assignment8;
/*Write a Java program to iterate through all elements in a array list.*/

import java.util.ArrayList;

public class IterateList {

	public static void main(String[] args) {
		ArrayList <String> iterate = new ArrayList<>();
		iterate.add("Lotus");
		iterate.add("Jasmine");
		iterate.add("Lily");
		iterate.add("Rose");
		System.out.println("Printing Arraylist using traditional for loop");
		for(int i=0;i<iterate.size();i++) {
			System.out.println(iterate.get(i));
			
		}
		System.out.println("Printing Arraylist using for each loop");
       for(String str: iterate) {
    	   System.out.println(str);
       }
       System.out.println("Printing the same array using for each very simple loop");
       iterate.forEach(e -> System.out.println(e));
       
       System.out.println("Another variation of foreach loop");
       iterate.forEach(System.out::println);
       
	}

}

package assignment8;

import java.util.ArrayList;
import java.util.List;

/*Write a Java program to retrieve an element (at a specified index) from a given array list. */
public class RetrieveList {

	public static void main(String[] args) {
		List<String> retrieve=new ArrayList<String>(5);
		retrieve.add("guitar");
		retrieve.add("violin");
		retrieve.add("piano");
		retrieve.add("sitar");
		retrieve.add("soprano");
		System.out.println(retrieve);
		String str=retrieve.get(2);
		System.out.println(str);
		

	}

}

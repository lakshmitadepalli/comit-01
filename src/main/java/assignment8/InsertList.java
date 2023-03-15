package assignment8;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to insert an element into the array list at the first position

public class InsertList {

	public static void main(String[] args) {
		
		List<String> insert= new ArrayList<String>();
		insert.add("ball");
		insert.add("bat");
		insert.add("soccer");
		insert.add("cock");
		
		insert.add(0,"net");
		System.out.println(insert);

	}

}

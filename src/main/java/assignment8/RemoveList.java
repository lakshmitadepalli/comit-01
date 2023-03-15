package assignment8;
//Write a Java program to remove the third element from a array list

import java.util.ArrayList;
import java.util.List;

public class RemoveList {

	public static void main(String[] args) {
		List<String> remove=new ArrayList<String>();
		remove.add("jack");
		remove.add("and jill");
		remove.add("wentup");
		remove.add("the mountain");
		remove.add("the hill");
		System.out.println("Beforing removing the third element");
		System.out.println(remove);
		remove.remove(3);
		System.out.println("After removing the third element");
		System.out.println(remove);
		
		
		

	}

}

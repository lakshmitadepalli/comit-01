package assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to sort a given array list.

public class SortList {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList<>();
		numbers.add(67);
		numbers.add(45);
		numbers.add(105);
		numbers.add(23);
		numbers.add(80);
		System.out.println("List before sort"+ numbers);
		
		Collections.sort(numbers);
		System.out.println("list after sort"+ numbers);
		
		
		

	}

}

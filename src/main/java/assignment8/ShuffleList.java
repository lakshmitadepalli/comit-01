package assignment8;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

//Write a Java program to shuffle elements in a array list.

public class ShuffleList {

	public static void main(String[] args) {
		List<Integer>numbers=new ArrayList<>();
		numbers.add(5);
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		System.out.println("numbers before shuffling" + numbers);
		Collections.shuffle(numbers);
		System.out.println("numbers after shuffling "+ numbers);
		Collections.shuffle(numbers);
		System.out.println("numbers after reshuffling"+ numbers);
		

	}

}

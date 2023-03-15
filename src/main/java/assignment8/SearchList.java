package assignment8;
//Write a Java program to search an element in a array list.

import java.util.ArrayList;
import java.util.List;

public class SearchList {

	public static void main(String[] args) {
		List <String> search =new ArrayList<String>();
		search.add("Ganga");
		search.add("yamuna");
		search.add("Godavari");
		search.add("saraswathi");
		search.add("narmada");
		System.out.println(search);
		if(search.contains("Godavari")) {
			System.out.println("Godavari is found");
		}else {
			System.out.println("Godavari is not found");
		}

	}

}

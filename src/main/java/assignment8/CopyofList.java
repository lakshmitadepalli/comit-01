package assignment8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a Java program to copy one array list into another
public class CopyofList {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		list1.add("cola");
		list1.add("Thumbsup");
		list1.add("Mr Pepper");
		list1.add("soda");
		list1.add("pepsi");
		System.out.println("List1 is"+ list1);
		List<String> list2=new ArrayList<String>();
		for (String str: list1) {
			list2.add(str);
		}
		
		System.out.println("List2 is"  +list2);
		
		List<String>list3=new ArrayList<String>();
		list3.add("pencil");
		list3.add("pen");
		list3.add("eraser");
		list3.add("sharpener");
		list3.add("box");
		System.out.println("My list 3 is" + list3);
		List<String> list4=new ArrayList<String>();
		list4.add("");
		list4.add("");
		list4.add("");
		list4.add("");
		list4.add("");
		
		Collections.copy(list4,list3);
		System.out.println("My List4 is" + list4);

	}

}

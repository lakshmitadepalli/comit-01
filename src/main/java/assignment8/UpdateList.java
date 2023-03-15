package assignment8;

import java.util.ArrayList;
import java.util.List;

public class UpdateList {

	public static void main(String[] args) {
		List<String> Update=new ArrayList<String>();
		Update.add("apple");
		Update.add("banana");
		Update.add("guava");
		Update.add("Kiwi");
		System.out.println("List before updating");
		System.out.println(Update);
		int index=Update.indexOf("banana");
		Update.set(index,"grapes");
		System.out.println("List after updating");
		System.out.println(Update);

	}

}

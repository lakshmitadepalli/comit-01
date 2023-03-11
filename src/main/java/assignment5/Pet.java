package assignment5;

import java.util.Objects;

public class Pet {
	
	String name;

	// constructor of class 1
	Pet(String name)
	{
	// Assignment of current attributes
	/// using this keyword with same
	this.name = name;
	}

	static Boolean equalsmethod(Pet dog1, Pet dog2){
	return Objects.equals(dog1, dog2);

	}

	boolean equalsOperator(Pet dog2){
	return (this==dog2);
	}

	public static void main(String[] args) {
		// Objects of class1 (auxiliary class)
		// are assigned value */
		Pet dog1 = new Pet("sai");
		Pet cat = new Pet("Jack");
		Pet dog2 = new Pet("sai");

		// Checking objects are equal and
		// printing output- true/false
		System.out.println(equalsmethod(dog1,dog2));
		System.out.println(dog1.equalsOperator(dog2));
	}

}

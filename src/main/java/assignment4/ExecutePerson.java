package assignment4;

import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

/*Make a class called Person with the following conditions:
Its attributes are: name, age, id, gender (M male, F female), 
weight and height. We do not want direct access to them. 
Think which access modifier is the most appropriate, also its type. If you want to add some extra attribute you can do it. 
By default, all attributes except the Id will be default values ​​according to their type (0 for numbers, empty string for String, etc.). 
Gender will be male by default, use a constant for it. Several constructors will be implemented: A default constructor.
A constructor with the name, age and gender, the rest by default. A constructor with all the attributes as parameters. 
The methods that will be implemented are: Calculate (): calculate if the person is at his ideal weight (weight in kg / (height ^ 2 in meters)), 
return -1 if he is below his ideal weight, 0 if he's at his ideal weight and 1 if he's overweight.
		Use constants to return these values. isOver18 (): indicates if it is of legal age, it returns a Boolean. 
		CheckGender(char gen): Check if the entered gender is correct. It will not be visible outside the class. 
		ToString (): returns all object information. GeneratesID (): generates a random number of 8 digits. 
		This method will be invoked when the object is built. You can split the method to make it easier for you. 
		It will not be visible outside the class. Setter of each attribute except ID. 
Now, create an executable class that does the following:
Ask by keyboard the name, age, gender, weight and height. Create 3 objects of the previous class. 
The first object will get the previous variables requested by keyboard,
the second object will get all the previous ones but the weight and height by default, 
and the last one everything by default. For the latter, use setter methods to give values to the attributes. 
For each object, you should check if you are at ideal weight, overweight or below ideal weight and show a message.
Indicate for each object if it is of legal age. Finally, display the information of each object.
You can use methods in the executable class, to make it easier for you.*/




class Person {
	
	static String name;
	  static int age=0;
	  static String id;
	public static  String gender;
	 static int weight=0;
	  static double height=0;
	  public static final String GENDER_MALE="male";
	
	  
	  
	  
	
	public static String getName(String name) {
		return name;
	}
	
	public static void setName(String name) {
		Person.name = name;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		Person.age = age;
	}
	
	
	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		Person.id = id;
	}

	public static int getWeight() {
		return weight;
	}
	public static void setWeight(int weight) {
		Person.weight = weight;
	}
	public static double getHeight() {
		return height;
	}
	public static void setHeight(double height) {
		Person.height = height;
	}
	
	public static String getGender() {
		return gender;
	}
	public static void setGender(String gender) {
		Person.gender = gender;
	}
	
	public static String getGenderMale() {
		return GENDER_MALE;
	}
	
	
	
	
public Person(){
	   this.name="";
	   this.age=0;
	   final String gender="male";
		
	}
  public Person(String name,int age,String gender) {
	   this.name=name;
	   this.age=age;
	   this.id=generateID();
	   
   }
   
	

public Person(String name, int age,  String gender, int weight, double height) {
	//super();
	this.name = name;
	this.age = age;
	
	this.weight = weight;
	this.height = height;
	this.setGender(gender);
}
void calculate() {
	double BMI;
	
	BMI=weight/(height*height);
	if(BMI>25.0) {
	System.out.println("This person is overweight" +"  " +  1);
	}else if(BMI> 18.5 && BMI < 24.9) {
		System.out.println("This person is healthy weight" +" " + 0);
	}else if(BMI<24.9) {
		System.out.println("This person is underweight" +"   "+  -1);
	} else if(weight==0 && height==0) {
		System.out.println("WEIGHT AND HEIGHT VALUES ARE NOT GIVEN TO THIRD PERSON");
	}
}
	Boolean isOver18() {
		if(age>18) {
			System.out.println("Age is over 18");
			return true;
		}else {
			System.out.println("Age is under 18");
			return false;
		}
	}
	void checkgender(String gender) {
		if(gender.equals("male")) {
			System.out.println("Entered gender is correct");
		}else {
			System.out.println("You entered the incorrect gender");
		}
	}
	public String generateID() {
		Random random=new Random();
		int idNum=random.nextInt(100000000);
		return String.format("%08d", idNum);
		
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", id=" + id + ", weight=" + weight + ", height=" + height
				+ "]";
	}
	
	
	
}


public class ExecutePerson {
	
	
	
	
	


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
	System.out.println("Enter name of 1st person :");
		String name=scan.nextLine();
		System.out.println("Enter age of  1st person : ");
		int age=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter gender of 1st person: ");
		String gender=scan.nextLine();
		
		System.out.println("Enter weight of 1st person in KGS : ");
		int weight=scan.nextInt();
		System.out.println("Enter height of 1st Person in metres :");
		double height=scan.nextDouble();
		Person obj=new Person(name,age,gender,weight,height);
		System.out.println("The details of the first person is");
		System.out.println("Name:"+obj.name);
		System.out.println("ID is  "+obj.generateID());
		System.out.println("Age:"+ obj.age);
		System.out.println("Gender:  "+obj.getGender());
		System.out.println("weight"+obj.weight);
		System.out.println("Height"+obj.height);
		obj.calculate();
		System.out.println(obj.isOver18());
		obj.checkgender(gender);
		Person obj2=new Person();
		obj2.setName("john");
		obj2.getId();
		obj2.setId(obj2.generateID());
		obj2.setAge(25);
		obj2.setGender("female");
		obj2.setWeight(55);
		obj2.setHeight(1.65);
		System.out.println("The details of the second person is");
		System.out.println(obj2);
		obj2.calculate();
		System.out.println(obj2.isOver18());
		System.out.println(obj2.getGender());
		scan.nextLine();
		
		System.out.println("Enter name of third person: ");
		String name1=scan.nextLine();
		scan.nextLine();
		System.out.println("Enter age: ");
		int age1=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter gender:");
		String gender1=scan.nextLine();
		
		Person obj3=new Person(name,age,gender);
		
		obj3.setName(name1);
		obj3.generateID();
		obj3.setAge(age);
		obj3.setGender(gender);
		obj3.setWeight(weight=0);
		obj3.setHeight(height=0);
		
		System.out.println("Details of the third person is");
		
		System.out.println("Name: " + Person.getName(name1)); 
		System.out.println("ID: " + obj3.getId());
		System.out.println("Age: " + obj3.getAge());
		System.out.println("Gender: " + obj3.getGender());
		System.out.println("Weight: " + obj3.getWeight());
		System.out.println("Height: " + obj3.getHeight());
		
		
		
		
		obj3.calculate();
		System.out.println(obj3.isOver18());
		obj3.checkgender(gender1);
		scan.close();
		
		
		
		

	}

}

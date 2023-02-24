package com.comit_06_oop;
/*A class is construction map or blueprint for creating objects.
 * A class has three types of elements. 
 * 1.Attributes
 * 2.constructors
 * 3.Methods
 */
class Employee{
	/*Attributes or fields or sometimes properties or instance variables
	 variables inside the class
	 A constructor has the same name of the class and returns nothing
	 types:
	 1. default
	 2. parameterized constructor
	 */
	Employee(){
		
	}
	Employee(int id, String name, double salary, String position) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
	}

	
	int id;
	
	String name;
	
	double salary;
	String position;
	 public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}

	/*Methods is a block of code that runs when it is called.
	 * return type- method name-parameters-block of code
	 * 
	 */
	/* to follow the encapsulation oop concept we should use getters and setters.*/
	 void display() { // method declaration or method signature
		 //method's body
		 // returns no value
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(salary);
		 System.out.println(position);
		 
		
	}
	
	double bonusEmployee(double percentage) {
		 // camel case is convention for naming variables,methods and classes
		 double empBonusCompany=(salary*percentage)/100;
		 return empBonusCompany;
	 }
	 
}


public class Myclass {

	public static void main(String[] args) {
		/*new keyword allocates memory for the object.
		 * 
		 */
		Employee emp1=new Employee();
		emp1.id=1020; /*Breaking the oop encapsulation concept*/
		emp1.name="John";//should not acces objects attributes directly from other classes
		emp1.salary=80000;
		emp1.position="Manager";
		emp1.display();
		double bonus=emp1.bonusEmployee(10);
		System.out.println("bonus:"+ bonus);
		// create emp2 from class employee
		Employee emp2 = new Employee();
		emp2.setId(1030);
		emp2.setName("Jane");
		emp2.setSalary(30000);
		emp2.setPosition("Team lead");
		emp2.display();
		double bonus1=emp2.bonusEmployee(8);
		System.out.println("bonus:"+ bonus1);
		Employee emp3= new Employee(1040,"Mike",90000,"General Accountant");
		emp3.display();
		double bonus2=emp3.bonusEmployee(10);
		System.out.println("bonus:"+ bonus2);
		

		
	}

}

package assignment5;


public class Person {
	 int id;
	 String name;
 
Person(String name,int id){
	this.name=name;
	this.id=id;
	
	
}
		

public boolean equals(Object obj) {
	Person a=(Person)obj;
	return name==a.name && id==a.id;
	
	
}
class Employee extends Person{

	Employee(String name, int id) {
		super(name, id);
		
	}
	
	
}




public static void main(String[] args) {
		Person obj=new Person("geetha",124);
		Person obj1=new Person("geetha",124);
		Employee obj2=obj1.new Employee("Hima", 125);
		Employee obj3=obj1.new Employee("Hima",125);
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));
		System.out.println(obj2==obj3);
		System.out.println(obj2.equals(obj3));
		
		
		
		
		
	}
		
		
		
		
	}



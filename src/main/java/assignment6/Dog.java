package assignment6;
//Build an interface called Animal.java. Build a Dog.java class that implements this interface.
/*Add the methods move () and eat () in the animal interface. None has to return anything, 
		just write something by console. Implement it and add everything you need to compile everything in the interface as well as the classes. 
		NOTE: The implementation of move () of the classes that extend from the interface Animal must be different, ie the method Dog.move () and Gato.move () 
		should not have the same behaviour. You can use the System.out.println () 
		to print something different in each case, such as saying who is moving for example.*/

interface Animal {
String print(String say);
void move();
void eat();


}

public class Dog implements Animal{
	static String name="Alexa";
	int age=9;
	
	@Override
	public String print(String say) {
		// TODO Auto-generated method stub
		say="I am a pet animal and very loyal";
		return say;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	void display() {
		System.out.println(name+" "+age);
	}
	void bark() {
		System.out.println("Dog barks loudly and disturbs neighbour");
	}

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.display();
		obj.print(name);
		obj.move();
		obj.eat();
		obj.bark();
		

	}

	@Override
	public void move() {
		System.out.println("Dog is moving 8 km/hr");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating fruits");
		
	}

	
	

}

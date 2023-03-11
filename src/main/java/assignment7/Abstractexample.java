package assignment7;
abstract class Myabstract{
	abstract void display();
}
class Child extends Myabstract{
	@Override
	void display() {
		System.out.println("I can create a child from abstract class");
		
	}
	void print() {
		System.out.println("this is child's method");
	}

}

public class Abstractexample {

	public static void main(String[] args) {
		Myabstract obj=new Child();
		obj.display();
		((Child) obj).print();

	}

}



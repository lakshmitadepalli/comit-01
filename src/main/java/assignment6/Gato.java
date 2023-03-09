package assignment6;
//Build a Gato.java class that also implements the Animal.java class.

public class Gato implements Animal{
	static String name="Alan";
	@Override
	public String print(String say) {
		
		return name;
	}
	

	public static void main(String[] args) {
		Gato obj=new Gato();
		obj.print(name);
		obj.move();
		obj.eat();

	}


	@Override
	public void move() {
		System.out.println("Gato is moving like a rocket");
		
	}


	@Override
	public void eat() {
		System.out.println("Gato don't eat food, it needs fuel");
		
	}

	

}

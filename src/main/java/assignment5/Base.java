package assignment5;

public class Base {
	Base(){
		
	}
	Base(int a,int b,int c){
		System.out.println(a+b+c);}
	 void  print(int i) {
		System.out.println("I am not overriden");
	}

class Derived extends Base{
	Derived(){
		
	}
	Derived(int g, int h){
		super(4,5,6);
		}
	}
@override
void static print(int i) {
	System.out.println("I am hidden ");
	
}
	
	public static void main(String[] args) {
		
		
	}
		
	
	}
	
	
	

	
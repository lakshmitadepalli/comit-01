package assignment5;

public class Base {
	int a;
	int b;
	int c;
	Base(){
		
	}
	
	
	 Base(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}


	void  print() {
		System.out.println(a + b + c);
	}

class Derived extends Base{
	Derived(){
		
	}
	Derived(int g, int h){
		super(4,5,6);
		}
	}
	
	public static void main(String[] args) {
		Base obj=new Base(123,125,128);
		obj.print();
		
		
	}
		
	
	}
	
	
	

	
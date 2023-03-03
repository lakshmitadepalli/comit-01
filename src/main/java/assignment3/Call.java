package assignment3;
//Write an algorithm that calls another, and the call prints a value.
class MethodPrint{
	 String a;
	int b;
	void printvalue(){
		a="Printing from method called";
		b=5;
		for(int i=0;i<b;i++) {
		System.out.println(a);
		
		
	}
}
public class Call {

	public static void main(String[] args) {
		MethodPrint obj3=new MethodPrint();
		obj3.printvalue();
	}
		

	}

}

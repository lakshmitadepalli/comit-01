package assignment5;

 class ClassA {
	 ClassA(int a,int b){
	int g=a+b;
		 System.out.println(g);
		 
	 }
	 
		 
	 }
	
	
class ClassB {
	public static int k=10;
	ClassB(int c ,int d){
		int h=c+d;
		System.out.println(h);
		
	}
}
	class ClassC extends ClassA{
		ClassC()
		{
			super(5,6);
			int f=8;
			int d=9;
			
		}
		
		
			

	public static void main(String[] args) {
		ClassC obj=new ClassC();

	}

}

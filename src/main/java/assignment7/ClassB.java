package assignment7;
class A{
	static int n=0;
	String f (A x) {
		return "AA"+(x.n++);
	}
	String f (ClassB x) {
		return "AB" +(x.n--);
	}
}

public class ClassB extends A{
	String f (ClassB x) {
		return "BB" + (x.n--);
	}

	public static void main(String[] args) {
		A o1=new A();
		A o2=new ClassB();
		System.out.println(o1.f((o2)));
		System.out.println(o2.f((o2)));
		System.out.println(o1.f ((ClassB) o2));
		System.out.println(o2.f ((ClassB) o2));
		
	}

}

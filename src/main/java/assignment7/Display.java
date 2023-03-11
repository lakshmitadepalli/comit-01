package assignment7;
import documents.Invoice;

import documents.Order;
import documents.UrgentOrder;





public class Display extends Invoice{

	Display(int invoiceno, String brands) {
		super(invoiceno, brands);
		
	}

	public static void main(String[] args) {
		Display obj2=new Display(127,"lux");
		Invoice obj=new Invoice(123,"puma");
		UrgentOrder  obj1=new UrgentOrder(124,"adidas");
		System.out.println(obj);
		
		System.out.println(obj2);
		obj1.setOrderno(123);
		obj1.setCname("puma");
		System.out.println(obj1);
		

	}

	

}

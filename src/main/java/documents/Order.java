package documents;
import documents.Invoice;


public class Order extends Invoice{
	
			public Order(int invoiceno, String brands) {
				super(invoiceno, brands);
				
			}
			public int orderno;
			public String cname;
			
			
			public int getOrderno() {
				return orderno;
			}
			public void setOrderno(int orderno) {
				this.orderno = orderno;
			}
			public String getCname() {
				return cname;
			}
			public void setCname(String cname) {
				this.cname = cname;
			}
			
			
			
			
			@Override
			public String toString() {
				return "Order [orderno=" + orderno + ", cname=" + cname + "]";
			}
			public static void main(String[] args) {
				
			}
		

}

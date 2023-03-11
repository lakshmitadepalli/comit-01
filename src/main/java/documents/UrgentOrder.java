package documents;

public class UrgentOrder extends Order {

	public UrgentOrder(int invoiceno, String brands) {
		super(invoiceno, brands);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "UrgentOrder [orderno=" + orderno + ", cname=" + cname + ", invoiceno=" + invoiceno + ", brands="
				+ brands + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

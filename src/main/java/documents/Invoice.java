package documents;

public class Invoice {
	 public int invoiceno;
	public String brands;
	
	public int getInvoiceno() {
		return invoiceno;
	}

	public void setInvoiceno(int invoiceno) {
		this.invoiceno = invoiceno;
	}

	public String getBrands() {
		return brands;
	}

	public void setBrands(String brands) {
		this.brands = brands;
	}
	public Invoice(int invoiceno, String brands) {
		super();
		this.invoiceno = invoiceno;
		this.brands = brands;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceno=" + invoiceno + ", brands=" + brands + "]";
	}
	
	public static void main(String[] args) {
		
	}
}

   
		
		
		
	

	



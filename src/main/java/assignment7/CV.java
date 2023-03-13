package assignment7;

public class CV extends Document {
	
	public CV(int sno, Document type) {
		super(sno, type);
		
	}







	int sno;
	String name;
	String select;
	
	
	
	public int getSno() {
		return sno;
	}


   public void setSno(int sno) {
		this.sno = sno;
	}


   public String getName() {
		return name;
	}


   public void setName(String name) {
		this.name = name;
	}


    public String getSelect() {
		return select;
	}


    public void setSelect(String select) {
		this.select = select;
	}
    
    public static void main(String[] args) {
		
	}

}

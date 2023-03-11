package assignment7;

public class CV extends Document {
	
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

    public CV(int sno, String name, String select) {
		super(sno, select);
		this.sno = sno;
		this.name = name;
		this.select = select;
	}


	public static void main(String[] args) {
		
	}

}

package assignment4;



class Books{
	String titleofbook;
	int numofcopies;
	int numoflend;
	Books(){  //default constructor
		
	}
	Books(String titleofbook,int numofcopies,int numoflend) {
		this.titleofbook=titleofbook;
		this.numofcopies=numofcopies;
		this.numoflend=numoflend;
	}
	public String getTitleofbook() {
		return titleofbook;
	}
	public void setTitleofbook(String titleofbook) {
		this.titleofbook = titleofbook;
	}
	public int getNumofcopies() {
		return numofcopies;
	}
	public void setNumofcopies(int numofcopies) {
		this.numofcopies = numofcopies;
	}
	public int getNumoflend() {
		return numoflend;
	}
	public void setNumoflend(int numoflend) {
		this.numoflend = numoflend;
	}
	
	public String toString() {
		return titleofbook + "  "+ numofcopies + "  " +numoflend;
	}
	boolean loan() {
		numofcopies--;
		
		
		if (numofcopies>0) {
			numoflend++;
			return true;
		}else 
			System.out.println(titleofbook+ "   "+ "not enough copies");
			return false;
		
	}
}


public class Mybooks1 {

	public static void main(String[] args) {
		Books b1=new Books();
		b1.setTitleofbook("Philosophers stone");
		b1.setNumofcopies(6);
		b1.setNumoflend(0);
		b1.loan();
		Books b2=new Books();
		b2.setTitleofbook("Deathly Hollows");
		b2.setNumofcopies(5);
		b2.setNumoflend(0);
		b2.loan();
		b2.loan();
		b2.loan();
		b2.loan();
		b2.loan();
		
		Books b3 =new Books();
		b3.setTitleofbook("Charlettes web");
		b3.setNumofcopies(4);
		b3.setNumoflend(0);
		b3.loan();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);


	}

}

package documents.HR;

import assignment7.CV;
import assignment7.Document;

public class Contract extends Document {
	int sno;
	String acceptance;
	int capacity;
	String legality;
	
	public int getSno() {
		return sno;
	}
    public void setSno(int sno) {
		this.sno = sno;
	}

   public String getAcceptance() {
		return acceptance;
	}
   public void setAcceptance(String acceptance) {
		this.acceptance = acceptance;
	}

   public int getCapacity() {
		return capacity;
	}

   public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

   public String getLegality() {
		return legality;
	}

   public void setLegality(String legality) {
		this.legality = legality;
	}



	Contract(int sno, String acceptance, int capacity, String legality) {
	super(capacity, legality);
	this.sno = sno;
	this.acceptance = acceptance;
	this.capacity = capacity;
	this.legality = legality;
}
	public static void main(String[] args) {
		Contract obj=new Contract(125,"A",10,"cleared");
		Contract ob1=new Contract(126,"NA",4,"Not cleared");
		Document obj2=new Document(125,"Contract");
       Document obj3=new Document(126,"CV");
       CV obj4=new CV(125,"selected", "A");
       CV obj5 =new CV(126,"Not selected","NA");
       System.out.println(obj);
       System.out.println(ob1);
       System.out.println(obj2);
       System.out.println(obj3);
       System.out.println(obj4);
       System.out.println(obj5);
       System.out.println("I am printing the hashcode. Please try this program later to display the right values");
	}

}

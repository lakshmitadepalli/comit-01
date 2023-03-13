package documents.HR;

import assignment7.CV;
import assignment7.Document;

public class Contract extends Document {
	public Contract(int sno, Document type) {
		super(sno, type);
		
	}
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
public static void main(String[] args) {
		
	}

}

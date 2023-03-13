package assignment7;

import java.util.Scanner;

 enum Documents{
	CV,CONTRACT;
}

public class Document {
	public int sno;
	public Document type;
	

   public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	
	
	
	

	public Document getType() {
		return type;
	}


	public void setType(Document type) {
		this.type = type;
	}


	public Document(int sno, Document type ){
		super();
		this.sno = sno;
		this.type = type;
	}


	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the document type");
		
		

	}

}

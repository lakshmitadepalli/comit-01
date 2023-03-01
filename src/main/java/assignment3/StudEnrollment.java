package assignment3;
import java.util.Scanner;
/*Make a program in JAVA such that given as data the enrollment and 5 grades 
 * of a student; Print the enrollment, the average and the word "approved"
if the student has an average greater than or equal to 6, 
and the word "not approved" otherwise. Data: MAT, CAL1, CAL2, CAL3, CAL4, 
CAL5 Where: MAT is an integer variable that represents 
the student's enrollment. CAL1, CAL2, CAL3, CAL4 and CAL5 are real-type variables representing the student's 5 grades.
 */
class StudentData{
	int MAT;
	double cal1;
	double cal2;
	double cal3;
	double cal4;
	double cal5;
	public int getMAT() {
		return MAT;
	}
	public void setMAT(int mAT) {
		MAT = mAT;
	}
	public double getCal1() {
		return cal1;
	}
	public void setCal1(double cal1) {
		this.cal1 = cal1;
	}
	public double getCal2() {
		return cal2;
	}
	public void setCal2(double cal2) {
		this.cal2 = cal2;
	}
	public double getCal3() {
		return cal3;
	}
	public void setCal3(double cal3) {
		this.cal3 = cal3;
	}
	public double getCal4() {
		return cal4;
	}
	public void setCal4(double cal4) {
		this.cal4 = cal4;
	}
	public double getCal5() {
		return cal5;
	}
	public void setCal5(double cal5) {
		this.cal5 = cal5;
	}
	void enrollment(int MAT) {
		System.out.println("Enrollment number : "+MAT);
	}
	double averageofgrades() {
		double avg=(cal1+cal2+cal3+cal4+cal5)/5;
		return avg;
	}
	void result(double avg) {
		if(avg>=6) {
			System.out.println("Approved");
		}else {
			System.out.println("Not Approved");
		}
	}
	
}

public class StudEnrollment {
	
	
	
public static void main(String[] args) {
	System.out.println("Please enter the Enrollment number :" );
	Scanner scan = new Scanner(System.in);
	int MAT=scan.nextInt();
	System.out.println("Enter the grade for cal1 : ");
	double cal1=scan.nextDouble();
	System.out.println("Enter the grade for cal2 :");
	double cal2=scan.nextDouble();
	System.out.println("Enter the grade for cal3 :");
	double cal3=scan.nextDouble();
	System.out.println("Enter the grade for cal4 :");
	double cal4=scan.nextDouble();
	System.out.println("Enter the grade for cal5 :");
	double cal5=scan.nextDouble();
	StudentData data=new StudentData();
	data.setMAT(MAT);
	data.setCal1(cal1);
	data.setCal2(cal2);
	data.setCal3(cal3);
	data.setCal4(cal4);
	data.setCal5(cal5);
	data.enrollment(MAT);
	double avg=data.averageofgrades();
	data.result(avg);
	scan.close();
	
		
		

	}

}

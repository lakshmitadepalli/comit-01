package assignment3;
import java.util.Arrays;
import java.util.Scanner;
/*Make a program that asks for the salary of N workers 
(first you must ask how many workers there are) and 
print the one with the highest salary.*/
class Salary{
	static double salary[];
	 static double max;
	 static int empno;
	public double[] getSalary() {
		return salary;
	}
	public void setSalary(double[] salary) {
		this.salary = salary;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	
	void sortsalary() {
	
		 max=salary[0];
		for(int i=0;i<empno;i++) {
			
		if(salary[i]>max) {
			max=salary[i];
			
			
		}
		
	}
		System.out.println("The highest salary is"+ max);
		
	
}
}
public class HighestSalary {

	public static void main(String[] args) {
		double max;
		Salary obj=new Salary();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int empno=scan.nextInt();
		
		obj.setMax(empno);
		double salary[]=new double[empno];
		for (int i=0;i<empno;i++) {
			obj.setSalary(salary);
			System.out.println("Enter the employee:"+(i+1)+ "salary:");
			salary[i]=scan.nextDouble();
			System.out.println(Arrays.toString(salary));
			
			
			
		}
		obj.sortsalary();
		scan.close();
		
		
		
		
		
		
			
		
		
		

	}

}

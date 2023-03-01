package assignment3;

import java.util.Scanner;

/*Calculate the salary increase for a group of employees of a company 
 * considering the following criteria: If the salary is less than $ 1,000.00: 
 * Increase 15% If the salary is greater than or equal to $ 1,000.00: 
 * Increase 12% The program must do The following: 
 * - Save the new salaries in the arrangement - 
 * Calculate the payroll - Print the salaries from the settlement
 */
class EmpSalary{
	String ename;
	double salary;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	double updatesalary() {
		if(salary<=1000) {
			salary=salary+(salary*0.15);
			return salary;
		}else {
			salary=salary+(salary*0.12);
			return salary;
		}
	}
	
	
}

public class EmpSettlement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no. employees in your company");
		int empno=scan.nextInt();
		
		
		

}
}
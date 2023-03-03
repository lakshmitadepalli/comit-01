package assignment3;

import java.util.Scanner;

/*Calculate the salary increase for a group of employees of a company 
 * considering the following criteria: If the salary is less than $ 1,000.00: 
 * Increase 15% If the salary is greater than or equal to $ 1,000.00: 
 * Increase 12% The program must do The following: 
 * - Save the new salaries in the arrangement - 
 * Calculate the payroll - Print the salaries from the settlement
 */
class EmpSalary1{
	 String ename;
	 double salary;
	 double salary1;
	
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
			salary1=(salary)*15/100;
			salary=salary1+salary;
			return (salary);
		}else {
			salary1=(salary)*12/100;
			salary=salary1+salary;
			return (salary);
		}
	}
	
	
}

public class EmpSettlement {

	public static void main(String[] args) {
		EmpSalary1 obj=new EmpSalary1();
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no. employees in your company");
		int empno=scan.nextInt();
		
		for(int i=0;i< empno;i++) {
			scan.nextLine();
			System.out.println("Enter employee"+(i+1)+"name");
			String ename=scan.nextLine();
			
			System.out.println("Enter employee "+ (i+1) + "  "+"salary :");
			double salary=scan.nextDouble();
			obj.setEname(ename);
			obj.setSalary(salary);
			
			double payroll=obj.updatesalary();
			System.out.println("The new payroll is:"+payroll);
			
			
		}
		
		scan.close();
		
		

}
}
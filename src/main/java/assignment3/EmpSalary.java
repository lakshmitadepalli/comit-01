package assignment3;
import java.util.Scanner;
/*Make the program in JAVA such that given as a worker's salary, 
 * apply a 15% increase if your salary is less than $ 1000 and 12% 
 * otherwise. Print the new salary of the worker. 
 * Fact: SUE (variable of real type that represents the salary of the worker).
 */
class Calsalary{
	double salary;
	double salary1;
	int empID;
	String name;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary1() {
		return salary1;
	}
	public void setSalary1(double salary1) {
		this.salary1 = salary1;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void empnumber() {
		System.out.println( "employee number is :"+empID);
	}
	void empname() {
		System.out.println("employee name is:"+name);
	}
	void newsalary() {
		if(salary<=1000) {
			salary1=(salary)*15/100;
			salary=salary1+salary;
			System.out.println(salary);
		}else {
			salary1=(salary)*12/100;
			salary=salary1+salary;
			System.out.println(salary);
		}
	}
	
}

public class EmpSalary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the employee id");
		int empID=scan.nextInt();
		System.out.println("Enter the employee name");
		String name=scan.nextLine();
		scan.nextLine();
		System.out.println("Enter the employee salary");
		double salary=scan.nextDouble();
		Calsalary new1=new Calsalary();
		new1.setEmpID(empID);
		new1.setName(name);
		new1.setSalary(salary);
		//new1.setSalary1(salary);
		System.out.println("The new salary is:");
		new1.newsalary();
		scan.close();
		
		

	}

}

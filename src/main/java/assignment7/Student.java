package assignment7;

enum Career{
	COMPUTERSCIENCE,PHYSICS,CHEMISTRY;
	
}

public class Student extends Person{
	
	Career career;
	int avggrade;
	
	
	
	Student(String id, String name, String lastname, int age, Career career , int avggrade) {
		super(id, name, lastname, age);
		this.career = career;
		this.avggrade = avggrade;
		
	}
	
	

  public Career getCareer() {
		return career;
	}

 public void setCareer(Career career) {
		this.career = career;
	}

 public int getAvggrade() {
		return avggrade;
	}

 public void setAvggrade(int avggrade) {
		this.avggrade = avggrade;
	}








	@Override
public String toString() {
	return "Student [career=" + career + ", avggrade=" + avggrade + ", id=" + id + ", name=" + name + ", lastname="
			+ lastname + ", age=" + age + "]";
}



	public static void main(String[] args) {
		Student obj=new Student("124","john","dep",16,Career.PHYSICS,8);
		System.out.println(obj);
		

	}

}

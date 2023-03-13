package assignment7;

abstract class Person {
	String id;
	String name;
	String lastname;
	int age;
	

	Person(String id, String name, String lastname, int age) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}
	
  public String getId() {
		return id;
	}

  public void setId(String id) {
		this.id = id;
	}

  public String getName() {
		return name;
	}

  public void setName(String name) {
		this.name = name;
	}
  public String getLastname() {
		return lastname;
	}
  public void setLastname(String lastname) {
		this.lastname = lastname;
	}
  public int getAge() {
		return age;
	}

  public void setAge(int age) {
		this.age = age;
	}



	public static void main(String[] args) {
		
	}

}

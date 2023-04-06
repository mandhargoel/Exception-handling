package OOPS.ExceptionHandling;

public class Student {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age ;
	}
	public void setAge(int age) throws Exception {
		if(age<0) {
			throw new Exception("Age can't be negetive");
		}
		this.age = age;
	}

}

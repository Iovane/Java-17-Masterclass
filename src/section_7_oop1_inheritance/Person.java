package section_7_oop1_inheritance;

public class Person {

	private String firstName;
	private String lastName;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 100) age = 0;

		this.age = age;
	}

	public boolean isTeen(){
		return this.getAge() > 12 && this.getAge() < 20;
	}

	public String getFullName(){
		if (this.firstName.isEmpty()) return this.lastName;
		if (this.lastName.isEmpty()) return this.firstName;

		return this.firstName + " " + this.lastName;
	}
}

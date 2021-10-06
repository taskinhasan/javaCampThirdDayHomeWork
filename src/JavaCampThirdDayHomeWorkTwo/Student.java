package JavaCampThirdDayHomeWorkTwo;

public class Student extends User{
	
	private int age;
	private String schoolName;
	private int schoolNumber;
	private String firstName;
	private String lastName;
	
	public Student() {
		super();
		this.age = age;
		this.schoolName = schoolName;
		this.schoolNumber = schoolNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getSchoolNumber() {
		return schoolNumber;
	}
	public void setSchoolNumber(int schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
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
	
	
	
	
	

}

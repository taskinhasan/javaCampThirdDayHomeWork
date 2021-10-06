package JavaCampThirdDayHomeWorkTwo;

public class StudentManager {
	public void schoolChange(Student student) {
		
		System.out.println(student.getUserName() + " kullanıcının okulu " + student.getSchoolName() );
	}
	public void schoolNumber (Student student) {
		System.out.println(student.getUserName() + " kullanıcının okul numarası " + student.getSchoolNumber() ) ;
	}
	
}

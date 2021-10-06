package JavaCampThirdDayHomeWorkTwo;

public class Main {

	public static void main(String[] args) {
		Student ahmet = new Student();
		ahmet.setUserId(1);
		ahmet.setFirstName("Ahmet");
		ahmet.setLastName("Konyalı");
		ahmet.setAge(20);
		ahmet.setSchoolName("Yenikent Lisesi");
		ahmet.setSchoolNumber(13);
		ahmet.setUserName("Ahmet.06");
		ahmet.setUserPassword("123456");
		ahmet.setEmail("ahmet.06@gmail.com");
		
		
		
		
		Instructor engin = new Instructor();
		engin.setFirstName("Engin");
		engin.setLastName("Demiroğ");
		engin.setAge(30);
		engin.setUserName("Engin02");
		engin.setBranch("Java Devops");
		engin.setCertificate("ABC Sertifikası");
		
		
		
		User [] users = {ahmet, engin};
		
		for (User i : users) {
			
		System.out.println("Kullanıcılar : " + i.getUserName());
		}
 		
		
		
		StudentManager ahmetmanager = new StudentManager ();
		ahmetmanager.schoolChange(ahmet);
		ahmetmanager.schoolNumber(ahmet);
		
		
		
	}
	 

}

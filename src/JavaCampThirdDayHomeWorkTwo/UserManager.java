package JavaCampThirdDayHomeWorkTwo;

public class UserManager {
	public void addUser(User user) {
		System.out.println("Kullanıcı eklendi: " + user.getUserName());
		
	}
	public void deleteUser(User user) {
		System.out.println("Kullanıcı silindi: " + user.getUserName());
	}
	public void instructorStudent(User user) {
		System.out.println("öğreni :" + user.getUserName());
	}
}

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.id = 2;
		student.firstName = "Hamidin";
		student.lastName = "Küçükoðlu";
		student.userName = "HamidinK34";
		student.eMail = "hamidink12@gmail.com";
		student.password = "HamidinKodlamaio1";
		student.age = 16;
		student.address = "Kocaeli/Çayýrova";
		student.courseTaken = "Java + React";
		student.campCompletionPercentage = 48;
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.firstName = "Engin";
		instructor.lastName = "Demiroð";
		instructor.userName = "EnginD21";
		instructor.eMail = "engind21@gmail.com";
		instructor.password = "EnginKodlamaio1";
		instructor.courseGiven = "Java + React";
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.updateProfile(instructor);
		instructorManager.addNewCamp("Java Mobil");
		instructorManager.deleteOldCamp("Programlamaya Giriþ için Temel Kurs");
		instructorManager.updateCamp("C# + Angular");
		
		StudentManager studentManager = new StudentManager();
		studentManager.updateProfile(student);
		studentManager.subscribe("Uygulama Yazýlýmcýlýðý");
		studentManager.deleteSubscription("Web Yazýlýmcýlýðý");
	}

}

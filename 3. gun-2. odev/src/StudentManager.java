public class StudentManager extends UserManager{
	public void subscribe(String campName) {
		System.out.println(campName + " Aboneliğiniz onaylandı");
	}

	public void deleteSubscription(String campName) {
		System.out.println(campName + " Aboneliğiniz silindi");
	}
}

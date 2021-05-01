public class StudentManager extends UserManager{
	public void subscribe(String campName) {
		System.out.println(campName + " Aboneliðiniz onaylandý");
	}

	public void deleteSubscription(String campName) {
		System.out.println(campName + " Aboneliðiniz silindi");
	}
}

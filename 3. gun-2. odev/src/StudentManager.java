public class StudentManager extends UserManager{
	public void subscribe(String campName) {
		System.out.println(campName + " Aboneli�iniz onayland�");
	}

	public void deleteSubscription(String campName) {
		System.out.println(campName + " Aboneli�iniz silindi");
	}
}

public class InstructorManager extends UserManager{
	public void addNewCamp(String campName) {
		System.out.println(campName + " Kamp�n�z duyuruldu");
	}
	
	public void deleteOldCamp(String campName) {
		System.out.println(campName + " Kamp� silindi");
	}
	
	public void updateCamp(String campName) {
		System.out.println(campName + " Kamp ayarlar� d�zenlendi");
	}
}

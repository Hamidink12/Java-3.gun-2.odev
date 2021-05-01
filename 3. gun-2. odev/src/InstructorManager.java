public class InstructorManager extends UserManager{
	public void addNewCamp(String campName) {
		System.out.println(campName + " Kampýnýz duyuruldu");
	}
	
	public void deleteOldCamp(String campName) {
		System.out.println(campName + " Kampý silindi");
	}
	
	public void updateCamp(String campName) {
		System.out.println(campName + " Kamp ayarlarý düzenlendi");
	}
}

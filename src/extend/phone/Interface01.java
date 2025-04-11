package extend.phone;

public class Interface01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MobilePhone mobilephone = new MobilePhone("000-1111-2222");
		System.out.println("電話番号は最大" + Phone.MAX_NUMBER_DIGITS + "桁です。");
		mobilephone.call("999-8888-7777");
		
		classTakePicture(mobilephone);
	}
	public static void classTakePicture(Camera camera) {
		camera.takePicture();
	}

}

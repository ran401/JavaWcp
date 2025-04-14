package extend.phone;

public class Interface02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MobilePhone mobilePhone = new MobilePhone("000-1111-2222");
		// Phoneインターフェースのデフォルトメソッドの呼び出し
		mobilePhone.call("110");
		mobilePhone.takePicture();
		mobilePhone.powerOff();
	}

}

package practice;
import extend.phone.MobilePhone;
import extend.phone.Phone;

public class Chapter15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		MobilePhone mobilephone = new MobilePhone("000-1111-2222");
		mobilephone.takePicture();
		mobilephone.call("99-8888-7777");
		mobilephone.powerOff();
		
		FlyingPhone flyingphone = new FlyingPhone(5) ;
		flyingphone.fly();
		Chapter15.staticCall(flyingphone, "000-1111-2222");
		flyingphone.powerOff();
		}

		public static void staticCall(Phone phone, String number) {
			phone.call(number);
		}
	

}

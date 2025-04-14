package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone,Flying {
	
	private int minute;
	
	public FlyingPhone (int minute) {
		this.minute = minute;
	}
	
	@Override
	public void fly(){
		System.out.println(minute + "分間、飛びます。");
	}
	
	@Override
	public void call(String number){
		System.out.println(number + " に電話します。通話できるのは飛んでいる間だけです。");
	}
	
	@Override
	public void powerOff() {
		System.out.println("飛んでいる場合は落下します。");
	}
	
}

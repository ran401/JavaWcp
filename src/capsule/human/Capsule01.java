package capsule.human;

public class Capsule01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		HumanNoCapsule human2 = new HumanNoCapsule("田中",28);
		System.out.println("名前は" + human2.name + ", 年齢は" + human2.age + "です。");
		
		human2.name = "中井";
		human2.age = 30;
		System.out.println("名前は" + human2.name + ", 年齢は" + human2.age + "です。");
		
		
		HumanCapsule human1 = new HumanCapsule("小林",32);
		human1.setName("中村");
		System.out.println("名前は" + human1.getName() + ", 年齢は" + human1.getAge() + "です。");
		
		
	}

}

package extend.animal2;

public class Abstract01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Dog pochi = new Dog("ポチ");
		pochi.eat();
		pochi.cry();
		
		Wildbird wildbird = new Wildbird();
		wildbird.eat();
		wildbird.cry();
	}

}

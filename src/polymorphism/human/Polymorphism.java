package polymorphism.human;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		Human sato = new Student("佐藤",17,70);
		System.out.println(sato.getProfile());
		
		Human tanaka = new Employee("田中",28,"システム部");
		System.out.println(tanaka.getProfile());
		
	}

}

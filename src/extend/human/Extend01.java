package extend.human;

public class Extend01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Human sugimoto = new Human("杉本",16);
		System.out.println("Humanクラスのメソッド：名前は、" + sugimoto.getName());
		
		Student sato = new Student("佐藤",17,70);
		System.out.println("Humanクラスのメソッド：名前は、" + sato.getName());
		System.out.println("Studentクラスのメソッド：" + sato.getStudentProfile());

		Employee tanaka = new Employee("田中",28,"システム部");
		System.out.println("Humanクラスのメソッド：名前は、" + tanaka.getName());
		System.out.println("Employeeクラスのメソッド：" + tanaka.getEmployeeProfile());
		
		Extend01.printName(sugimoto);
		Extend01.printName(sato);
		Extend01.printName(tanaka);
	}

	
	public static void printName(Human human) {
		System.out.println("名前は、" + human.getName());
	}
}

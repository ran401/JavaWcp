package practice;

public class Chapter16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// データを配列に格納
		Human[] h = new Human[] { 
				new Student(), 
				new Programmer(), 
				new Driver(), 
				new Teacher(), 
				new Doctor(),
		};

		// 寝ると体力が回復する
		for (Human hm : h) {
			hm.work();
			
			if (hm instanceof Programmer) {
//				Programmer hm2 = (Programmer)hm;
//				hm2.study();
				
				((Programmer)hm).study();
			}
		}
	}

}

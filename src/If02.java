
public class If02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number = 7;
		if (number < 5) {
			System.out.println(number + " は5未満です");
		} else if (number < 10) {
			System.out.println(number + " は5以上、10未満です");
		} else if (number < 15) {
			System.out.println(number + " は10以上、15未満です");
		} else {
			System.out.println(number + " は15未満でないです");
		}
	}

}

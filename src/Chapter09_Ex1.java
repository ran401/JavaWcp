
public class Chapter09_Ex1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a;
		int b;
		String hyoji = "";
		for( a = 1 ; a <= 9 ; a++ ) {
			for( b = 1 ; b <= 9 ; b++ ) {
				hyoji = hyoji + ( a + "*" + b + "=" + a*b + " "  );
			}
			System.out.println(hyoji);
			hyoji = "";
		}
	}

}

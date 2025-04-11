
public class Chapter08_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//曜日を表すString型の変数を定義し、 英単語で初期化する
		String day = "Friday";
		
		//英単語に該当する日本語で曜日を出力する
		//※「すべて大文字」「頭文字のみ大文字」で曜日の綴りに該当した場合、曜日とみなす
		//（すべて小文字、たとえば「friday」等は曜日とみなさない）
		//曜日以外の単語の場合は "曜日ではありません" を出力する

		switch (day) {
		
		//月曜
		case "Monday":
			System.out.println("月曜日");
			break;
		case "MONDAY":
			System.out.println("月曜日");
			break;
		//火曜
		case "Tuesday":
			System.out.println("火曜日");
			break;
		case "TUESDAY":
			System.out.println("火曜日");
			break;
		//水曜
		case "Wednesday":
			System.out.println("水曜日");
			break;
		case "WEDNESDAY":
			System.out.println("水曜日");
			break;
		//木曜
		case "Thursday":
			System.out.println("木曜日");
			break;
		case "THURSDAY":
			System.out.println("木曜日");
			break;
		//金曜
		case "Friday":
			System.out.println("金曜日");
			break;
		case "FRIDAY":
			System.out.println("金曜日");
			break;
		//土曜
		case "Saturday":
			System.out.println("土曜日");
			break;
		case "SATURDAY":
			System.out.println("土曜日");
			break;
		//日曜
		case "Sunday":
			System.out.println("日曜日");
			break;
		case "SUNDAY":
			System.out.println("日曜日");
			break;
		default:
			System.out.println("曜日ではありません");
		
		}
		
	}

}

package practice;

import java.sql.SQLException;

public class Chapter12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try {
			int array[] = { 1, 3, 5 };
			Chapter12.validIndex(array, 2);
			Chapter12.validIndex(array, 3);

			System.out.println("validIndexの呼び出し終了");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentExceptionが発生しました");
			e.printStackTrace();
		}

		
		try {
			throwSQLException();
		}catch(SQLException e) {
			System.out.println("SQLExceptionが発生しました");
			e.printStackTrace();
		}finally {
			System.out.println("throwSQLExceptionの呼び出し終了");
		}
			
		// tryを記述
		// ・throwSQLExceptionメソッドを呼び出す
		// catchを記述
		// ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
		// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力

		System.out.println("mainメソッド終了");

	}
	
	// validIndexメソッドを作成
	// ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
	// ・サイズの範囲外なら、IllegalArgumentExceptionをスロー
	public static void validIndex(int[] array,int index) {
		if ((index < 3) && (0 <= index)) {
			System.out.println("インデックス " + index + " の要素は " + array[index] + " です");
		}else {
			throw new IllegalArgumentException(index + "はサイズの範囲外です");
		}
	}

	public static void throwSQLException() throws SQLException {
		// SQLExceptionは、通常、SQLでエラーの場合に発生する例外
		throw new SQLException("SQLエラーです");
	}
	
	
}

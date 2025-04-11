
public class Chapter09_Ex2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        int a = 976;
        int b = 427;

        System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
	}
        
        // ユークリッドの互除法で最大公約数を計算するメソッド
        static int gcd(int c, int d) {
        	int e = 0;
        	if ( c > d ) {
        		e = c % d;
        		if (e == 0) {
        			return d;
        		}else {
        			gcd(d,e);     			
        		}
        	}else {
        		e = d % c;
        		if (e == 0) {
        			return c;
        		}else {
        			gcd(c,e);     			
        		}
        	}
        	return e;
	}

}

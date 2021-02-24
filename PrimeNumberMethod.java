package javaStudy;

public class PrimeNumberMethod {
	
	private static int divide;
	private static int result;
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		System.out.println(prime(6));
		
	}
	//素数メソッド
	public static String prime(int number) {
		
		divide = 2;
		result = 0;
		
		//判定値 ÷ ２~(判定値-1)全て行い、余りが０ならresultに1足していく。

		while(divide < number) {			
			if(number % divide == 0) {
				result ++;
				divide ++;
			}else {
				divide ++;
			}
		}
		
		
		if(number > 1) {			//素数の定義その① １より大きい自然数
			
			//素数の定義その② １と自分自身以外で割れる数がない。
			//ので、resultが１以上なら割れた数があるので素数ではない。
			if(result <= 0) {		
			return number + "は素数である";
			}else {
			return number + "は素数ではない";
			}
			
		}else {
			return number + "は１以下なので素数ではない";
		}

	}

}

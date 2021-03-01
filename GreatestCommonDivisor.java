package javaStudy;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println(gcdMethod(121,77));

	}

	
	public static int gcdMethod(int x,int y) {
		int z = 0;		//XとYを比較して大きい値をZに代入する。
		int divide = 0;	//割る数
		int gcd = 1; 

		if(x < 0) {		//負の自然数にも対応できるようにする処理。
			x = x * -1;
		}
		if(y < 0) {
			y = y * -1;
		}
		
		if(x > y) {		//XとYを比較する処理
			z = x;
		}else {
			z = y;
		}
		
			divide = z - 1;		//大きい値から割っていく。大きい約数から先に計算していく。
		
		while(divide > 0) {			//0まで繰り返す。という条件
			if(x % divide == 0   &&   y % divide == 0) {		//X÷d と　Y÷d の余りが０の時...				
				gcd = divide;
				break;
			}else {
				divide --;
			}			
		}
		
		return divide;
	}
}


package javaStudy;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		System.out.println(GCDmethod(-147,-105));

	}

	
	public static int GCDmethod(int X,int Y) {
		int Z = 0;		//XとYを比較して大きい値をZに代入する。
		int divide = 0;	//割る数
		int GCD = 1; 

		if(X < 0) {		//負の自然数にも対応できるようにする処理。
			X = X * -1;
		}
		if(Y < 0) {
			Y = Y * -1;
		}
		
		if(X > Y) {		//XとYを比較する処理
			Z = X;
		}else {
			Z = Y;
		}
		
			divide = Z - 1;		//大きい値から割っていく。大きい約数から先に計算していく。
		
		while(divide > 0) {			//0まで繰り返す。という条件
			if(X % divide == 0   &&   Y % divide == 0) {		//X÷d と　Y÷d の余りが０の時...				
				GCD = divide;
				break;
			}else {
				divide --;
			}			
		}
		
		return divide;
	}
}


package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class RSPgame2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		2-1　じゃんけんゲームを作る。
		Scanner s = new Scanner(System.in);
		int myHand = s.nextInt();
		
		Random r = new Random();
		int computer = r.nextInt(3)+1; //[1:グー][2:チョキ][3:パー]
		System.out.println("computer："+computer);	//テスト用
		
		if(myHand - computer == 0) {	//myHand==computerでも可
			System.out.println("あいこ");
		}else if((myHand - computer +3)%3 ==1) {
			System.out.println("負け");
		}else if((myHand - computer +3)%3 == 2) {	//else{処理}でいいが、勉強のため記述
			System.out.println("勝ち");
		}
	}

}

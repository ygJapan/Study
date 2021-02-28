package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class TypeGame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1-0
			//ランダムで文字を出す。　に対して、コンソール画面で文字を入力
			//合ってたら「あたり」　間違い「はずれ」
			//ローマ字出力,入力
		//1-1 5回繰り返す。
		//1-2 タイマー機能
		//1-3 １文字/秒　のスコア表示
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		String oneokrock[]= {"oneokrock","taka","toru","ryota","tomoya"};
//		boolean judge = true;
		
		int i = r.nextInt(5);
		System.out.println(oneokrock[i]);
		String type = s.next();
		
		if(type == oneokrock[i]) {	//String用の==調べる
			System.out.println("あたり");
		}else {
			System.out.println("はずれ");
		}
		
		
	}

}

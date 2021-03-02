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
			//おまけ　Thread.sleep()を使って、タイプミスで2秒止めて見た。
		
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		String oneokrock[]= {"EyeoftheStorm","StandOutFitIn","HeadHigh","GrowOldDieYoung","PushBack","WastedNights","Change","LettingGo","WorstinMe","IntheStars","Giants","TheLastTime"};
		int cLength = 0;
		long startTime = System.currentTimeMillis();//タイマースタート
		for(int i=0; i < 5; i++) {
		int rInt = r.nextInt(11);
		System.out.println(oneokrock[rInt]);
		String type = s.next();
		
		if(type.equals(oneokrock[rInt])) {//String用の比較の場合は ->文字列.equals(文字列)
			System.out.println("あたり");
		}else {
			System.out.println(" 'はずれ' 2秒ペナルティ!!");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
		cLength = cLength + type.length();
		
		}
		long endTime = (System.currentTimeMillis());
		System.out.println("---終了---");
		long time = (endTime-startTime)/1000;
		System.out.println("記録：" + time + "秒");
		System.out.println(cLength/time + "文字/秒");
		
	}

}

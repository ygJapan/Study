package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class RSPgame {

	public static void main(String[] args) {
		System.out.println("computerとじゃんけんをしよう！");
		System.out.println("1か2か3を入力してね");
		System.out.println("1がグー,2がチョキ,3がパーだよ");
		System.out.println("じゃあ、始めるよ");
	
//		2-1　じゃんけんゲームを作る。（ScannerとRandom使用）
//		2-2　あいこの場合はじゃんけんしなおす
//		2-3　3回どちらかが勝つまでじゃんけん
//		2-4　3回勝てたらおみくじ引ける。
//		条件　myHand自分 :computer相手
//		1グー　：　1グーはあいこ　2チョキは勝ち　3パーは負け
//		2チョキ　：　1グーは負け　2チョキはあいこ　3パーは勝ち
//		3パー　：　1グーは勝ち　2チョキは負け　3パーはあいこ
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		int myWin = 0;
		int computerWin = 0;
		
		
		while(true) {

			if(myWin >= 3) {
				System.out.println("-----------------------------------");
				System.out.println("3回勝ったからおみくじが引けたよ。結果は" + ExcLuckmethod());
				System.out.println("-----------------------------------");
				break;
			}else if(computerWin >= 3){
				System.out.println("--------------------");
				System.out.println("残念。あなたの負けです");
				System.out.println("--------------------");
				break;
			}
			System.out.println("じゃんけん...");
			int computer = r.nextInt(3)+1;	//「1:グー」「2:チョキ」「3:パー」
			int myHand = s.nextInt();
			System.out.println("ポン");
			
			if(myHand == 1) {	//自分がグーの場合
				
				if(computer == 1) {
					System.out.println("相手は"+ computer + "なのであいこ");

					
				}else if(computer == 2){
					System.out.println("相手は"+ computer + "なので勝ち");
					myWin ++;
					System.out.println("現在あなた:" + myWin + " " + "コンピュータ：" + computerWin);
					
				}else if(computer == 3){
					System.out.println("相手は"+ computer + "なので負け");
					computerWin ++;
					System.out.println("現在あなた:" + myWin + " " + "コンピュータ：" + computerWin);
				}
				
				
			}else if(myHand == 2) {
				
				if(computer == 1) {
					System.out.println("相手は"+ computer + "なので負け");
					computerWin ++;
					System.out.println("現在あなた:" + myWin + " " + "コンピュータ：" + computerWin);
				}else if(computer == 2){
					System.out.println("相手は"+ computer + "なのであいこ");
					
				}else if(computer == 3){
					System.out.println("相手は"+ computer + "なので勝ち");
					myWin ++;
					System.out.println("現在あなた:" + myWin + " " + "コンピュータ：" + computerWin);
				}
					
			}else if(myHand == 3) {
					
				if(computer == 1) {
					System.out.println("相手は"+ computer + "なので勝ち");
					myWin ++;
					System.out.println("現在あなた:" + myWin + " " + "コンピュータ：" + computerWin);
				}else if(computer == 2){
					System.out.println("相手は"+ computer + "なので負け");
					computerWin ++;
					System.out.println("現在あなた:" + myWin + " " + "コンピュータ：" + computerWin);
				}else if(computer == 3){
					System.out.println("相手は"+ computer + "なのであいこ");
				}
			}
		}
		
	}

	private static String ExcLuckmethod() {
		// TODO 自動生成されたメソッド・スタブ
		Random r = new Random();
	    int number = r.nextInt(6);

	    	
	    	if(number == 1) {
	    		return("中吉");
	    	}else if(number == 2) {
	    		return("小吉");
	    	}else if(number == 3) {
	    		return("吉");
	    	}else if(number == 4) {
	    		return("末吉");
	    	}else if(number == 5) {
	    		return("凶");
	    	}else if(number == 6) {
	    		return("大凶");
	    	}else{
	    		return("...おめでとう!大吉だよ!");
	    	}
		
	}
}

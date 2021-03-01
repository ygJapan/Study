package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class FingerSmap {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int totalFinger = 4;			//自分と相手の指の数
		int myTotalFinger = 2;			//自分の指の数
		int computerTotalFinger = 2;	//相手の指の数
		int myNumber = 0;				//自分の宣言する値
		int myFinger = 0;				//自分が出す指の数
		int computerFinger = 0;			//相手の宣言する値
		int computerNumber = 0;			//相手が出す指の数
		
		for(;myTotalFinger > 0 ||computerTotalFinger > 0;) {
		
			System.out.println("あなたの残機："+ myTotalFinger +" 相手の残機：" + computerTotalFinger);
			System.out.println("---あなたの番です。---");
			System.out.println("いっせーっせーの?(0~" + totalFinger + "を入力してください)");
			myNumber = s.nextInt();
			
			System.out.println("あなたが出す指の数は？(0~" + myTotalFinger + "を入力してください。)");
			myFinger = s.nextInt();
			
			computerFinger = r.nextInt(computerTotalFinger+1);	//ランダムで相手が指を出す。
			System.out.println("(相手は"+ computerFinger + "本指を出した。)" + "合計：" + (myFinger + computerFinger) + "本");

			
			if(myNumber == myFinger + computerFinger) {
				System.out.println("お見事");
				totalFinger --;
				myTotalFinger --;
				if(myTotalFinger == 0) {						//試合の途中でも、自分が2回当てたらそこで終了。
					break;
				}	
			}else {
					System.out.println("残念");
			}
				
			System.out.println("あなたの残機："+ myTotalFinger +" 相手の残機：" + computerTotalFinger);
			System.out.println("---相手の番です。---");
			System.out.println("あなたが出す指の数は？(0~" + myTotalFinger + "を入力してください。)");
			myFinger = s.nextInt();		
			
			computerFinger = r.nextInt(computerTotalFinger+1);	//ランダムで相手が指を出す。
			computerNumber = r.nextInt(totalFinger+1);
			System.out.println("いっせーっせーの?" + "　『" +computerNumber + "』");
			System.out.println("(相手は"+ computerFinger + "本指を出した。)" + "合計：" + (myFinger + computerFinger) + "本");
			
			if(computerNumber == myFinger + computerFinger) {
				System.out.println("残念");
				totalFinger --;
				computerTotalFinger --;
			}else {
				System.out.println("お見事");
			}
			
		}
			
			System.out.println("---終了---");
			if(myTotalFinger == 0) {
				System.out.println("勝者:あなた！");			
			}else {
				System.out.println("勝者:コンピュータ!");	
			}
	}

}

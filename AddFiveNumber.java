package javaStudy;

import java.util.Scanner;

public class AddFiveNumber {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		3 数字の入力を5回繰り返して、合計した値を表示させる
//		※s.nextInt　の記述は1回だけ
		Scanner s = new Scanner(System.in);
		int add = 0;
		int number = 0;
		System.out.println("5回数字を入力してね");
		
		for(int count= 0; count < 5; count ++) {
			System.out.println((count+1) + "つ目の数字は？");
			number = s.nextInt();
			add = add + number;
		}
		
		System.out.println("合計した値は "+ add + " だよ");
	}

}

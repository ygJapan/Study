package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//2つの1~10のランダムな数字の合計値が11以上かどうかを予測して入力「あたり」「はずれ」を表示
//		(11以上の時:1 ,  11以下の時:2 で入力など)
		
		 Scanner s = new Scanner(System.in);
		  Random r = new Random();
		 

		  int y = r.nextInt(10)+1;
		  int z = r.nextInt(10)+1;
		  
		
		  int x = s.nextInt();
		if(x == 1) {
			if(y + z >= 11) {
				System.out.println("あたり");//⚪︎
			}else {
				System.out.println("はずれ");	//⚪︎
			}
		}else if(x == 2){
			if(y + z >=11) {
				System.out.println("はずれ");//⚪︎
			}else {
				System.out.println("あたり");//⚪︎
			}
			
		}
		System.out.println(y +","+ z);
	}

}

package javaStudy;

import java.util.Random;
import java.util.Scanner;

public class OmikujiGame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//「大吉」「中吉」「小吉」「末吉」「吉」「凶」「大凶」
		
		Scanner s = new Scanner(System.in);
		  Random r = new Random();
		 

		  int y = r.nextInt(7);
		  
//		  if(y == 0) {
//			  System.out.println("大吉");
//		  }else if(y == 1) {
//			  System.out.println("中吉");
//		  }else if(y == 2) {
//			  System.out.println("小吉");
//		  }else if(y == 3) {
//			  System.out.println("末吉");
//		  }else if(y == 4) {
//			  System.out.println("吉");
//		  }else if(y == 5) {
//			  System.out.println("凶");
//		  }else if(y == 6) {
//			  System.out.println("大凶");
//		  }
		  
		  String Number[] = {"大吉","中吉","小吉","末吉","吉","凶","大凶"};
		  System.out.println(Number[y]);
		  System.out.println(y);
		  
	}
	

}

package javaStudy;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		[九九配列]メインからメソッドに数字を渡してその数字の段の答えが入った配列をメインに返す
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		System.out.println("-----" +number + " の段の答えの表示-----");
		
		int Table[];
		Table = multiMethod(number);
		for(int i=0; i < 9; i ++) {
			System.out.println(Table[i]);			
		}
		
		System.out.println("----- " +number + " の段の答えの表示-----");
	}
	private static int[] multiMethod(int number) {
		// TODO 自動生成されたメソッド・スタブ
		int multiTable[] = new int[9];
		
		for(int i=0; i<9; i ++) {
			multiTable[i] = number * (i+1);
		}
		
		return multiTable;		
	}
		

}

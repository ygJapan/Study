package javaStudy;

import java.util.Scanner;

public class ArrayMinimum {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		 [配列の最小値]メインから適当な数字を入れた配列をメソッドに渡し、その中の最小値をメインに返す。
		int numberArray[] = {21,132,312,45,65,43,74,345,75,24,67,5,74,24};
		System.out.println("最小値は" + minimum(numberArray));
		
	}

	private static int minimum(int number[]) {
		// TODO 自動生成されたメソッド・スタブ
		int min = number[0];
		for(int i =0;i < number.length; i++) {
			if(min > number[i]) {
			min = number[i];
		}
			
		}
		return min;
		
	}
	

}

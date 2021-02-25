package javaStudy;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Scanner s = new Scanner(System.in);
		
	    System.out.println("文字を入力して下さい。");

	    Scanner scan = new Scanner(System.in);

//	    String str = scan.next();
//	    System.out.println("最初のトークンは: "+ str);
	    
	    int val = scan.nextInt();
	    System.out.println("最初の数値のトークンは: "+ val); 
	    
//	    str = scan.next();
//	    System.out.println("次のトークンは  : "+ str);
	    
	    val = scan.nextInt();
	    System.out.println("次の数値のトークンは  : "+ val);
	    
	    	
	  }
	

}

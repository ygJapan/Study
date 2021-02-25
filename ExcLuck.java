package javaStudy;

import java.util.Random;

public class ExcLuck {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		1-1　おみくじで大吉が出るまで引き続ける。
//		1-2　何回引いたかを出す。
//		「0:大吉」「1:中吉」「2:小吉」「3:吉」「4:末吉」「5:凶」「6:大凶」

		Random r = new Random();
	    int number = r.nextInt(6);
	    int count = 0;

	    while(number > 0) {
	    	
	    	if(number == 1) {
	    		System.out.println("中吉");
	    		count ++;
	    	}else if(number == 2) {
	    		System.out.println("小吉");
	    		count ++;
	    	}else if(number == 3) {
	    		System.out.println("吉");
	    		count ++;
	    	}else if(number == 4) {
	    		System.out.println("末吉");
	    		count ++;
	    	}else if(number == 5) {
	    		System.out.println("凶");
	    		count ++;
	    	}else if(number == 6) {
	    		System.out.println("大凶");
	    		count++;
	    	}
	    	number = r.nextInt(6);
	    	
	    }	    
	    System.out.println("やったー!大吉だ!");
    	count ++;
    	System.out.println(count+"回目で大吉が出た");
	    
		
		

	}

}

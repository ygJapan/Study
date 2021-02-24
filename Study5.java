package javaStudy;

public class Study5 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println(system(10));
		
	}
	
	public static String system(int number) {
		if(number % 2 != 0) {
			return "奇数です";
		}else {
			return  "偶数です";
		}
	}

}

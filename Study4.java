package javaStudy;

public class Study4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		
		//3,6,9,,,27で処理終了
		for(int number = 1; number < 30; number ++) {
			if(number % 3 != 0) {
			continue;
			}
			System.out.println(number);
		}
		
		
	}

}

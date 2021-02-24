package javaStudy;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int number = 10;
		int divide = 2;
		
		//~の間繰り返す処理
		while(divide < number) {		
			if(number % divide == 0) {
				System.out.println(divide);
				divide ++;
			}else {
				divide ++;
			}
		}
	}

}

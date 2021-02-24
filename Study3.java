package javaStudy;

public class Study3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int number = -21;	
		
		if(number % 2 == 1) {
				System.out.println(number + "は正の奇数です"); //⚪
		}
		else if(number % 2 == -1) {
				System.out.println(number + "は負の奇数です");
		}else if(number % 2 == 0){
			if(number >= 0) {
				System.out.println(number + "は正の偶数です");	//⚪︎
			}else if(number <= 0) {
				System.out.println(number + "は負の偶数です"); //⚪︎
			}
		
		}

}
	
	
}
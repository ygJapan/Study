package javaStudy;

public class StudySelf {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		System.out.println(1 == 2); //false
		System.out.println(1 != 2); //true

		int Anumber = 1;
		int Bnumber = 150;
		
		System.out.println(Anumber == Bnumber); //false
		System.out.println(Anumber != Bnumber); //true
	
		switch(Anumber * Anumber) {
		case 0:					//;セミコロンじゃなくて、：コロンという部分に注意
			System.out.println("Anumberの2乗は0です");
			break;
		case 100:
			System.out.println("Anumberの2乗は100です");
			break;
		default:				//どのケースにも当てはまらなかったらこれを実行する。
			System.out.println("Anumberの2乗は分からなかったです");
				
			
			while(Anumber <= 5) {			//Anumberが5以下の間処理を繰り返す。	
				System.out.println(Anumber);
				Anumber ++;			
				
			}
			
			System.out.println("テスト");
			
			while(Anumber >= -3) {			//Aが-3以上の間繰り返す。
				System.out.println(Anumber);
				Anumber --;
				
			}
		}
		
		
	}

}

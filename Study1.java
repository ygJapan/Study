package javaStudy;

public class Study1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello World");
		int age = 45;
		String name = "yugo";
		if(age < 20){
			System.out.println(name + "は未成年です");
		}else if(age <=29 ) {
			System.out.println(name + "は２０代です");
		}else if(age <=39 ) {
			System.out.println(name + "は３０代です");
		}else {
			System.out.println(name + "は４０歳以上です");
		}
		
		int a = 15;
		int b = 34;
		if(a == b){
			System.out.println("同じです");
		}else
		System.out.println("違います");
		
		a *=100 ; //a= a*100
		System.out.println(a);
		b *=100;
		System.out.println(b);
		
//		double aZei = a *1.1;
//		double bZei = b *1.1;
//		System.out.println(aZei + bZei);
		
		double sum = (a + b) *1.1;
		System.out.println(sum);
		
		
	}
	

}

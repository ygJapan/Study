package javaStudy;

public class BMImethod {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(bmi(60, 1.7));
		
		
	}

	
	
	//BMIメソッド		BMI ＝ 体重kg ÷ (身長m)2
	public static String bmi(double weight, double height) {
		if(weight / (height * height) <= 18.5 ) {			//18.5未満	低体重(痩せ型)
			return "低体重(痩せ型)";
		}else if(weight / (height * height) <= 25 ) {		//18.5〜25未満	普通体重
			return "普通体重";
		}else if(weight / (height * height) <= 30 ) {		//25〜30未満	肥満(1度)
			return "肥満(1度)";
		}else if(weight / (height * height) <= 35 ) {		//30〜35未満	肥満(2度)
			return "肥満(2度)";
		}else if(weight / (height * height) <= 40 ) {		//35〜40未満	肥満(3度)
			return "肥満(3度)";
		}else {												//40以上	肥満(4度)
			return "肥満(4度)";
		}
		
	}

}

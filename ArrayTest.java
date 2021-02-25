package javaStudy;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int data[];

		  data = test();
		  System.out.println(data[0]);
		  System.out.println(data[1]);
		}

		private static int[] test(){
		  int data[] = new int[2];
		  data[0] = 10;
		  data[1] = 19;

		  return data;
		}


}

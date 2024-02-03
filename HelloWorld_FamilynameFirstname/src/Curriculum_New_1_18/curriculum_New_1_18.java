package Curriculum_New_1_18;

import java.util.Random;

public class curriculum_New_1_18 {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

		String a = "Hello JavaSE";
		int n1 = 11;
		hello(a,n1);

		// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください

		int num1,num2;

		num1 = 10;
		num2 = 8;
		keisan(num1,num2);

		// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください

		int[] t1 = {10,4};
		test(t1);


		// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		// @Override
		double d1,d2;
		d1 = 6.5;
		d2 = 9.1;
		keisan(d1,d2);


		// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
		// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
		// ※0は出力＆格納しないようにしてください。

		int a1;
		a1 = 10;
		int[] x1 = ransuu(a1);


		// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		// ※小数点以下も表示されるようにしてください。


		double x2 = heikin(x1);


		// Q7:引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

		if (hikaku(x2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

	private static void hello(String name,int index) { 
		System.out.println(name + index);
	}
	private static void keisan(int n1,int n2) {
		System.out.println(n1 * n2);
	}
	private static void test(int t1[]){
		for (int i = 0; i < t1.length; i++) {
			System.out.println(t1[i]);
		}
	}
	private static void keisan(double dnum1,double dnum2) {
		System.out.println(dnum1 + dnum2);
	}
	private static int[] ransuu(int ran1) {
		// 配列に格納
		int ran[] = new int[ran1];
		// 1～100のランダム関数
		Random rnd = new Random();
		for (int i = 0; i <ran1; i++) {
			int array = rnd.nextInt(100) +1;
			ran[i] = array;
			System.out.println(ran[i]);
		}
		return ran;
	}
	private static double heikin(int[] ave) {
		int sum = 0;
		double average;
		for (int i = 0; i<ave.length; i++) {
			sum = sum + ave[i];
		}
		// 平均を出す式
		average = (double)sum/ave.length;
		System.out.println(average);
		return average;
	}
	private static boolean hikaku(double h) {
		// 受け取った値が50以上
		if (h >= 50) {
			return true;
		}else {
			return false;

		}
	}

}



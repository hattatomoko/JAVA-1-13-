package curriculum_New_1_25;

import java.util.Scanner;

import suppersub.Sub;

/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 */


public class curriculum_New_1_25 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("こんにちは「" + str +"」さん");

		Sub sub = new Sub();
		System.out.println("ステータス");
		System.out.println("HP:" + sub.getHp());
		System.out.println("MP:" + sub.getMp());
		System.out.println("攻撃力:" + sub.getPower());
		System.out.println("素早さ:" + sub.getSpeed());
		System.out.println("防御力:" + sub.getDefense());
		System.out.println("さあ冒険にでかけよう！");

		scan.close();
	}
}

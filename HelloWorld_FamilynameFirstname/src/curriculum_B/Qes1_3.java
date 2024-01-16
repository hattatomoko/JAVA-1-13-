package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
// TODO 自動生成されたメソッド・スタブ
// キーボード入力の準備
	  Scanner scanner = new Scanner(System.in);
// 入力された値を認識する
	  String userName = scanner.nextLine();
	  
// 10文字以上のとき
	  if (userName.length() > 10) {
		  userName = "";
		  System.out.println("名前を10文字以内にしてください");
// 何も書かれていないとき
	  }else if (userName == null || userName.length() <= 0) {
			System.out.println("名前を入力してください");
			userName = "";
// 大文字の時
	  }else if (!userName.matches("^[0-9a-zA-Z_]+$")) {
			System.out.println("半角英数字のみで名前を入力してください");
// それ以外は
	  }else{
			System.out.println("ユーザー名" + userName + "を登録しました");
		
	  }
// じゃんけんの回数を出す変数を用意
	int janken_num = 0;
	
// 無限ループ 
    while (true) {
    System.out.println("あなたのじゃんけんの手を入力して下さい");
    System.out.print("(グー：0，チョキ：1、パー：2)　--> ");
// じゃんけんの回数を足していく
      janken_num++;
// 入力された値を認識する      
        String num = scanner.nextLine();
// 文字列numをint型numberに変換する
		int number = Integer.parseInt(num);
		
// 文字列の配列
	    String[] janken_name = { "グー", "チョキ", "パー" };
	    
// 自分の手の値
		System.out.println(userName + "の手は"+ janken_name[number]);
		
		 
// Randomクラスのインスタンスを初期化
		Random rand = new Random();
// 入力されたデータを整数として読み込むメソッドを呼びだし乱数を得る。
		int computer_num = rand.nextInt(3) + 0;
// 相手の手の値
		System.out.println("相手の手は" + janken_name[computer_num]);
		System.out.println("");

//名前を正しく入力したときに動く
		if (number <=-1 || number >= 3) {
			System.out.println("【エラー】入力できるのは「0～2」です");
		}
		
// 結果		
// 自分がじゃんけんに勝ったとき		
		if ((number == 0 && computer_num == 1)
				|| ((number == 1 && computer_num == 2) || ((number == 2 && computer_num == 0)))) {
			System.out.println("やるやん。\n"
					+ "次は俺にリベンジさせて");
			System.out.println("");
			System.out.println("勝つまでにかかった合計回数は" + janken_num + "回です");
			break;

// グーに負けた時
		 } else if (number == 1 && computer_num == 0) {
			System.out.println("俺の勝ち！\n"
					+ "負けは次につながるチャンスです！\n"
					+ "ネバーギブアップ！");
			System.out.println("");
// チョキに負けた時
		 } else if (number == 2 && computer_num == 1) {
			System.out.println("俺の勝ち！\n"
					+ "たかがじゃんけん、そう思ってないですか？\n"
					+ "それやったら次も、俺が勝ちますよ");
// パーに負けた時
			System.out.println("");
		 } else if (number == 0  && computer_num == 2) {
			System.out.println("俺の勝ち！\n"
					+ "なんで負けたか、明日まで考えといてください。\n"
					+ "そしたら何かが見えてくるはずです				");
			System.out.println("");
// あいこのとき
		 } else if ((number == 0 && computer_num == 0)
				|| ((number == 1 && computer_num == 1) || ((number == 2 && computer_num == 2)))) {
			System.out.println("DRAW あいこ もう一回しましょう！");
			System.out.println("");
         }
	  }  scanner.close();
   } 
}



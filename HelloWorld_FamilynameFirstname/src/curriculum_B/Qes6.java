package curriculum_B;

import java.util.Random;
import java.util.Scanner;


 class Qes6 {

	public static void main(String[] args) {
// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
// 変数に代入
		String data = scanner.nextLine();
// 複数入力した文字を配列に代入する
		String Appliances[] = data.split("、");
// ランダムに数字を出す
		Random random = new Random();
		
// それぞれの要素を取り出す
		for (String appliances : Appliances) {
			int kosuu = random.nextInt(11);

			switch (appliances) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" +kosuu + "台です");
				System.out.println("");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" +kosuu + "台です");
				System.out.println("");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" +kosuu + "台です");
				System.out.println("");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" +kosuu + "台です");
				System.out.println("");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" +kosuu + "台です");
				System.out.println("");
				break;
				
// テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力
			case "テレビ":
			case "ディスプレイ":
                // 同一性を調べる				
				String result = (appliances.equals("テレビ")) ? "テレビ" : "ディスプレイ";               
				int max = (result.equals("テレビ")) ? 11 : 10; 
				// ランダムで出た数字を出力
				kosuu = (int) (Math.random() * (max + 1));
				System.out.println(result + "の残りの台数は" + kosuu + "台です");
				System.out.println("");
				break;
				

			default:
				System.out.println("『" + appliances + "』" + "は指定の商品ではありません");
				
			}
			scanner.close();
		}
   }
}
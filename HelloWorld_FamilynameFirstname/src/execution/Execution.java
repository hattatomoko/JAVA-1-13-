package execution;

import java.text.SimpleDateFormat;
import java.util.Date;

import process.Process;

public class Execution {

	public static void main(String[] args) {

		/*

	下記がコンソールに出力されるように作成してください

		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。

		 */

		Process get = new Process("こんにちは!","日本","寿司","うまい","和食");
		Date now = new Date();
		SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String formatted = DateFormat.format(now);

		System.out.println(get.hello + "ここは" + get.Japan + "です！");
		System.out.println("この" + get.sushi + "は" + get.delicious);
		System.out.println(get.sushi + "は" + get.Japanesefood +"です");
		System.out.println("今の現在日時は" + formatted +"です"); 

	}
}

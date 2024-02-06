package process;

public class Process {

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

	public String hello;
	public String Japan;
	public String sushi;
	public String delicious;
	public String Japanesefood;

	public Process(String hello, String Japan, String sushi, String delicious,String Japanesefood) {
		this.hello = hello;
		this.Japan = Japan;
		this.sushi = sushi;
		this.delicious = delicious;
		this.Japanesefood = Japanesefood;
	}


}


package curriculum_New1_19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Q1：dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		dog getting = new dog();
		String get = getting.name;
		System.out.println(getting.name);
		// Q2：dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		dog gettings = new dog();
		int kosuu = gettings.count;
		System.out.println(gettings.count);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		Date now = new Date();
		SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy/MM/dd H:m:s");
		String formatted = DateFormat.format(now);
		System.out.println(formatted);
		
	}

}

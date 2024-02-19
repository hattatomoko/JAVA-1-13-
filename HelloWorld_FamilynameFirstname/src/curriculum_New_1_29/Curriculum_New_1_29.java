package curriculum_New_1_29;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import sort.Sort;

public class Curriculum_New_1_29 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/*0, "北海道:札幌市:83424"
		1, "青森県:青森市:9646"
		2, "岩手県:盛岡市:15275"
		3, "宮城県:仙台市:7282"
		4, "秋田県:秋田市:11638"
		5, "山形県:山形市:9323"
		6, "福島県:福島市:13784"
		7, "茨城県:水戸市:6097"
		8, "栃木県:宇都宮市:6408"
		9, "群馬県:前橋市:6362"
		10, "埼玉県:さいたま市:3798"*/

		// 入力する準備
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		//String型の変数同士の時はequalsを使う
		boolean isAscendingorder;
		
		if(str.equals ("昇順")) {
			isAscendingorder = true;
		}else {
			isAscendingorder = false;
		}
		
		str = scan.next();

		// ソートクラスをインスタンス化
		Sort sort = new Sort();

		// 入力されたものを切り離す
		String Appliances[] = str.split(",");
		int dl=Appliances.length;
		// int型のd　配列の宣言
		Integer []d=new Integer[dl];

		// 入力された文字分だけ出力
		for(int i =0; i<Appliances.length; i++) {
			d[i]=Integer.parseInt(Appliances[i]);

		}
		// 昇順降順に並べる
		if(isAscendingorder) {
		    Arrays.sort(d);
		}else {
		    Arrays.sort(d,Collections.reverseOrder());
		}
		

		// 県名、県庁所在地、面積を配列に入れる
		String[] information = {"北海道:札幌市:83424","青森県:青森市:9646","岩手県:盛岡市:15275","宮城県:仙台市:7282","秋田県:秋田市:11638","山形県:山形市:9323","福島県:福島市:13784","茨城県:水戸市:6097","栃木県:宇都宮市:6408","群馬県:前橋市:6362","埼玉県:さいたま市:3798"};

		// 数字の数だけ出力
		for(int i=0; i<d.length; i++) {
			// ：で切り離す
			String Array[]= information[d[i]].split(":");

			sort.setPrefectures(Array[0]);
			sort.setPrefectoralcapital(Array[1]);
			sort.setArea(Double.valueOf(Array[2]));

			/*コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	 	都道府県がソートされてコンソールに出力されるように作ってください
	   	※Packageを2つ作ってください
	   	※複数選択できるようにしてください

	   	例:
	   	8,5,9,.....
	   	と入力された場合（昇順）

	   	都道府県名：山形県
		県庁所在地：山形市
		面積：9323.0km2

	   	都道府県名：栃木県
		県庁所在地：宇都宮市
		面積：6408.0km2

	   	都道府県名：群馬県
		県庁所在地：前橋市
		面積：6362.0km2 */



			System.out.println("都道府県名:" + sort.getPrefectures());
			System.out.println("県庁所在地:" + sort.getPrefectoralcapital());
			System.out.println("面積:" + sort.getArea1() + "㎢ \r\n");	
		}
		scan.close();	
	}
}

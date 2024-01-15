package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		int people;
		while(true) {
			System.out.println("生徒の人数を入力してください（2以上）:");
			people = scanner.nextInt();
// ２人以上の時
			if (people >= 2) {
				break;
			}	
		}
		// 各生徒の科目平均点を格納する配列
		double[] num = new double[people + 1];
		// 各教科の平均点を格納する配列
		double[] average = new double[4];
		// 全体の平均店を格納する配列
		double totalAverage = 0.0;
		
	    for (int i = 1; i <= people; i++) {
	    	System.out.println(i + "人目の成績を入力してください");
	    	
	    	System.out.println("英語の点数;");
	    	double English = scanner.nextDouble();
	    	
	    	System.out.println("数学の点数;");
	    	double Math = scanner.nextDouble();
	    	
	    	System.out.println("理科の点数;");
	    	double Science = scanner.nextDouble();
	    	
	    	System.out.println("社会の点数;");
	    	double Social = scanner.nextDouble();
	    	
	        // 全部足して４で割る
	    	double Average = (English + Math + Science + Social) / 4.0;
	    	num[i] = Average;
	    	
	    	// 各教科の平均点を格納
	    	average[0] += English;
	    	average[1] += Math;
	    	average[2] += Science;
	    	average[3] += Social;
	    	
	    	// 全体の平均点を格納
	    	totalAverage += Average;
	    }
	    
	    for (int i = 1; i <= people; i++) {
	    	System.out.println(i + "人目の平均点は" + num[i] + "点です。");
	    }
	    
	    // 各教科の平均点を計算
	    // ４教科数
	    int subject = 4;
	    for (int i = 0; i < subject; i++) {
	    	average[i] /= people;
	    	System.out.println(getSubjectName(i) + "の平均点は" + average[i] + "点です。");
	    }
	    
	    // 全体の平均点を計算
	    totalAverage /= people;
	    System.out.println("全体の平均点は" + totalAverage + "点です。");
	 }
	 
	 // 教科名を取得する関数
	public static String getSubjectName (int subjectIndex) {
		String [] subjects = {"英語", "数学", "理科", "社会"};
		return subjects[subjectIndex];
	}
	

}

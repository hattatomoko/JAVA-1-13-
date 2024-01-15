package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
// iという変数を1から20まで増加させながら繰り返す	
	    for(int j = 1; j<= 20; j++) {
// jという変数を1から9まで増加させながら繰り返す
	    	for(int i =1; i<= 9; i++) {
// resultという変巣にi*jを入れる
	    		int result = i*j;
// %03dで整数値を3桁で表示するためのフォーマット指定子
	    		System.out.printf("%03d * %03d = %03d", i,j,result);
// iが9未満であれば||で区切る
	    		if(i<9) {
	    			System.out.print(" || ");
// それ以外
	    		}else if (i<20) {
	    			System.out.println();
	    		}
	    	}
// Jが20未満の場合改行
	    	if(j<20) {
	    		System.out.println();
	    	}
	    }
    }
}


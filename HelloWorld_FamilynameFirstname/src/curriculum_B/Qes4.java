package curriculum_B;

public class Qes4 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
// iという変数を1から9まで増加させながら繰り返す	
    for(int j = 1; j<= 9; j++) {
// jという変数を1から9まで増加させながら繰り返す
    	for(int i =1; i<= 9; i++) {
// resultという変巣にi*jを入れる
    		int result = i*j;
// %02dで整数値を2桁で表示するためのフォーマット指定子
    		System.out.printf("%02d * %02d = %02d", i,j,result);
// iが9未満であれば||で区切る
    		if(i<9) {
    			System.out.print(" || ");
// それ以外
    		}else {
    			System.out.println();
    		}
    		
    	 }
// Jが9未満の場合改行
    	if(j<9) {
    		System.out.println();
    	 }
      }
   }
}

 
package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) 
{
// ローカル変数として宣言
	byte b;
	short s;
	int i;
	long l;
	float f;
    double d;
    char c;
    String str;
    boolean bool;
    
// 初期値を代入し初期化する
	b = 0;
	s = 0;
	i = 0;
	l = 0;
	f = 0.0f;
	d = 0.0d;
	c = '\u0000';
	str = null;
	bool = false;
	
// 値を代入
	b = 10;
	s = 100;
	i = 1000;
	l = 10000;
	f = 9.5f;
	d = 10.5d;
	c = 'a';
    str = "ハロー";
    bool = true;
    
// コンソールに出力
// 11110
    System.out.println(l + i + s + b);
    
// 20
    System.out.println(Math.round( f + d));
    
// a ハロー　true
    System.out.println(c + str +  bool);
    
// 11130
    System.out.println(Math.round(l + i + s + b + f + d));
    
// 10000000000
    System.out.println(b * s * i * l );
    
// 0.105
    System.out.println(d / s);
    
// -90    
    System.out.println(b - s);
    
//「ハローJAVA2023」
// 文字列型numを整数型に変更
    int num=20;
    int num1=23;
    System.out.println("ハローJAVA" + (num + num1) + "\r\n");
    
//『山田太郎 18歳 170.5cm 62.2kg 寿司』
    String name = "山田太郎";
    int age =18;
    double height = 170.5; 
    double weight = 62.2; 
    String food = "寿司";
    
    System.out.println("初めまして" + name +"です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "cmです");
    System.out.println("体重は" + weight + "kgです");
    System.out.println("好きな食べ物は" + food + "です");
    
// BMIを出力
// 変数BMIに計算式いれる
    double bmi = weight / ((height / 100) * (height / 100));
// BMI出力 
    System.out.println("BMIは" + ((double)Math.round(bmi * 10)/10) + "です\r\n");
    
    
// 再代入
    name = "鈴木一郎";
    age = 24;
    height = 168.5;
    weight = 64.2;
    food = "オムライス";
    
    System.out.println("初めまして" + name +"です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "cmです");
    System.out.println("体重は" + weight + "kgです");
    System.out.println("好きな食べ物は" + food + "です");
    
    bmi = weight / ((height / 100) * (height / 100));
    System.out.println("BMIは" + ((double)Math.round(bmi * 10)/10) + "です\r\n");
    
    
// 和算で自己代入
    name = "鈴木一郎";
    age += 24;
    height += 168.5;
    weight += 64.2;
    food = "オムライス";
    
    System.out.println("初めまして" + name +"です");
    System.out.println("年齢は" + age  + "歳です");
    System.out.println("身長は" + height + "cmです");
    System.out.println("体重は" + weight + "kgです");
    System.out.println("好きな食べ物は" + food + "です");
    
    bmi = weight / ((height / 100) * (height / 100));
    System.out.println("BMIは" + ((double)Math.round(bmi * 100)/100) + "です\r\n");
    
// 再代入   
    age = 24;
    height = 168.5;
    weight = 64.2;
// 年齢が25歳以上ならtrueが出力
// 変数resultにage>25がtrueかfalseかを入れる 
    boolean result = age >= 25 ? true : false;
// 出力
    System.out.println(result);
    
// 【年齢、身長、体重】を文字列型に変換
// 整数型のintをStringに変換  
    String si = Integer.valueOf(age).toString();
// 浮動小数点型のdoubleをStingに変換 
    String sd = Double.valueOf(height).toString();
    String sdd = Double.valueOf(weight).toString();
    
    System.out.println(si);
    System.out.println(sd);
    System.out.println(sdd);
    
// 変換した【年齢、身長】を整数型に変換
// 文字列型の変数siを int型に変更 
    Integer agei = Integer.valueOf(si);
    int Age = agei.intValue();
    System.out.println(Age);
    
// 文字列型の変数sdを double型に変更  
    Double h = Double.valueOf(sd);
    double Height = h.doubleValue();
    System.out.println(Height);
    
// 年齢が25もしくは身長が160以上
// 変数ResultにAge > 25 か Height>160が trueかfalseか入れる
    boolean Result = Age >= 25 || Height >= 160 ? true : false;
// 出力する 
    System.out.println(Result);
  }
}

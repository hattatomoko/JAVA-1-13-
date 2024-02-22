package selfIntroduction2;

public class Person {

	// カウントを定義
	public static int count = 0;

	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	
	// コンストラクタの作成
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count ++;
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public void print(){
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	// インスタンスメソッドプリントカウント
	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}


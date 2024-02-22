package selfIntrodution1;

public class Person {
	// インスタンスフィールドを定
	public String name;
	public int age;
	public double height;
	public double weight;
	public double bmi;
	public int print;
	public static int count;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count ++;
	}

	// bmiの定義
	public double bmi() {
		return this.weight / (this.height * this.height);

	}

	// インスタンスメソッドprintから（戻り値void)
	public void print() {
		System.out.println("\r\n名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" +  (double)Math.floor(bmi()) + "です");
		System.out.println("合計" + Person.count + "人です");
	}
}

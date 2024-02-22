package selfIntroduction;

public class Person {
	// インスタンスフィールドを定義
	public static int count = 0;
	public String firstName;
	public String lastName;
	public int age;
	public double height, weight;

	// コンストラクタの作成
	Person(String firstName, int age, double height, double weight){
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	// コンストラクタのオーバーロード
	Person(String firstName,String lastName, int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	// インスタンスメソッドfullNameを定義
	public String fullName(){
		return this.firstName + this.lastName;
	}

	// インスタンスメソッドprintを定義
	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	// インスタンスメソッドbmiを定義
	public double bmi(){
		return this.weight / this.height / this.height;
	}
	
	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
	
	// インスタンスメソッドbuyを定義
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}


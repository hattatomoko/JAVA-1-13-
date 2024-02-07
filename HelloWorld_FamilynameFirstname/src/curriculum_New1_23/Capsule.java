package curriculum_New1_23;

public class Capsule {
	/*

 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください

  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	 */


	private String name;
	private double bodylength;
	private int speed;


	public Capsule(String name,double bodylength,int speed) {
		this.name = name;
		this.bodylength = bodylength;
		this.speed =  speed;
	}

	public String getName() {
		return this.name;
	}

	public double getBodylength() {
		return this.bodylength;
	}

	public int getSpeed() {
		return this.speed;
	}

	public static void main(String[] args) {
		Capsule capsule = new Capsule("ライオン",2.1,80);
		System.out.println("動物名:" + capsule.getName());
		System.out.println("体長:" + capsule.getBodylength() + "m");
		System.out.println("速度:" + capsule.getSpeed() + "km/h");
	}
}


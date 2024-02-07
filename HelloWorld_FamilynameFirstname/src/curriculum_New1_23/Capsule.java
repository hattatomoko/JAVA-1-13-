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


	public String getName() {
		return this.name;
	}
		
	public void setName(String name) {
		this.name = name;
	}

	public double getBodylength() {
		return this.bodylength;
	}
	
	public void setBodylength(double bodylength) {
		this.bodylength = bodylength;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
}


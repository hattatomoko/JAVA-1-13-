package animal;

public class Animalsuper {
	/*
	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ

	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス

	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ

	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス

	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ

	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明
	 */

	protected String name;
	protected double bodylength;
	protected int speed;

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

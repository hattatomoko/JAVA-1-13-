package sort;

public class Sort {
	/*都道府県名,県庁所在地、面積をゲッターとセッターに入れる*/

	protected String prefectures;
	protected String prefectoralcapital;
	protected double area;

	public String getPrefectures() {
		return this.prefectures;
	}

	public void setPrefectures(String prefectures) {
		this.prefectures = prefectures;
	}

	public String getPrefectoralcapital() {
		return this.prefectoralcapital;
	}

	public void setPrefectoralcapital(String  prefectoralcapital) {
		this.prefectoralcapital =  prefectoralcapital;
	}

	public double getArea() {
		return this.area;
	}
	public String getArea1() {
		return String.format("%.1f",area);
	}
	public void setArea(double area) {
		this.area = area;
	}
}

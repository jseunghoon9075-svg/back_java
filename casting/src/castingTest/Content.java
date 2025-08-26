package castingTest;
//제목, 비디오시간, 나라, 시리즈, 2배속
public class Content {
	String title;
	double contentTime;
	int tenSecond;
	String country;
	int series;
	int doubleSpeed;
	
	public Content() {;}

	public Content(String title, double contentTime, String country, int series, int doubleSpeed, int tenSecond) {
		this.title = title;
		this.contentTime = contentTime;
		this.country = country;
		this.series = series;
		this.doubleSpeed = doubleSpeed;
		this.tenSecond = tenSecond;
	}

	public int getTenSecond() {
		return tenSecond;
	}

	public void setTenSecond(int tenSecond) {
		this.tenSecond = tenSecond;
	}

	public int getDoubleSpeed() {
		return doubleSpeed;
	}

	public void setDoubleSpeed(int doubleSpeed) {
		this.doubleSpeed = doubleSpeed;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getContentTime() {
		return contentTime;
	}

	public void setContentTime(double contentTime) {
		this.contentTime = contentTime;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	void tenSecondBack() {
		setTenSecond(10);
		System.out.println(getTenSecond()+"초 뒤로이동");
	}
	void play(Content content) {
		System.out.println("재생");
	}
	void stop() {
		
	}
	void exit() {
		
	}

}


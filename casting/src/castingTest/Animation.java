package castingTest;

public class Animation extends Content{
	String category;
	
	
	public Animation() {;}

	public Animation(String title, double contentTime, String country, int series, String category, int doubleSpeed,int tenSecondBack) {
		super(title, contentTime, country, series, doubleSpeed, tenSecondBack);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	void play(Content content) {
		System.out.println(getTitle() + " 재생!!");
	}
	
	@Override
	void tenSecondBack() {
		setTenSecond(10);
		System.out.println(getTenSecond()+"초 뒤로이동");
	}
	void onCaption(String country) {
		System.out.println(country + "자막 변경");
	}
	
}

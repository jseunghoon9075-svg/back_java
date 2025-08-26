package castingTest;

public class User {
	String nickName;

	public User() {;}

	public User(String nickName) {
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
//	실행메서드, 일시정지메서드, 나가기메서드

	void play(Content content) {
		if(content instanceof Animation) {
			Animation ani = (Animation)content;
			ani.setTitle("귀멸의 칼날");
			content.play(new Animation());
			ani.onCaption("한국");
			content.tenSecondBack();
		}
	}
	void stop(Content content) {
		
	}
	void exit(Content content) {
		
	}
}
	

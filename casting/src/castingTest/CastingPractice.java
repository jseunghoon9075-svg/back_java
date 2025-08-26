package castingTest;

class Person{
	Speaker speaker;
	public Person() {;}
	
	public Person(Speaker speaker) {
		this.speaker = speaker;
	}
	
	void setName(Speaker speaker) {
		this.speaker = speaker;
	}
	
	void turnOn(Speaker speaker) {
		System.out.println(speaker.getName() + " 켜졌습니다.");
	}
}
class Speaker extends Person{
	String name;
	public Speaker() {;}
	public Speaker(Speaker speaker,String name) {
		super(speaker);
		this.name = name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
}
class RedSpeaker extends Speaker{
	String name;
	public RedSpeaker() {;}
	public RedSpeaker(String name) {
		super();
		this.name = name;
	}
	@Override
	String getName() {
		return name = "빨간스피커";
	}
}
class BlueSpeaker extends Speaker{
	String name;
	public BlueSpeaker() {;}
	public BlueSpeaker(String name) {
		super();
		this.name = name;
	}
	@Override
	String getName() {
		return name = "파란스피커";
	}
}

public class CastingPractice {
	public static void main(String[] args) {
		Speaker s1 = new RedSpeaker();
		Person p1 = new Person(s1);
		p1.turnOn(s1);
		
		Speaker s2 = new BlueSpeaker();
		Person p2 = new Person(s2);
		p2.turnOn(s2);
	}
}

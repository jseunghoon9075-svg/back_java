package streamPractice;

import java.util.Objects;

import streamTask.Member;

public class NewMember {
	private Long id;
	private String name;
	private String hobby;
	private String introduce;
	private static Long seq;
	
//	최초1번
	static {
		seq = 0L;
	}
	
//	생성자가 호출될 때 마다
	{
		this.id = seq++;
	}
	
	public NewMember() {;}

	public NewMember(String name, String hobby, String introduce) {
		this.name = name;
		this.hobby = hobby;
		this.introduce = introduce;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", hobby=" + hobby + ", introduce=" + introduce + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id);
	}
}

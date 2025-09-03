package collectionTest.arrayList2;

import java.time.LocalDate;
import java.util.Objects;

// 이 클래스는 db의 값을 담기위한 클래스이다 용도가 분명하다
public class User {
	private String id;
	private String name;
	private String password;
	private String phone;
	private LocalDate createTime;
	
	public User() {;}

	public User(String id, String name, String password, String phone) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}
	
	public User(String id, String name, String password, String phone, LocalDate createTime) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.createTime = createTime;
	}

	public LocalDate getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDate createTime) {
		this.createTime = createTime;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + "]";
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
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
}

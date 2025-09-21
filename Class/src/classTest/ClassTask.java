package classTest;

// 동물(ClassTask)
// 이름, 나이, 먹이
// 추상화
// 필드 선언
// 기본생성자, 초기화 생성자
// 객체화, 생성자

			//	추상화
			public class ClassTask {
			//	필드
				String name;
				String feed;
				int age;
				
			//	기본 생성자/오버로딩
				public ClassTask() {;}
			//	초기화 생성자
				public ClassTask(String name, int age, String feed) {
					
					this.name = name;
					this.age = age;
					this.feed = feed;
				}
				
				public static void main(String[] args) {
			//		객체화					생성자
					ClassTask animal1 = new ClassTask("야옹", 25, "츄르");
				}
			}
	

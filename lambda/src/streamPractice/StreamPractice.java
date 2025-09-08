package streamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class StreamPractice {
	
	static Integer maxLength;
	
	   public void introduce(NewMember member) {
		      String intro = "이름: " + member.getName() + "\n취미: " + member.getHobby() + "\n소개: " + member.getIntroduce();
		      System.out.println(intro);
		   }
	
	public static void main(String[] args) {
		ArrayList<NewMember> members = new ArrayList<NewMember>();

		
		NewMember member1 = new NewMember("홍길동", "축구_농구_야구", "나는 축구왕!");
		NewMember member2 = new NewMember("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		NewMember member3 = new NewMember("장보고", "피아노", "피아노만 한 우물!");
		NewMember member4 = new NewMember("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		NewMember member5 = new NewMember("김영희", "골프_야구", "운동 선수는 나의 꿈");
		NewMember member6 = new NewMember("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		NewMember member7 = new NewMember("배승원", "개발_놀기", "자바가 제일 쉬웠어요^^");
		NewMember[] memberArray = { member1, member2, member3, member4, member5, member6, member7, };

		members.addAll(Arrays.asList(memberArray));
//      1) 각 Member의 취미를 검토하시오.
//      취미 중 개발을 좋아하는 취미를 가진 멤버의 데이터를 모두 출력하시오.
		
//		members.stream().filter(d -> d.getHobby().contains("개발")).forEach(System.out::println);
		
//      2) 각 Member의 취미를 검토하시오.
//      취미 중 개발을 좋아하는 취미를 가진 멤버의 데이터를 
//      개발자 OOO(이름)으로 변경 후 모두 출력하시오.
//		members.stream().filter(d -> d.getHobby().contains("개발")).map(d -> "개발자 " + d.getName()).forEach(System.out::println);
		
		
//      3) 취미를 3개 이상 가진 사람의 id를 출력
		members.stream().filter(d -> d.getHobby().split("_").length >= 3).forEach(d -> System.out.println(d.getName() + "의 취미갯수 : " +d.getId()));
		
//      4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds 변수에 담기
//      hobbyIds를 출력
		
		ArrayList<Long> hobbyIds = members.stream().filter(d -> d.getHobby().split("_").length >= 3).map(d -> d.getId())
				.collect(Collectors.toCollection(ArrayList::new));
		hobbyIds.stream().forEach(System.out::println);
		
//      5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개를 출력하기
//		1. 첫번째 방법 - Long타입의 value를 형변환 시켜서 members의 value를 가져오는방법 
//		 hobbyIds.stream()
//			 .mapToInt(Long::intValue)
//			 .mapToObj(Integer::valueOf)
//			 .map(d -> members.get(d))
//			 .map(d -> d.getIntroduce())
//			.forEach(System.out::println);
//		2. 두번째 방법 hobbysIds의 value가 Long타입 value뿐이니까 Integer의 메서드를 사용할 수 있다
//		 	Integer.intValue()를 사용하면 해당리스트의 value들은 Integer타입으로 가져옴 그걸 이용해서 쉽게 members의 데이터를 가져올 수 있다
//		 hobbyIds.stream()
//		 	.map(d -> members.get(d.intValue()).getIntroduce())
//		 	.forEach(System.out::println);
		 
//      6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
//		1번째 방법
//		NewMember member = members.stream().max(Comparator.comparingInt(m -> m.getIntroduce().length())).get();
//		
		StreamPractice sp = new StreamPractice();
//		
//		sp.introduce(member);
//		2번째 방법
//		Max값을 담아줄 MaxLength클래스를 하나 만들어준다.
//		반복문으로 members의 소개글의 길이와 MaxLength.getMax()를 가져와 비교한다
//		값을 담아줄 지역변수 하나 선언 한다.
//		members의 소개길이가 더 크면 setter를 이용해 MaxLength의 필드값을 재정의한다
//		그 후 stream문법을 이용해 필터로 걸러낸 후 문자열로 바꿔줄 메서드를 사용한다
		MaxLength max = new MaxLength();
		
		for(NewMember m : members) {
			int length = m.getIntroduce().length();
			if(max.getMaxLength() < m.getIntroduce().length()) {
				max.setMaxLength(length);
			}
		}
		members.stream().filter(d -> d.getIntroduce().length() == max.getMaxLength()).forEach(sp::introduce);
//		취미가 2개인 사람의 취미들만 모아서 ArrayList로 변경하기
//		.joining
		
		String[] memberHobbys = members.stream()
				.filter(d -> d.getHobby().split("_").length == 2)
				.map(d -> d.getHobby())
				.collect(Collectors.joining("_"))
				.split("_");
		ArrayList<String> hobbies = new ArrayList<String>(Arrays.asList(memberHobbys));
		
		System.out.println(hobbies.size());
	}
}

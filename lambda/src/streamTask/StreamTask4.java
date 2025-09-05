package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask4 {
	public static int getIntroduceNum(Member member) {
		return member.getIntroduce().length();
		};
		
	
//	members.stream().map(u -> u.getIntroduce().length()).map(i -> i).forEach(i -> {
//		return;
//	});
	
	public static void main(String[] args) {
		ArrayList<Member> members = new ArrayList<Member>();

		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!!");
		Member member7 = new Member("배승원", "개발_놀기", "자바가 제일 쉬웠어요!^^");
		Member[] memberArray = { member1, member2, member3, member4, member5, member6, member7, };

		members.addAll(Arrays.asList(memberArray));

		ArrayList<Member> developMembers = members.stream().filter(m -> m.getHobby().contains("개발"))
				.collect(Collectors.toCollection(ArrayList::new));

		ArrayList<Long> hobbyIds = members.stream()
				.filter((u) -> u.getHobby().split("_").length >= 3)
				.map(u -> u.getId())
				.collect(Collectors.toCollection(ArrayList::new));
//		소개글의 글자가
//		소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
//		출력 예시)
//			이름: 흰둥이
//			취미: 개발_축구_농구
//			소개: 개발도 운동도 다 잘해요!
//		IntStream.range(0, 6).filter(i -> (members.get(i).getIntroduce().length()) == members.get(i))
//			.forEach(i -> System.out.println(i));
		
		
		
	}
}
//		hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개를 출력하기
//		hobbyIds.stream().map(u -> members.get(u.intValue()).getIntroduce()).forEach(u ->System.out.println(u));
//		
//		hobbyIds.stream()
////				Long -> int
//			.mapToInt(Long::intValue)
////				int -> Integer
//			.mapToObj(Integer::valueOf)
//			.map(i -> members.get(i).getIntroduce())
//			.forEach(System.out::println);

package streamTest.filterTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import streamTest.mapTest.User;

public class FilterTask {
	
	public static boolean printEName(User firstName) {
		return firstName.getName().startsWith("이");
	}
	
	public static boolean lastJobChar(User user) {
		return user.getJob().endsWith("자");
	}
	
	public static void print(User user) {
		System.out.println(user);
	}
	public static void main(String[] args) {
	      
	      ArrayList<User> users = new ArrayList<User>(); 
	      
	      User user1 = new User(1L, "홍길동", 17, "개발자");
	      User user2 = new User(2L, "장보고", 20, "기획자");
	      User user3 = new User(3L, "이순신", 35, "자디너");
	      User user4 = new User(4L, "이성계", 42, "개발자");
	      User user5 = new User(5L, "이태희", 22, "사장");
	      
	      users.add(user1);
	      users.add(user2);
	      users.add(user3);
	      users.add(user4);
	      users.add(user5);
//	      ArrayList<User> newUsers = users.stream().filter((u) -> u.getAge() <= 20).collect(Collectors.toCollection(ArrayList::new));
//	      newUsers.forEach(System.out::println);
//	      users.stream().filter(FilterTask::printEName).forEach(System.out::println);
//	      FilterTask::
	      
//	      클래스정렬
//	      .filter((user) -> user.getJob().endsWith("자"))
//	      .sorted(Comparator.comparing(User::getId).reversed())
//	      .forEach(System.out::println);
	      users.stream().filter(FilterTask::lastJobChar).forEach(FilterTask::print);
	}
}

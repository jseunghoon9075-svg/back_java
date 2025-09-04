package streamTest.mapTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MapTest {
   public static void main(String[] args) {
      
      ArrayList<User> users = new ArrayList<User>(); 
      
      User user1 = new User(1L, "홍길동", 17, "개발자");
      User user2 = new User(1L, "장보고", 20, "기획자");
      User user3 = new User(1L, "이순신", 35, "디자이너");
      User user4 = new User(1L, "이성계", 42, "개발자");
      User user5 = new User(1L, "이태희", 22, "사장");
      
      users.add(user1);
      users.add(user2);
      users.add(user3);
      users.add(user4);
      users.add(user5);
      
//      users.stream().map((user) -> user.getName()).forEach((name) -> System.out.print(name + " "));
      
//    1. ArrayList를 생성한다. datas1
//    2. 1~10까지 datas1에 추가한다.
//      3. datas1의 모든 값을 10배로 변경한다.
//      4. datas1의 모든 값을 출력한다.
      ArrayList<Integer> datas1 = new ArrayList<Integer>();
//      
      IntStream.rangeClosed(1, 10).forEach(n -> datas1.add(n));
      datas1.stream().map((n) -> n *10).forEach(System.out::print);

//      2. .map()
      datas1.stream().map((n) -> n + 64).forEach((d) -> {
    	  System.out.println(d.);
    	  
      });
      
   }
}

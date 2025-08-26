package castingTask;

// 배승원과 뽀로로 친구들과 같이 놀기!
// 1. Baeseungwon
// 2. Crong
// - 배승원이(가) 크롱과 블록놀이를 한다!
// 3. Loopy
// - 배승원이(가) 루피와 군침 싹 돌면서 논다!
// 4. Pororo
// - 배승원이(가) 뽀로로와 눈싸움을 한다.

public class CastingTask1 {
   
   public static void main(String[] args) {
      new BaeSeungWon().play(new Crong());
      new BaeSeungWon().play(new Loopy());
      new BaeSeungWon().play(new Pororo());
   }
}

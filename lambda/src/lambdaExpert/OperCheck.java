package lambdaExpert;

import java.util.ArrayList;

@FunctionalInterface
public interface OperCheck {
//   사용자의 수식중 연산자만 분리해주는 메서드
   public ArrayList<String> getOpers(String expression);
}

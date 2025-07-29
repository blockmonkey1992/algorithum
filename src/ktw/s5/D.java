package ktw.s5;

import java.util.Stack;

/**
 * 후위식 연산(postfix)
 * 설명
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
 * 입력
 * 첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
 * 식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
 * 출력
 */
public class D {

    public static void main(String[] args) {
        String input = "352+*9-";

        System.out.println(solution(input));
    }


    private static int solution(String input) {
        Stack<Integer> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            // 숫자라면,
            if(Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                // 숫자가 아니라면,
                Integer rt = stack.pop();
                Integer lt = stack.pop();

                int result = switch (c) {
                    case '+' -> lt + rt;
                    case '-' -> lt - rt;
                    case '*' -> lt * rt;
                    case '/' -> lt / rt;
                    default -> 0;
                };

                stack.push(result);
            }
        }

        return stack.pop();
    }
}

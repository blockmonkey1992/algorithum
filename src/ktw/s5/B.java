package ktw.s5;

import java.util.Stack;

/**
 * 괄호문자제거
 * 설명
 * 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 * 출력
 * 남은 문자만 출력한다.
 */
public class B {

    public static void main(String[] args) {
        String input = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";

        System.out.println(solution(input));
    }

    private static String solution(String input) {
        String result = "";
        Stack<Character> stack = new Stack<>();

        for (Character c : input.toCharArray()) {
            // 1. 여는 괄호를 만나면, stack에 담고,
            if(c == '(') {
                stack.push(c);
            } else if (c == ')') {
                // 2. 닫는 괄호를 만나면 stack에서 꺼낸다.
                stack.pop();
            } else {
                // 3. 만약 스택이 비어있고, 문자열을 만나면 result에 추가 ㄱ
                if(stack.isEmpty()) {
                    result += c;
                }
            }
        }

        return result;
    }
}

package ktw.s5;

import java.util.Stack;

/**
 * 올바른 괄호
 * 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
 * (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
 * 입력
 * 첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
 * 출력
 * 첫 번째 줄에 YES, NO를 출력한다.
 */
public class A {

    public static void main(String[] args) {
        String input = "(()(()))(()";

        System.out.println(solution(input) ? "YES" : "NO");
    }

    private static boolean solution(String input) {
        boolean result = true;

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }

                stack.pop();
            }
        }

        if(!stack.isEmpty()) {
            result = false;
        }
        
        return result;
    }
}

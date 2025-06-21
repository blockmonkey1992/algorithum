package ktw.s1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 중복문자제거
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 */
public class F {
    public static void main(String[] args) {
        String input = "ksekkset";
        
        String result = solution(input);
        System.out.println("Result : " + result);
    }

    public static String solution(String input) {
        ArrayList<String> result = new ArrayList<>();

        for (char s : input.toCharArray()) {
            if(!result.contains(String.valueOf(s))) {
                result.add(String.valueOf(s));
            }
        }

        return String.join("", result);
    }
}

package ktw.s1;

import java.util.ArrayList;
import java.util.List;

/**
 * 특정 문자 뒤집기
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 */
public class E {
    public static void main(String[] args) {
        String str = "a#b!GE*T@S";

        String result = solution(str);
        System.out.println("결과 : " + result);
    }

    public static String solution(String input) {
        int lt = 0;
        int rt = input.length() - 1;

        char[] characters = input.toCharArray();

        while (lt < rt) {
            char pointLt = characters[lt];
            char pointRt = characters[rt];

            // 문자가 문자인지 확인하고 맞다면, reverse;
            if(Character.isLetter(pointLt) && Character.isLetter(pointRt)) {
                characters[lt] = pointRt;
                characters[rt] = pointLt;
            }

            lt++;
            rt--;
        }

        return new String(characters);
    }
}

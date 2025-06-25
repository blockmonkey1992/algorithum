package ktw.s1;

import java.util.ArrayList;
import java.util.List;

/**
 * 가장 짧은 거리
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 */
public class J {
    public static void main(String[] args) {
        String input = "teachermode";
        char target = 'e';

        List<Integer> result = solution(input, target);
        System.out.println("결과 : " + result);
    }

    public static List<Integer> solution(String s, char t) {
        List<Integer> result = new ArrayList<>();


        // 1. 정순회를 통해, e와의 거리를 구한다.
        int p = 100;
        for (char c : s.toCharArray()) {
            if(c == t) {
                p = 0;
                result.add(p);
            } else {
                p++;
                result.add(p);
            }
        }
        
        // 2. 역순회를 통해, e와의 거리를 구하는데, 기존 result[index]와 비교하여 더 작은 거리값으로 넣는다.
        int x = 100;
        for(int i = result.size() -1; i >= 0; i--) {
            char target = s.toCharArray()[i];

            if(target == t) {
                x = 0;
                result.set(i, x);
            } else {
                int inArrayValue = result.get(i);
                x++;
                result.set(i, Math.min(x, inArrayValue));
            }
        }

        return result;
    }
}
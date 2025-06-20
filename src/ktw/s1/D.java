package ktw.s1;

import java.util.ArrayList;
import java.util.List;

/**
 * 단어뒤집기
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요
 */
public class D {
    public static void main(String[] args) {

        String[] input = new String[]{"good", "Time", "Big"};

        List<String> result = solution(input);
        System.out.println("Result : " + result);
    }

    public static List<String> solution(String[] str) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            StringBuilder builder = new StringBuilder(str[i]);
            builder.reverse();

            result.add(builder.toString());
        }

        return result;
    }
}

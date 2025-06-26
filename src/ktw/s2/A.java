package ktw.s2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 큰 수 출력하기
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
 * (첫 번째 수는 무조건 출력한다)
 */
public class A {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(7, 3, 9, 5, 6, 12));

        List<Integer> result = solution(input);
        System.out.println("결과 : " + result);
    }

    public static List<Integer> solution(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        result.add(input.get(0));

        for (int i = 1; i < input.size(); i++) {
            if(input.get(i) > input.get(i-1)) {
                result.add(input.get(i));
            }
        }

        return result;
    }
}

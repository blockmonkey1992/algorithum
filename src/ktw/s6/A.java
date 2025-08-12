package ktw.s6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 1. 선택 정렬
 * 설명
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 * 정렬하는 방법은 선택정렬입니다.
 * 입력
 * 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
 * 출력
 * 오름차순으로 정렬된 수열을 출력합니다.
 */
public class A {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(13, 5, 11, 7, 23, 15));
        System.out.println("Result : " + solution2(input));
    }

    public static List<Integer> solution(List<Integer> input) {
        return input.stream().sorted().toList();
    }

    public static List<Integer> solution2(List<Integer> input) {

        for (int i = 0; i < input.size(); i++) {
            int minIdx = i;

            // 최소값 찾고,
            for (int j = i + 1; j < input.size(); j++) {
                if(input.get(minIdx) > input.get(j)) {
                    minIdx = j;
                }
            }

            // 위치 교환
            Integer temp = input.get(i);
            input.set(i, input.get(minIdx));
            input.set(minIdx, temp);
        }

        return input;
    }

}

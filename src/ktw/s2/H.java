package ktw.s2;

import java.util.*;

/**
 * 등수구하기
 * N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 * 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 * 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 */
public class H {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(87,89,92,100,100,76));

        int[] result = solution(input);

        System.out.println("Result : " + Arrays.toString(result));
    }

    public static int[] solution(List<Integer> input) {
        int[] result = new int[input.size()];

        for (int i = 0; i < input.size(); i++) {
            Integer target = input.get(i);
            int rank = 1;

            for (int j = 0; j < input.size(); j++) {
                System.out.println("[" + i + "]" +"Target : " + target + " 비교 : " + input.get(j));
                if(target < input.get(j)) {
                    // target 기준 나보다 큰 수를 만나면, -> rank++; -> result 추가
                    rank++;
                }
            }
            result[i] = rank;
        }

        return result;
    }
}

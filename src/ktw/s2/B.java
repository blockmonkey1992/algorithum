package ktw.s2;

import java.util.ArrayList;
import java.util.List;

/**
 * 보이는 학생
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 */
public class B {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(130, 135, 148, 140, 145, 150, 150, 153));

        int result = solution(input);
        System.out.println("결과 : " + result);
    }

    public static int solution(List<Integer> input) {

        int max = 0;
        int cnt = 0;

        for (Integer i : input) {
            if(i > max) {
                cnt++;
                max = i;
            }
        }

        return cnt;
    }
}

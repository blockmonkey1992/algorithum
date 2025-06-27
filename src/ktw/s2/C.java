package ktw.s2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 가위 바위 보
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 */
public class C {

    public static void main(String[] args) {
        List<Integer> inputA = new ArrayList<>(List.of(2,3,3,1,3));
        List<Integer> inputB = new ArrayList<>(List.of(1,1,2,2,3));

        List<String> result = solution(inputA, inputB);
        System.out.println("결과 : " + result);
    }

    public static List<String> solution(
            List<Integer> inputA,
            List<Integer> inputB
    ) {
        List<String> winnerResult = new ArrayList<>();

        for (int i = 0; i < inputA.size(); i++) {
            Integer aShow = inputA.get(i);
            Integer bShow = inputB.get(i);

            if(Objects.equals(aShow, bShow)) {
                winnerResult.add("D");
            }

            if(aShow == 1 && bShow == 2) {
                winnerResult.add("B");
            }

            if(aShow == 1 && bShow == 3) {
                winnerResult.add("A");
            }

            if(aShow == 2 && bShow == 1) {
                winnerResult.add("A");
            }

            if(aShow == 2 && bShow == 3) {
                winnerResult.add("B");
            }

            if(aShow == 3 && bShow == 1) {
                winnerResult.add("B");
            }

            if(aShow == 3 && bShow == 2) {
                winnerResult.add("A");
            }
        }

        return winnerResult;
    }
}

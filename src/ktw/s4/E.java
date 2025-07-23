package ktw.s4;

import java.util.*;

/**
 * K번째 큰 수
 * 설명
 * 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
 * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
 * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
 * 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
 * 입력
 * 첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
 * 출력
 * 첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.
 */
public class E {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(13,15,34,23,45,65,33,11,26,42));
        int K = 3;
        System.out.println("Result : " + solution(input, K));
    }

    private static int solution(List<Integer> input, int K) {

        // 레드블랙트리 자료구조로, 순서를 보장하고 중복이 없는 자료구조 활용. (Default : ASC Order)
        TreeSet<Integer> cases = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < input.size(); i++) {
            int aPointer = input.get(i);

            for (int j = i+1; j < input.size(); j++) {
                int bPointer = input.get(j);

                for (int k = j+1; k < input.size(); k++) {
                    int cPointer = input.get(k);

                    cases.add(aPointer+bPointer+cPointer);

                }
            }
        }

        return cases.stream().skip(K-1).findFirst().orElse(-1);
    }
}

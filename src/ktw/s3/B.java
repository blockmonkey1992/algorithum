package ktw.s3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 공통 원소 구하기
 * 설명
 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 * 입력
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
 * 출력
 * 두 집합의 공통원소를 오름차순 정렬하여 출력합니다
 */
public class B {

    public static void main(String[] args) {
        List<Integer> input1 = new ArrayList<>(List.of(1,3,9,5,2));
        List<Integer> input2 = new ArrayList<>(List.of(3,2,5,7,8));

        System.out.println(solution(input1, input2));
    }

    public static List<Integer> solution(List<Integer> input1, List<Integer> input2) {
        List<Integer> result = new ArrayList<>();

        for (Integer inputA : input1) {
            for (Integer inputB : input2) {
                if (inputA.equals(inputB)) {
                    result.add(inputA);
                }
            }
        }

        return result.stream().sorted().toList();
    }
}

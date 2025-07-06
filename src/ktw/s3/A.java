package ktw.s3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 두 배열 합치기
 * 입력
 * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
 * 출력
 * 오름차순으로 정렬된 배열을 출력합니다.
 */
public class A {

    public static void main(String[] args) {
        List<Integer> input1 = new ArrayList<>(List.of(1,3,5));
        List<Integer> input2 = new ArrayList<>(List.of(2,3,6,7,9));

        List<Integer> result = solution(input1, input2);
        System.out.println("Result : " + result);
    }

    public static List<Integer> solution(List<Integer> input1, List<Integer> input2) {
        return Stream.concat(input1.stream(), input2.stream())
//                .distinct()
                .sorted()
                .toList();
    }
}

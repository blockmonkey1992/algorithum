package ktw.s6;

import java.util.Arrays;

/**
 * 3. 삽입 정렬
 * 설명
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 * 정렬하는 방법은 삽입정렬입니다.
 * 입력
 * 첫 번째 줄에 자연수 N(1<=N<=100)이 주어집니다.
 * 두 번째 줄에 N개의 자연수가 공백을 사이에 두고 입력됩니다. 각 자연수는 정수형 범위 안에 있습니다.
 * 출력
 * 오름차순으로 정렬된 수열을 출력합니다.
 */
public class C {
 
    public static void main(String[] args) {
        int[] input = {11,7,5,6,10,9};

        System.out.println(Arrays.toString(solution(input)));
    }

    public static int[] solution(int[] input) {

        for (int i = 1; i < input.length; i++) {
            int temp = input[i];

            for (int j = i-1; j >= 0; j--) {
                if(temp < input[j]) {
                    input[j+1] = input[j];
                    input[j] = temp;
                }
            }
        }

        return input;
    }
}

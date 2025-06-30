package ktw.s2;

import java.util.ArrayList;
import java.util.List;

/**
 * 소수 (에라토스테네스 체)
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 */
public class E {

    public static void main(String[] args) {
        int input = 20;

        int result = solution(input);

        System.out.println("Reuslt = " + result);
    }

    public static int solution(int input) {
        int result = 0;
        int[] list = new int[input + 1];

        for(int i=2; i <= input; i++) {
            if(list[i] == 0) {
                result++;
                for(int j=i; j <= input; j=j+i) {
                    System.out.println(" [" + i + "] " + j);
                    list[j] = 1;
                }
            }
        }
        return result;
    }
}

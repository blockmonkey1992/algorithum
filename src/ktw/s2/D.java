package ktw.s2;

import java.util.ArrayList;
import java.util.List;

/**
 * 피보나치 수열
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 */
public class D {

    public static void main(String[] args) {
        Integer input = 10;

        List<Integer> result = solution(10);
        System.out.println("Result : " + result);
    }

    public static List<Integer> solution(Integer input) {
        List<Integer> result = new ArrayList<>(List.of(1,1));

        int pointer = 2;

        while(result.size() < input) {
            int prev = result.get(pointer-1);
            int pprev = result.get(pointer-2);

            result.add(prev+pprev);

            pointer++;
        }

        System.out.println(result);

        return result;
    }

}

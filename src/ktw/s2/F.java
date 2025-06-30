package ktw.s2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * 뒤집은 소수
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * 첫 자리부터의 연속된 0은 무시한다.
 */
public class F {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(32, 55, 62, 20, 250, 370, 200, 30, 100));

        List<Integer> result = solution(input);
        System.out.println("Result : " + result);
    }

    public static List<Integer> solution(List<Integer> input) {

        List<Integer> reversed = makeReversed(input);
        List<Integer> result = new ArrayList<>();

        for (Integer i : reversed) {
            if(isPrime(i)) {
                result.add(i);
            }
        }

        return result;
    }

    private static boolean isPrime(int n) {
        boolean result = true;

        if(n <= 1) {
            return false;
        }

        for(int i = 2; i < n; i++) {
            System.out.println("Loop : " + i);

            if(n % i == 0) {
                System.out.println("약수 : " + i);
                result = false;
            }
        }

        return result;
    }

    private static List<Integer> makeReversed(List<Integer> input) {
        List<Integer> reversedList = new ArrayList<>();

        for (Integer i : input) {
            String str = String.valueOf(i);
            String reversed = new StringBuilder(str).reverse().toString();

            reversedList.add(Integer.valueOf(reversed));
        }

        return reversedList;
    }
}

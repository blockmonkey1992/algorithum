package ktw.s2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * 격자판 최대합
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 */
public class I {

    public static void main(String[] args) {
        int[][] input = {
                {10, 13, 10, 12, 15}, // 0 60
                {12, 39, 30, 23, 11}, // 1 115
                {11, 25, 50, 53, 15}, // 2 154
                {19, 27, 29, 37, 27}, // 3 139
                {19, 13, 30, 13, 19} // 4 94
        };

        int result = solution(input);

        System.out.println("result = " + result);
    }

    public static int solution(int[][] input) {
        int result = 0;
        List<Integer> sumValues = new ArrayList<>();

        // 행 열 합
        for (int i = 0; i < input.length; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < input.length; j++) {
                rowSum += input[i][j];
                colSum += input[j][i];
            }

            sumValues.add(rowSum);
            sumValues.add(colSum);
        }

        // 대각선 합
        int ldiagonalSum = 0;
        int rdiagonalSum = 0;

        for(int i = 0; i < input.length; i++) {
            ldiagonalSum += input[i][i];
            rdiagonalSum += input[i][input[i].length-i-1];
        }

        sumValues.add(ldiagonalSum);
        sumValues.add(rdiagonalSum);


        Optional<Integer> maxValue = sumValues.stream().max(Comparator.naturalOrder());

        result = maxValue.get();

        return result;
    }
}

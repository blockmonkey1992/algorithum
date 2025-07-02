package ktw.s2;

import java.util.ArrayList;
import java.util.List;

/**
 * 봉우리
 * 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
 * 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
 * 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
 * 만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
 */
public class J {

    public static void main(String[] args) {
        int[][] input = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 5, 3, 7, 2, 3, 0},
                {0, 3, 7, 1, 6, 1, 0},
                {0, 7, 2, 5, 3, 4, 0},
                {0, 4, 3, 6, 4, 1, 0},
                {0, 8, 7, 3, 5, 2, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };

        int result = solution(input);
        System.out.println("result = " + result);
    }

    public static int solution(int[][] input) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i < input.length-1; i++) {
            for(int j = 1; j < input[i].length-1; j++) {
                int target = input[i][j];

                int up = input[i-1][j];
                int down = input[i+1][j];
                int left = input[i][j-1];
                int right = input[i][j+1];

                if(target > up && target > down && target > left && target > right) {
                    System.out.println("Target = " + target + "은 " + "left " + left + "  right " + right + "  up " + up + "  down " + down + "보다 크다");
                    list.add(target);
                }
            }
        }

        System.out.println("봉우리 : " + list);

        return list.size();
    }
}

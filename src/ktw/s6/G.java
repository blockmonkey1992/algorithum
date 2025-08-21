package ktw.s6;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 54. 7. 좌표 정렬(compareTo)
 * 설명
 * N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
 * 정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
 * 입력
 * 첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
 * 두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.
 * 출력
 * N개의 좌표를 정렬하여 출력하세요.
 */
public class G {

    public static class Location {
         int x;
         int y;

         public Location(int x, int y) {
             this.x = x;
             this.y = y;
         }
    }


    public static void main(String[] args) {
        int[][] input = {{2,7}, {1,3}, {1,2}, {2,5}, {3,6}};

        System.out.println(Arrays.deepToString(solution((input))));
    }

    public static int[][] solution(int[][] input) {


        // Priority Queue를 활용해 x 정렬 -> y 정렬 큐 만들고
        PriorityQueue<Location> pq = new PriorityQueue<>(
                (a,b) -> {
                    if (a.x == b.x) {
                        return a.y - b.y;
                    }

                    return a.x - b.x;
                }
        );

        for (int i = 0; i < input.length; i++) {
            pq.add(new Location(input[i][0], input[i][1]));
        }

        // Priority Queue에서 꺼내서 result배열에 넣어
        int[][] result = new int[input.length][2];
        int idx = 0;

        while (!pq.isEmpty()) {
            Location loc = pq.poll();

            result[idx][0] = loc.x;
            result[idx][1] = loc.y;

            idx++;
        }

        return result;
    }
}

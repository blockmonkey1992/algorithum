package ktw.s2;

import java.util.Arrays;

/**
 * 멘토링
 * 현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들려고 합니
 * 다. 멘토링은 멘토(도와주는 학생)와 멘티(도움을 받는 학생)가 한 짝이 되어 멘토가 멘티의
 * 수학공부를 도와주는 것입니다.
 * 선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.
 * 만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서
 * 모두 B학생보다 등수가 앞서야 합니다.
 * M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지
 * 출력하는 프로그램을 작성하세요.
 */
public class L {
    public static void main(String[] args) {
        int[][] input = {
                {3, 4, 1, 2},
                {4, 3, 2, 1},
                {3, 1, 4, 2}
        };
        int N = 4;
        int M = input.length;

        int result = solution(N, M, input);
        System.out.println("Result = " + result);
    }

    public static int solution(int N, int M, int[][] input) {
        int result = 0;

        // 1. 테스트 별로 학생의 랭크를 담기
        int[][] rank = new int[M][N+1];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int student = input[i][j];
                rank[i][student] = j+1;
            }
        }
        System.out.println(Arrays.deepToString(rank));

        // 2. 모든 쌍 탐색
        for (int mentor = 1; mentor <= N; mentor++) {
            for (int menti = 1; menti <= N; menti++) {
                // 2.1 멘토 = 멘티가 같으면 넘겨
                if(mentor == menti) {
                    continue;
                }

                // 3 멘토 멘티 간 시험 별 등수 비교
                boolean isMatch = true;
                for (int test = 0; test < M; test++) {
                    int rankA = rank[test][mentor];
                    int rankB = rank[test][menti];
                    System.out.println("Rank A : " + rankA + " Rank B : " + rankB);

                    // 3.1 멘토가 멘티보다 더 등수가 뒤로 쳐지면 버리고,
                    if(rankA > rankB) {
                        isMatch = false;
                        break;
                    }
                }

                // 3.2 결과값 추가
                if(isMatch) result++;
            }
        }

        return result;
    }
}

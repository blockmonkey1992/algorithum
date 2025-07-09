package ktw.s3;

import java.util.ArrayList;
import java.util.List;

/**
 * 최대 길이 연속부분수열
 * 설명
 * 0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
 * 만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 * 여러분이 만들 수 있는 1이 연속된 연속부분수열은
 * Image1.jpg
 * 이며 그 길이는 8입니다.
 * 입력
 * 첫 번째 줄에 수열의 길이인 자연수 N(5<=N<100,000)이 주어집니다.
 * 두 번째 줄에 N길이의 0과 1로 구성된 수열이 주어집니다.
 * 출력
 * 첫 줄에 최대 길이를 출력하세요.
 */
public class F {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(1,1,0,0,1,1,0,1,1,0,1,1,0,1));
        int K = 2;

        System.out.println("result : " + solution(input, K));
    }

    public static int solution(List<Integer> input, int K) {
        int result = 0, cnt = 0, lt = 0;
        // Right Pointer가 K값 만큼 0을 만날때까지 포인터 ++;
        // Right Pointer가 K값 만큼 cnt를 증가시키면, Lt 옮기면서 0탐색하여 cnt 감소시키고,
        // lt ~ rt간의 길이가 가장 큰 값으로 result 를 만들어
        for (int rt = 0; rt < input.size(); rt++) {
            if(input.get(rt) == 0) cnt++;

            while(cnt > K) {
                if(input.get(lt) == 0) cnt--;
                lt++;
            }

            result = Math.max(result, rt-lt+1);
        }

        return result;
    }
}

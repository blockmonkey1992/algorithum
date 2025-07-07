package ktw.s3;

/**
 * 연속된 자연수의 합
 * 설명
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 * 만약 N=15이면
 * 7+8=15
 * 4+5+6=15
 * 1+2+3+4+5=15
 * 와 같이 총 3가지의 경우가 존재한다.
 * 입력
 * 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
 * 출력
 * 첫 줄에 총 경우수를 출력합니다.
 */
public class E {

    public static void main(String[] args) {
        int input = 15;

        System.out.println(solution(input));
    }

    public static int solution(int input) {
        int result = 0;

        for (int i = 1; i < input; i++) {
            int cnt = i;
            System.out.println("대상 : " + cnt);

            for (int j = i+1; j < input; j++) {
                System.out.println("j = " + j);
                if(cnt == input) break;

                cnt += j;

                if(cnt > input) {
                    break;
                }

                if(cnt == input) {
                    System.out.println("============ 결과 추가 =============");
                    result++;
                    break;
                }
            }
        }

        return result;
    }
}

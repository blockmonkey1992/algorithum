package ktw.s1;

/**
 * 문자열 압축
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단, 반복횟수가 1인 경우 생략합니다.
 */
public class K {

    public static void main(String[] args) {
        String input = "KKHSSSSSSSE";

        String result = solution(input);
        System.out.println("결과 : " + result);
    }

    public static String solution(String str) {
        StringBuilder result = new StringBuilder();
        str = str + " ";

        // cnt 를 두고, i 로 순회하면서 i+1과 값이 같으면 cnt++;
        // 다르면, result에 str[i] 값을 추가하고, cnt도 추가한다. (그리고 ctn=1 초기화)
        int cnt = 1;

        for(int i = 0; i < str.length() -1; i++) {
            char cTarget = str.charAt(i);
            char nTarget = str.charAt(i+1);

            if(cTarget == nTarget) {
                cnt++;
            } else {
                result.append(cTarget);
                if(cnt > 1) {
                    result.append(cnt);
                }
                cnt = 1;
            }
        }

        return result.toString();
    }
}

package ktw.s1;

/**
 * 회문 문자열 (palindrome)
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 대 소문자 구분 X
 */
public class G {
    public static void main(String[] args) {
        String input = "gooG";

        String result = solution2(input) ? "YES" : "NO";
        System.out.println("Result : " + result);
    }

    // 순회 비교
    public static boolean solution(String str) {
        boolean result = true;
        int pointLt = 0;
        int pointRt = str.length() - 1;

        while(pointLt < pointRt) {
            System.out.println("INDEX ::" + "LT=" + pointLt + " RT=" + pointRt);
            System.out.println("Check :: " + " LT=" + str.charAt(pointLt) + " RT=" + str.charAt(pointRt));
            // 문자열의 Lt === 문자열의 Rt 냐? 맞으면 continue;
            if(str.toUpperCase().charAt(pointLt) == str.toUpperCase().charAt(pointRt)) {
                pointLt++;
                pointRt--;
            } else {
            // 틀리면 false;
                result = false;
                return result;
            }
        }

        return result;
    }

    // 거꾸로 돌려서 비교하기
    public static boolean solution2(String str) {
        boolean result = true;

        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Check ::" + "ReversedStr = " + reversedStr + "String = " + str);

        if(!str.equalsIgnoreCase(reversedStr)) {
            result = false;
        }

        return result;
    }
}
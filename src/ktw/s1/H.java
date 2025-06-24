package ktw.s1;

/**
 * 유효한 팰린드롬
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 * 알파벳 이외의 문자들의 무시합니다.
 */
public class H {
    public static void main(String[] args) {
        String input = "found7, time: study; Yduts; emit, 7Dnuof";

        String result = solution(input) ? "YES" : "NO";
        System.out.println("Result : " + result);
    }

    public static boolean solution(String str) {
        boolean result = false;

        // (정규식) ^ 부정문을 통해 A-Z가 아닌 경우, 모두 제거
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        StringBuilder sb = new StringBuilder(str).reverse();

        if (sb.toString().equals(str)) {
            result = true;
        }

        return result;
    }
}

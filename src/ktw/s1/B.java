package ktw.s1;

/**
 * 대소문자 변환
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 * Tip : ASCII 에서 대문자는 65~90, 소문자는 97~122 에 있다. 따라서 소문자 -32하면 대문자가 된다.
 */
public class B {
    public static void main(String[] args) {
        String input = "StuDY";

        String result = solution2(input);
        System.out.println("Result : " + result);
    }

    public static String solution(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if(Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }

        return result.toString();
    }

    public static String solution2(String str) {
        StringBuilder result = new StringBuilder();

        // Tip : ASCII 에서 대문자는 65~90, 소문자는 97~122 에 있다. 따라서 소문자 -32하면 대문자가 된다.
        for (char c : str.toCharArray()) {
            if(c >= 65 && c <= 90) {
                result.append((char)(c+32));
            } else {
                result.append((char)(c-32));
            }
        }

        return result.toString();
    }
}

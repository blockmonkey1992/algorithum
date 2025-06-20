package ktw.s1;

/**
 * 문장 속 단어
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 */
public class C {
    public static void main(String[] args) {
        String input = "it is time to study";

        String result = solution(input);
        System.out.println("result : " + result);
    }

    public static String solution(String str) {
        String[] strs = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String s : strs) {
            if(result.length() < s.length()) {
                result.setLength(0);
                result.append(s);
            }
        }


        return result.toString();
    };
}

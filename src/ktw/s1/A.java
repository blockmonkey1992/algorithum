package ktw.s1;

/**
 * 문자찾기
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다.
 */
public class A {
    public static void main(String[] args) {
        String inputA = "Computercooler";
        String inputB = "c";

        int result = solution(inputA, inputB);
        System.out.println("정답 : " + result);
    }

    public static int solution(String inputA, String inputB) {
        int result = 0;

        for (char x : inputA.toUpperCase().toCharArray()) {
            if(x == inputB.toUpperCase().charAt(0)) {
                result++;
            }
        }

        return result;
    }
}

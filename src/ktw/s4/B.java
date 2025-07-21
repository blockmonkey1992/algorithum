package ktw.s4;

import java.util.HashMap;
import java.util.Map;

/**
 * 아나그램 (해쉬)
 * Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
 * 예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
 * 알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
 * 길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
 */
public class B {

    public static void main(String[] args) {
        String input1 = "AbaAeCe";
        String input2 = "baeeACA";

        String input2_1 = "abaCC";
        String input2_2 = "Caaab";

        String result = solution(input1, input2) ? "YES" : "NO";
        System.out.println(result);
    }

    public static boolean solution(String input1, String input2) {
        boolean result = true;
        Map<String, Integer> origin = new HashMap<>();

        for (char c : input1.toCharArray()) {
            origin.put(String.valueOf(c), origin.getOrDefault(String.valueOf(c), 0) + 1);
        }

        for (char c : input2.toCharArray()) {
            String key = String.valueOf(c);

            if(origin.containsKey(key)) {
                // 값을 가지고 있다면,
                origin.put(key,  origin.get(key) - 1);
            } else {
                result = false;
            }
        }

        boolean hasZeroOrLess = origin.values().stream()
                .anyMatch(value -> value < 0);

        if(hasZeroOrLess) {
            result = false;
        }

        return result;
    }
}

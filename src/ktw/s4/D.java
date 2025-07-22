package ktw.s4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 모든 아나그램 찾기
 * 설명
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 * 입력
 * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
 * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 * 출력
 * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
 */
public class D {
    public static void main(String[] args) {
        String S = "bacaAacba";
        String T = "abc";

        solution(S,T);
    }


    public static int solution(String S, String T) {
        int tLen = T.length();
        System.out.println("CHeck Length");


        List<List<String>> cases = new ArrayList<>();

        // 1. 문자열을 T와 같은 크기로 대상을 먼저 만들고,
        for (int i = 0; i <= S.length() - tLen; i++) {
            String subString = S.substring(i, i + tLen);
            cases.add(List.of(subString));
        }


        // 2. 대상들을 순회하면서 아나그램인지 판별 ㄱ
        List<List<String>> anagramList = new ArrayList<>();

        for (int i = 0; i < cases.size(); i++) {
            boolean isAnagramResult = isAnagram(String.join("", cases.get(i)) , T);
            if(isAnagramResult) {
                anagramList.add(cases.get(i));
            }
        }

        System.out.println("=== 아나그램 리스트 ===");
        System.out.println(anagramList);

        return anagramList.size();
    }

    private static boolean isAnagram(String inputA, String inputB) {
        // input A를 Map에 저장
        Map<Character, Integer> map = new HashMap<>();
        for (char c : inputA.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        // input B를 Map에서 뺴고
        for (char c : inputB.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        boolean result = true;
        // Map 데이터가 0 이하 값이 있으면 아나그램 아님. 0 이면 아나그램
        for(Integer value : map.values()) {
            if(value != 0) {
                result = false;
            }
        }

        System.out.println("inputA: " + inputA + ", inputB: " + inputB + ", result: " + result);

        return result;
    }
}

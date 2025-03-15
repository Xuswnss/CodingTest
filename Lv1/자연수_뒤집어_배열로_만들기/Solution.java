package Lv1.자연수_뒤집어_배열로_만들기;

import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String str = Long.toString(n);
        int[] result = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(str.length() - i - 1) - '0'; //문자 -> 숫자 변환

        }
        answer = result;
        return answer;
    }
}
package Lv0.배열_두배_만들기;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        answer = Arrays.stream(numbers).map(num -> num * 2).toArray();

        return answer;
    }
}

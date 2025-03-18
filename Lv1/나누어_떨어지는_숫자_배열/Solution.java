package Lv1.나누어_떨어지는_숫자_배열;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        answer = Arrays.stream(arr) // stream형식으로 반환
                .filter(num -> num % divisor == 0)
                .sorted() // 오름차순 정렬
                .toArray();  // 배열로 반환

        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
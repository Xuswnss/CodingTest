package Lv0.최댓값만들기1;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // 배열에서 가장 큰 두숫자를 찾아 곱하자.
        Arrays.sort(numbers); // 오름차순 정렬
        int n = numbers.length;
        answer = numbers[n-1] * numbers[n-2];
        return answer;
    }
}
package Lv1.없는_숫자_더하기;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
    int sumAll = 45; // 0 -9 까지의합
        int sumNumbers = Arrays.stream(numbers).sum();// 주어진 배열에 숫자들을 더한 값

        answer = sumAll - sumNumbers;
        return answer;
    }
}

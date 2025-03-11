package Lv0.중앙값_구하기;

import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] arr = Arrays.stream(array).sorted().toArray();
        int result = (int) Math.ceil(arr.length / 2);
        answer = arr[result];

        return answer;
    }
}
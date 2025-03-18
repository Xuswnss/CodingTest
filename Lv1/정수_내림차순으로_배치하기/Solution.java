package Lv1.정수_내림차순으로_배치하기;

import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr); // 오름 차순 정렬
        StringBuilder sb = new StringBuilder(new String(arr)).reverse();
        answer = Long.parseLong(sb.toString()); // long type으로 변환


        return answer;
    }
}
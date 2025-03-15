package Lv1.두정수사이의합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
//        if (a > b) {
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//        for(int i = a; i <= b; i++) {
//            answer += i;
//        }

        long min = Math.min(a, b);
        long max = Math.max(a, b);
        answer = (max - min + 1 ) * (max + min) /2 ;// 전체 개수(첫항 + 끝항) / 2 -> 등차수열의 합
        return answer;
    }
}
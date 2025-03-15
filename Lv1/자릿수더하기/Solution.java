package Lv1.자릿수더하기;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = Integer.toString(n)
                .chars()
                .map(i -> i = '0')
                .sum();


        return answer;
    }
//
//    public class Solution {
//        public static int solution(int N) {
//            int sum = 0;
//            while (N > 0) {
//                sum += N % 10; // 마지막 자리 숫자 추출
//                N /= 10;       // 마지막 자리 제거
//            }
//            return sum;
//        }
}
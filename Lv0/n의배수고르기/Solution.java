package Lv0.n의배수고르기;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        answer = Arrays.stream(numlist) // 배열을 스트림으로 반환
                .filter( num -> num % n == 0 ) // n의 배수만 필터링
                .toArray(); // 다시 배열로 반환
        return answer;
    }
}

/*
* Stream*/
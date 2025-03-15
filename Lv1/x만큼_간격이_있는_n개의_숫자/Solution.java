package Lv1.x만큼_간격이_있는_n개의_숫자;

public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; // ✅ 크기가 n인 배열 선언

        for(int i = 0; i < n; i++) { // ✅ 0부터 시작 (배열 인덱스는 0부터 n-1까지)
            answer[i] = (long) x * (i + 1); // ✅ x * (i+1)로 값을 채움
        }

        return answer;
    } }
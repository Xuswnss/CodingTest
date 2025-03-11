package Lv0.순서쌍의_개수;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // i가 n의 약수이면 순서쌍 존재
                answer++;
            }
        }
        return answer;
    }
}

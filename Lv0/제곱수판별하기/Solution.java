package Lv0.제곱수판별하기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        // 제곱근을 구한다.
        double sqrt = Math.sqrt(n);
        if(sqrt == (int)sqrt){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}
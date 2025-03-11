package Lv0.피자나눠먹기3;

class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        /*
        n명의 사람이 최소 한조각 이상피자를 만들어야함
        피자 조각 2 - 10
        만약 n / slice -> 올림
        math.ceil()사용
        */
        answer = (int)Math.ceil((double)n / slice);
        return answer;
    }
}
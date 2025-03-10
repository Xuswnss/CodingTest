package Lv0.피자나눠먹기1;

class Solution {
    public int solution(int n) {
        int answer = 0;
        /* 나머지가 존재면 answer 값이 + 1 증가해야함 즉 올림을 해줘야함 ㅇ
        * 이때 (나누는 수 -1)를 더해주면 자동으로 나머지가 있을 떄 올림을 해줌*/

        answer = (n + 6 ) / 7;
        return answer;
    }
}
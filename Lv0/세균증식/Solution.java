package Lv0.세균증식;

class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        answer = n * (int) Math.pow(2,t);
        return answer;
    }

    public int solution2(int n, int t) {
        return n << t; // n * (2^t) 와 동일
        /*n << t는 n * 2^t와 동일한 결과를 만듭니다.
비트 연산은 Math.pow()보다 빠르고 효율적입니다.*/
    }
}

/*Math.pow() 의 결과는 double이므로 Int로 변환하여 정수 연산을 수행합니다.*/
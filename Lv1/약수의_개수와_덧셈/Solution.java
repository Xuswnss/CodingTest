package Lv1.약수의_개수와_덧셈;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        /*어떤 수가 제곱수이면 약수의 개수가 홀수이다.!!*/
        for (int i = left; i <= right; i++) {
            /*
            Math.sqrt(i): i의 제곱근을 구합니다.
            (int) Math.sqrt(i): 소수점을 버린 정수 값과 비교합니다.
            만약 소수점이 없다면(Math.sqrt(i)가 정수라면) → 제곱수입니다.
*/
            if(Math.sqrt(i) == (int)Math.sqrt(i)) {
                //어떤 수가 제곱수이면 약수의 개수가 홀수이다.
                answer -= i;
            }else{
                answer += i;
            }
        }

        return answer;
    }
}
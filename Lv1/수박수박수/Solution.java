package Lv1.수박수박수;

class Solution {
    public String solution(int n) {
        String answer = "";
        answer = "수박".repeat((int)Math.ceil(n / 2.0 ) ).substring(0,n);
        return answer;
    }
}
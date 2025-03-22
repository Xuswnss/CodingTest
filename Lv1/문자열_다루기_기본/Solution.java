package Lv1.문자열_다루기_기본;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        answer = (s.length() == 4 || s.length() == 6 ) && s.matches("\\d+");
        return answer;
    }
}
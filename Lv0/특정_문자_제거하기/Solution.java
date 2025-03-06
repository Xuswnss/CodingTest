package Lv0.특정_문자_제거하기;

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        answer = my_string.replace(letter, "");

        return answer;
    }
}
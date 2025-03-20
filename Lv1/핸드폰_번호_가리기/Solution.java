package Lv1.핸드폰_번호_가리기;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        String hiddenPart = "*".repeat(length-4); //'length - 4'가지 "*"를 반복
        String visiblePart = phone_number.substring(length-4);
        answer = hiddenPart + visiblePart;
        return answer;
    }
}
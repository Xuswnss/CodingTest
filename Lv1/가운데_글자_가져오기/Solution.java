package Lv1.가운데_글자_가져오기;

class Solution {
    public String solution(String s) {
        String answer = "";
        int stringLength = s.length();
        int stringMid = stringLength / 2;
        if (stringLength % 2 == 1) {
            answer = s.substring(stringMid, stringMid + 1 );
        }else{
            answer = s.substring(stringMid -1 , stringMid + 1 );
        }
        return answer;
    }
}
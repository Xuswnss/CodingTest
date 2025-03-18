package Lv1.서울에서_김서방_찾기;

import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int findIndex = 0;
        findIndex = Arrays.asList(seoul).indexOf("Kim");
        answer = "김서방은 " +findIndex+"에 있다";


        return answer;
    }
}